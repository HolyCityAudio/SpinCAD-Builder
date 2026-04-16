# SpinCAD-Builder

Eclipse-based Xtext/Xtend DSL project that generates Java source for the
sister project **SpinCAD-Designer** (at `C:\Users\garyw\git\SpinCAD-Designer`).
Two parallel DSLs live here:

- **SpinCAD** — `.spincad` files describe DSP blocks (pins, equates, FV-1
  instructions, UI controls). Generates `<Name>CADBlock.java` and
  `<Name>ControlPanel.java`.
- **SpinCADMenu** — `.spincadmenu` files organize blocks into menus.
  Generates `standardMenu.java`.

Generated Java lands in Designer's `src-gen/com/holycityaudio/SpinCAD/{CADBlocks,ControlPanel}/`
and `src-gen/com/holycityaudio/SpinCAD/standardMenu.java`.

## Build & Workflow

This is a **pure Eclipse PDE project** — no Gradle, no Maven. Everything runs
through the Eclipse IDE.

### Day-to-day change loop

1. Edit `.xtend` generator or `.xtext` grammar
2. If grammar changed: right-click `.mwe2` → **Run As → MWE2 Workflow**
   (regenerates ANTLR parser/lexer into `src-gen/`)
3. Launch **Runtime Eclipse** (Run → Eclipse Application) so the updated
   generator bundle is loaded
4. In the Designer workspace of the Runtime Eclipse: **Project → Clean**
   to trigger `IGenerator.doGenerate()` and emit `.java` files
5. Build/test Designer as usual

### Gotcha: stale generator bundle

If Designer regen produces unchanged output after editing `.xtend`, the most
common cause is that Runtime Eclipse was launched before the generator
recompiled. Close Runtime Eclipse, confirm the `xtend-gen/` timestamps are
newer than your source, relaunch, then Project → Clean.

## Repository Layout

Each DSL ships as four OSGI bundles:

| Bundle | Purpose |
|--------|---------|
| `com.holycityaudio.spincad` | Runtime plugin — grammar + generator |
| `com.holycityaudio.spincad.ui` | Eclipse editor — content assist, outline, highlighting |
| `com.holycityaudio.spincad.sdk` | Feature bundle packaging runtime + UI |
| `com.holycityaudio.spincad.tests` | JUnit/Xtext test project (currently empty — no tests) |

The `spincadmenu` family mirrors this structure for the menu DSL.

## Grammar Files

### `com.holycityaudio.spincad/src/com/holycityaudio/spincad/SpinCAD.xtext`

Top-level `Program` rule:

```
Program:
    '@name' name=...
    ('@color' color=STRING)?
    (pins+=Pin)+
    (elements+=SpinElement)+
```

**Pins:** `@audioInput`, `@audioOutput`, `@controlInput`, `@controlOutput`.

**SpinElement** is a union of: `SpinInt`, `SpinEquate`, `SpinBool`, `Mem`,
`Instruction`, `Label`, `Comment`, `Macro`, `Offset`, and `Control`.

