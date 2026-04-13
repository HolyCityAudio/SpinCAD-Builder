/* SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * spcbSubdivision.xtend
 * This file supplies template code generation for the Subdivision combo box.
 * When present, a single "Subdivision" dropdown is added to the control panel
 * that sets tick spacing and snap-to-ticks on all SUBDIVISION-tagged sliders.
 *
 * Copyright (C) 2013 - 2026 - Gary Worsham
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.holycityaudio.spincad.generator

import com.holycityaudio.spincad.spinCAD.SpinSubdivision
import com.holycityaudio.spincad.spinCAD.Program
import com.holycityaudio.spincad.spinCAD.SpinSliderLabel

class spcbSubdivision extends ControlPanel {

	// snap steps in slider integer units (multiplier 6000):
	// None=0, 1/8=750, 1/6=1000, 1/4=1500, 1/3=2000
	static val int[] SNAP_STEPS = #[0, 750, 1000, 1500, 2000]

	def static declareVar(SpinSubdivision s) { '''
		private JComboBox<String> subdivisionComboBox;
	'''}

	// generates variable declaration in the CADBlock class
	def static declareBlockVar(SpinSubdivision s) { '''
		private double subdivision = 0.0;
	'''}

	def static genSetterGetter(SpinSubdivision s) { '''
		public void setsubdivision(int __param) {
			subdivision = (double) __param;
		}

		public int getsubdivision() {
			return (int) subdivision;
		}
	'''}

	// Place @subdivision AFTER ratio sliders in the .spincad file so
	// all SUBDIVISION sliders exist before this init code runs.
	def static initialize(String blockName, Program pr) { '''
			subdivisionComboBox = new JComboBox<>(new String[]{"None", "1/8", "1/6", "1/4", "1/3"});
			subdivisionComboBox.setSelectedIndex(gCB.getsubdivision());
			subdivisionComboBox.addActionListener(new «blockName»ActionListener());

			Border subdivisionBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED);
			JPanel subdivisionPanel = new JPanel();
			subdivisionPanel.setLayout(new BoxLayout(subdivisionPanel, BoxLayout.Y_AXIS));
			JTextField subdivisionLabel = new JTextField("Subdivision");
			subdivisionLabel.setHorizontalAlignment(JTextField.CENTER);
			subdivisionLabel.setEditable(false);
			Border subdivisionLabelBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
			subdivisionLabel.setBorder(subdivisionLabelBorder);
			subdivisionPanel.add(Box.createRigidArea(new Dimension(5,4)));
			subdivisionPanel.add(subdivisionLabel);
			subdivisionPanel.add(Box.createRigidArea(new Dimension(5,4)));
			subdivisionPanel.add(subdivisionComboBox);
			subdivisionPanel.setBorder(subdivisionBorder);
			frame.add(subdivisionPanel);

			// restore saved subdivision state on all SUBDIVISION sliders
			{
				int[] subdivisionSteps = {0, 750, 1000, 1500, 2000};
				int savedStep = subdivisionSteps[gCB.getsubdivision()];
				«FOR e2 : pr.elements»
				«IF e2 instanceof SpinSliderLabel»
				«IF (e2 as SpinSliderLabel).option != null && (e2 as SpinSliderLabel).option == "SUBDIVISION"»
				«(e2 as SpinSliderLabel).ename»Slider.setSubdivision(savedStep);
				«ENDIF»
				«ENDIF»
				«ENDFOR»
			}
	'''}

	def static genActionListener(SpinSubdivision s, Program pr) { '''
		if(arg0.getSource() == subdivisionComboBox) {
			int idx = subdivisionComboBox.getSelectedIndex();
			gCB.setsubdivision(idx);
			int[] subdivisionSteps = {0, 750, 1000, 1500, 2000};
			int step = subdivisionSteps[idx];
			«FOR e2 : pr.elements»
			«IF e2 instanceof SpinSliderLabel»
			«IF (e2 as SpinSliderLabel).option != null && (e2 as SpinSliderLabel).option == "SUBDIVISION"»
			«(e2 as SpinSliderLabel).ename»Slider.setSubdivision(step);
			«ENDIF»
			«ENDIF»
			«ENDFOR»
		}
	'''}
}
