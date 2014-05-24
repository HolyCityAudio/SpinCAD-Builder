/**
 * generated by Xtext
 */
package com.holycityaudio.spincad.generator;

import com.holycityaudio.spincad.generator.SpinCADBlockGenerator;
import com.holycityaudio.spincad.generator.SpinCADControlPanelGenerator;
import com.holycityaudio.spincad.generator.SpinCADTestGenerator;
import com.holycityaudio.spincad.spinCAD.Program;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SpinCADGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String pkage = "/com/holycityaudio/SpinCAD/CADBlocks/";
    String _className = this.className(resource);
    String _plus = (pkage + _className);
    String _plus_1 = (_plus + "CADBlock.java");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _cADBlockCode = this.toCADBlockCode(((Program) _head));
    fsa.generateFile(_plus_1, _cADBlockCode);
    pkage = "/com/holycityaudio/SpinCAD/ControlPanel/";
    String _className_1 = this.className(resource);
    String _plus_2 = (pkage + _className_1);
    String _plus_3 = (_plus_2 + "ControlPanel.java");
    EList<EObject> _contents_1 = resource.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    CharSequence _controlPanelCode = this.toControlPanelCode(((Program) _head_1));
    fsa.generateFile(_plus_3, _controlPanelCode);
    pkage = "/com/holycityaudio/SpinCAD/test/";
    String _className_2 = this.className(resource);
    String _plus_4 = (pkage + _className_2);
    String _plus_5 = (_plus_4 + "Test.java");
    EList<EObject> _contents_2 = resource.getContents();
    EObject _head_2 = IterableExtensions.<EObject>head(_contents_2);
    CharSequence _testCode = this.toTestCode(((Program) _head_2));
    fsa.generateFile(_plus_5, _testCode);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence toCADBlockCode(final Program pr) {
    CharSequence _xblockexpression = null;
    {
      Resource _eResource = pr.eResource();
      final String blockName = this.className(_eResource);
      SpinCADBlockGenerator _spinCADBlockGenerator = new SpinCADBlockGenerator();
      SpinCADBlockGenerator boop = _spinCADBlockGenerator;
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _codeGenerate = boop.codeGenerate(blockName, pr);
      _builder.append(_codeGenerate, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence toControlPanelCode(final Program pr) {
    CharSequence _xblockexpression = null;
    {
      Resource _eResource = pr.eResource();
      final String blockName = this.className(_eResource);
      SpinCADControlPanelGenerator _spinCADControlPanelGenerator = new SpinCADControlPanelGenerator();
      SpinCADControlPanelGenerator boop = _spinCADControlPanelGenerator;
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _genControlPanelCode = boop.genControlPanelCode(blockName, pr);
      _builder.append(_genControlPanelCode, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence toTestCode(final Program pr) {
    CharSequence _xblockexpression = null;
    {
      Resource _eResource = pr.eResource();
      final String blockName = this.className(_eResource);
      SpinCADTestGenerator _spinCADTestGenerator = new SpinCADTestGenerator();
      SpinCADTestGenerator boop = _spinCADTestGenerator;
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _genTestHeader = boop.genTestHeader(blockName);
      _builder.append(_genTestHeader, "");
      _builder.newLineIfNotEmpty();
      CharSequence _testNoConnections = boop.testNoConnections(blockName);
      _builder.append(_testNoConnections, "");
      _builder.newLineIfNotEmpty();
      CharSequence _testAllConnections = boop.testAllConnections(blockName, pr);
      _builder.append(_testAllConnections, "");
      _builder.newLineIfNotEmpty();
      CharSequence _genTestCloser = boop.genTestCloser(blockName);
      _builder.append(_genTestCloser, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