**Controls** (UI widgets rendered on the block's control panel):
`SpinSliderLabel`, `SliderLabelSpinner`, `SliderLabelCheckBox`,
`LogFreqSliderLabel`, `LogFreq2SliderLabel`, `SpinCheckBox`,
`SpinRadioButton`, `SpinComboBox`, `SpinSubdivision`.

**Macro keywords** (directives expanded at code-gen time):
`@isPinConnected`, `@isTrue`, `@else`, `@endif`, `@isGreaterThan`,
`@isLessThan`, `@isEqualTo`, `@isOr`, `@getInputDefault`,
`@setOutputPin`, `@getBaseAddress`, `@readChorusTap`, `@setChorusWidth`,
`@getDelayScaleControl`, `@getSamplesFromRatio`, `@semitonesToRmpRate`,
`@semitonesToWldrRate`, `@ratioToLogOffset`, `@log2Double`, `@powDouble`,
`@equals`, `@equalsBool`, `@minusDouble`, `@divideDouble`, `@divideInt`,
`@multiplyDouble`.

**Instructions:** FV-1 assembly (`rdax`, `wrax`, `mulx`, `ldax`, `rda`,
`wra`, `sof`, etc.) plus special forms `Skip` (references a `Label`),
`Jam`, and chorus ops (`cho rda`, `cho rdal`, `cho sof`).

### `com.holycityaudio.spincadmenu/src/com/holycityaudio/spincadmenu/SpinCADMenu.xtext`

Much simpler. Top-level rule: `Menu: (elements+=Element)*`. Elements are
`@menu` (section), `@menuitem` (block reference), `@testItem` (legacy).

## Generator Files

All in `com.holycityaudio.spincad/src/com/holycityaudio/spincad/generator/`.

### Entry point

**`SpinCADGenerator.xtend`** — implements `IGenerator`. `doGenerate()`
dispatches each `Program` AST to:
- `SpinCADBlockGenerator` → produces `<Name>CADBlock.java`
- `SpinCADControlPanelGenerator` → produces `<Name>ControlPanel.java`

### Block generator

**`SpinCADBlockGenerator.xtend`** (~490 lines) orchestrates full DSP-block
code generation. Uses Xtend `switch` on element type to dispatch each
SpinElement to the right template. Delegates UI control rendering to the
`spcb*` helper classes.

### Control panel generator

**`SpinCADControlPanelGenerator.xtend`** emits the Swing control-panel class
(JDialog / JFrame, sliders, text fields, listeners, layout). Iterates
`Control` elements and calls each helper class's `initialize()` /
`genChangeListener()` / `genLabelUpdater()`.

### Helper classes (one per control type)

| File | Responsibility |
|------|----------------|
| `spcbSliderLabel.xtend` | `SpinSliderLabel` and `SliderLabelSpinner` (see duplication warning below) |
| `spcbCheckBox.xtend` | Boolean checkbox |
| `spcbComboBox.xtend` | Dropdown (2–6 options) |
| `spcbRadioButton.xtend` | Radio button group |
| `spcbSubdivision.xtend` | Tempo-subdivision snap dropdown tied to a SUBDIVISION slider |
| `spcbEquate.xtend` | `equ` (numeric constant / register allocation) |
| `spcbBool.xtend` | Boolean variable |

**`ControlPanel.xtend`** and **`BlockVariable.xtend`** are vestigial base
classes — extended for type identity only, fields unused.

### Menu generator

**`SpinCADMenuGenerator.xtend`** (in the spincadmenu project) emits
`standardMenu.java` — a Swing `JMenuBar` populated with `JMenuItem`s whose
action listeners instantiate the corresponding `<Name>CADBlock` and drop
it onto the canvas. The generator imports block classes **by name**, so
renaming a block in `.spincad` without updating `.spincadmenu` produces a
compile error in the generated menu.

## Slider Unit Transforms

`@sliderLabel` accepts a mode keyword that controls the Hz/dB/ms display
and how stored values map to slider positions. All modes live in
`spcbSliderLabel.xtend` (and its twin `spcbSliderLabelSpinner.xtend`).

| Mode | Stored value | Displayed | Notes |
|------|--------------|-----------|-------|
| `LINEAR` | raw / multiplier | raw / multiplier | Default scaling |
| `LOGFREQ` | 1-pole filter coeff | Hz | Uses `freqToFilt()` / `filtToFreq()` |
| `LOGFREQ2` | 2-pole SVF coeff | Hz | Uses `freqToFiltSVF()` / `filtToFreqSVF()` |
| `QFACTOR` | `1/Q` | `Q` | Log-scaled; stored value is reciprocal |
| `FILTTOTIME` | filter coeff | ms | Time-domain decay |
| `LENGTHTOTIME` | sample count | ms | Scaled by sample rate |
| `DBLEVEL` | linear amplitude | dB | Multiplier = steps per dB |
| `SINLFOFREQ` | LFO coefficient | Hz | Sine LFO rate transform |
| `RAMPLFOFREQ` | LFO coefficient | Hz | Ramp LFO rate transform |
| `BOOSTCUT` | direct | ±dB | Unscaled gain cut/boost |
| `SUBDIVISION` | grid index 0–4 | text label | Snap-to-grid (None, 1/8, 1/6, 1/4, 1/3) |

**Multiplier semantics vary by mode:**
- `LOGFREQ*` / `QFACTOR`: points per decade (slider pos = `mult * log10(value)`)
- `DBLEVEL`: slider steps per dB
- `LINEAR` / others: plain scaling factor

To add a new mode: edit `spcbSliderLabel.xtend` in **all four** methods
(`initialize`, `genChangeListener`, `genLabelUpdater`, text-field parser)
AND the twin methods in the `SliderLabelSpinner` branch — see duplication
warning below. Also add the matching `case` in
`SpinCAD-Designer/src/com/holycityaudio/SpinCAD/SpinCADBlock.java::LogSlider()`.

## Implicit API Contract with Designer

The generator emits calls to these static/instance methods on Designer's
`SpinCADBlock`. Changing any signature in Designer silently breaks
generated output at the next Clean:

- `SpinCADBlock.LogSlider(minVal, maxVal, currentVal, mode, multiplier)`
- `SpinCADBlock.logvalToSlider(value, multiplier)` / `sliderToLogval(pos, mult)`
- `SpinCADBlock.freqToFilt` / `filtToFreq` / `freqToFiltSVF` / `filtToFreqSVF`
- `SpinCADBlock.timeToFilt` / `filtToTime`

If you add a new slider mode here, the matching helper in Designer's
`SpinCADBlock.java` must land in the same PR — the regen will fail to
compile otherwise.

## Non-Obvious Gotchas

1. **`spcbSliderLabel.xtend` is duplicated.** ~250 lines of near-identical
   logic handle `SpinSliderLabel` (lines 31–172) and `SliderLabelSpinner`
   (lines 255–396). Neither inherits the other. Every mode change must be
   applied to **both** branches — easy to miss one and produce spinner
   behavior that diverges from slider behavior.

2. **Skip-offset bug with `@isPinConnected`.** The generator emits `skp`
   offsets in a single pass that doesn't account for instructions added
   or removed by `@isPinConnected` / `@else` / `@endif` blocks. Result:
   runtime jumps past the wrong instruction. For any block that needs
   conditional skips, write the `skp` via the Java API in a hand-written
   block instead of using `.spincad` `skp`.

3. **`skp` in `.spincad` requires a label, not a numeric offset.** The
   grammar's `Skip` rule takes a `Label` reference — numeric offsets are
   not valid DSL syntax. If you need a computed offset, fall back to the
   Java API.

4. **`@isPinConnected Foo` with typos fails silently.** The generator does
   not validate that the pin name exists. You get a generated Java file
   with an `if (Foo == null)` clause referencing a non-existent pin, which
   fails at a different layer.

5. **`@setOutputPin` requires the pin label to match exactly.** Pin name
   capitalization must match the `@audioOutput` declaration.

6. **Color literal is unquoted in generated code.** `@color "0x24f224"` —
   the STRING token includes quotes, but
   `setBorderColor(new Color(«pr.color»))` emits it verbatim. Existing
   `.spincad` files get away with this because the generator strips
   quotes internally; if you touch the `color` emission path, preserve
   the unquoting.

7. **No tests.** Both `*.tests` bundles have empty `src/`. Dead test
   scaffolding exists (`toTestCode()` commented out in `SpinCADGenerator`;
   stub `genTestItem()` in `SpinCADMenuGenerator`). Manual verification
   only: regenerate, then run Designer's `AllBlocksCodeGenTest` against
   the output.

8. **Template-string indentation matters.** Xtend's `'''…'''` template
   literals include their own leading whitespace. A stray extra indent in
   a template line shows up as stray spaces in generated Java. Diff
   generated output after any template edit.

9. **Grammar edits require MWE2 + full Eclipse restart** (or at least a
   Runtime Eclipse restart). Xtend edits only need Runtime Eclipse
   restart. Skipping the restart is the most common cause of "my change
   doesn't seem to apply."

10. **`@else` only works inside `@isPinConnected` (and siblings).** The
    grammar supports it for the conditional-macro family; do not expect
    it to compose with arbitrary instructions.

## Known Legacy / Dead Code

- `SpinCADGenerator.xtend` line ~44: `toTestCode()` call commented out
- `SpinCADMenuGenerator.xtend` lines ~50, 109–177: `toTestCases()` /
  `genTestItem()` stubs
- `SpinCADBlockGenerator.xtend` line ~224: "TODO add a line for Bool here"
- Both `.tests` bundles: empty test source folders
- `ControlPanel.xtend` and `BlockVariable.xtend` base classes are
  instantiated but their fields are never used

## Where to look first

- Adding a new slider unit mode → `spcbSliderLabel.xtend` (+ mirror in
  SliderLabelSpinner branch), and `SpinCADBlock.LogSlider` in Designer
- Adding a new control widget type → add grammar rule in `SpinCAD.xtext`,
  MWE2, then new `spcb*.xtend` helper, then wire into
  `SpinCADControlPanelGenerator.doGenerate()`
- Adding a new macro directive → `SpinCAD.xtext` grammar + dispatch in
  `SpinCADBlockGenerator.xtend` `generateCode()` switch
- Menu reorganization → edit `.spincadmenu` file in Designer's
  `src/SpinCADBuilder/`, then Project → Clean
