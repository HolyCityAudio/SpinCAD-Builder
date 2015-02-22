/* SpinCAD Builder - DSP Development Tool for the Spin FV-1 
 * SpinCADControlPanelGenerator.xtend
 * This file supplies template code generation for the SpinCAD Control Panels.
 * 
 * Copyright (C) 2015 - Gary Worsham 
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

import com.holycityaudio.spincad.spinCAD.Program
import com.holycityaudio.spincad.spinCAD.SpinElementimport com.holycityaudio.spincad.generator.SliderLabel
import com.holycityaudio.spincad.generator.CheckBox
import com.holycityaudio.spincad.generator.RadioButton
import com.holycityaudio.spincad.spinCAD.SpinSliderLabel
import com.holycityaudio.spincad.spinCAD.SpinCheckBox
import com.holycityaudio.spincad.spinCAD.SpinRadioButton
import com.holycityaudio.spincad.spinCAD.SpinSliderLabelCheckBox

class SpinCADControlPanelGenerator {
	
	
def genControlPanelCode(String blockName, Program pr) { '''
/* SpinCAD Designer - DSP Development Tool for the Spin FV-1 
 * «blockName»ControlPanel.java
 * Copyright (C) 2015 - Gary Worsham 
 * Based on ElmGen by Andrew Kilpatrick 
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
		package com.holycityaudio.SpinCAD.ControlPanel;
		import javax.swing.JFrame;
		import javax.swing.SwingUtilities;
		import javax.swing.event.ChangeEvent;
		import javax.swing.event.ChangeListener;
		import java.awt.event.WindowEvent;
		import java.awt.event.WindowListener;
		import java.awt.event.ItemEvent;
		import javax.swing.BoxLayout;
		import javax.swing.JSlider;
		import javax.swing.JLabel;
		import javax.swing.JCheckBox;
		
		import com.holycityaudio.SpinCAD.spinCADControlPanel;
		import com.holycityaudio.SpinCAD.CADBlocks.«blockName+"CADBlock"»;

		public class «blockName+"ControlPanel"» extends spinCADControlPanel {
		private JFrame frame;

		private «blockName+"CADBlock"» gCB;
		// declare the controls
			«FOR SpinElement e : pr.elements»
				«switch e {
					SpinSliderLabel: { SliderLabel.declareVar(e) }
					SpinCheckBox: { CheckBox.declareVar(e) }
					SpinRadioButton: { RadioButton.declareVar(e) }
				}»
			«ENDFOR»

		public «blockName+"ControlPanel"»(«blockName+"CADBlock"» genericCADBlock) {
		
		gCB = genericCADBlock;

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				frame = new JFrame();
				frame.setTitle("«pr.name»");
				frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

			«FOR SpinElement e : pr.elements»
				«switch e {
					SpinCheckBox: { CheckBox.initialize(blockName, e)}
					SpinSliderLabel: { SliderLabel.initialize(blockName, e)}
					SpinSliderLabelCheckBox: { SliderLabelCheckBox.initialize(blockName, e)}
					SpinRadioButton: { RadioButton.initialize(blockName, e) }
				}»
			«ENDFOR»
				frame.addWindowListener(new MyWindowListener());
				frame.setVisible(true);		
				frame.pack();
				frame.setResizable(false);
				frame.setLocation(gCB.getX() + 100, gCB.getY() + 100);
				frame.setAlwaysOnTop(true);
			}
		});
		}

		// add change listener for Sliders 
		class «blockName»SliderListener implements ChangeListener { 
		public void stateChanged(ChangeEvent ce) {
			«FOR SpinElement e : pr.elements»
				«switch e {
					SpinSliderLabel: { SliderLabel.genChangeListener(e)}
					SpinSliderLabelCheckBox: { SliderLabelCheckBox.genChangeListener(e)}
				}»
			«ENDFOR»
			}
		}

		// add item listener 
		class «blockName»ItemListener implements java.awt.event.ItemListener { 
		public void stateChanged(ChangeEvent ce) {
			«FOR SpinElement e : pr.elements»
				«switch e {
					SpinCheckBox: { CheckBox.genItemListener(e)}
				}»
			«ENDFOR»
			}

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
			}
		}
		«FOR SpinElement e : pr.elements»
			«switch e {
				SpinSliderLabel: { SliderLabel.genLabelUpdater(e)}
			}»
		«ENDFOR»
		
		class MyWindowListener implements WindowListener
		{
		@Override
			public void windowActivated(WindowEvent arg0) {
			}

		@Override
			public void windowClosed(WindowEvent arg0) {
			}

		@Override
			public void windowClosing(WindowEvent arg0) {
				gCB.clearCP();
			}

		@Override
			public void windowDeactivated(WindowEvent arg0) {
			}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
		}

		@Override
		public void windowIconified(WindowEvent arg0) {

		}

			@Override
			public void windowOpened(WindowEvent arg0) {
			}
		}
		
	}
	'''
	}	
}