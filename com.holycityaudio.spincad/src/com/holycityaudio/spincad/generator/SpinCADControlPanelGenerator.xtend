/* SpinCAD Builder - DSP Development Tool for the Spin FV-1 
 * SpinCADControlPanelGenerator.xtend
 * This file supplies template code generation for the SpinCAD Control Panels.
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

import com.holycityaudio.spincad.spinCAD.Program
import com.holycityaudio.spincad.spinCAD.SpinElementimport com.holycityaudio.spincad.generator.spcbSliderLabel
import com.holycityaudio.spincad.generator.spcbCheckBox
import com.holycityaudio.spincad.generator.spcbRadioButton
import com.holycityaudio.spincad.spinCAD.SpinSliderLabel
import com.holycityaudio.spincad.spinCAD.SpinCheckBox
import com.holycityaudio.spincad.spinCAD.SpinRadioButton
import com.holycityaudio.spincad.spinCAD.SpinComboBox
import com.holycityaudio.spincad.spinCAD.SliderLabelSpinner
import com.holycityaudio.spincad.spinCAD.SpinSubdivision

class SpinCADControlPanelGenerator {
	
	
def genControlPanelCode(String blockName, Program pr) { '''
/* SpinCAD Designer - DSP Development Tool for the Spin FV-1 
 * «blockName»ControlPanel.java
 * Copyright (C) 2013 - 2026 - Gary Worsham 
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

import org.andrewkilpatrick.elmGen.ElmProgram;
import javax.swing.JDialog;
import com.holycityaudio.SpinCAD.SpinCADFrame;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ItemEvent;
import javax.swing.BoxLayout;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.Dimension;
import java.text.DecimalFormat;
import com.holycityaudio.SpinCAD.FineControlSlider;
import com.holycityaudio.SpinCAD.SpinCADBlock;
import com.holycityaudio.SpinCAD.spinCADControlPanel;
import com.holycityaudio.SpinCAD.CADBlocks.«blockName+"CADBlock"»;

@SuppressWarnings("unused")
public class «blockName+"ControlPanel"» extends spinCADControlPanel {
	private JDialog frame;
	private «blockName+"CADBlock"» gCB;
	// declare the controls
	«FOR SpinElement e : pr.elements»
		«switch e {
		SpinSliderLabel: { spcbSliderLabel.declareVar(e) }
		SliderLabelSpinner: { spcbSliderLabel.declareVar(e) }
		SpinCheckBox: { spcbCheckBox.declareVar(e) }
		SpinComboBox: { spcbComboBox.declareVar(e) }
		SpinRadioButton: { spcbRadioButton.declareVar(e) }
		SpinSubdivision: { spcbSubdivision.declareVar(e) }
	}»
	«ENDFOR»

public «blockName+"ControlPanel"»(«blockName+"CADBlock"» genericCADBlock) {
		
		gCB = genericCADBlock;

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				frame = new JDialog(SpinCADFrame.getInstance(), "«pr.name»");
				frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

			«FOR SpinElement e : pr.elements»
				«switch e {
					SpinCheckBox: { spcbCheckBox.initialize(blockName, e)}
					SpinComboBox: { spcbComboBox.initialize(blockName, e)}
					SpinSliderLabel: { spcbSliderLabel.initialize(blockName, e)}
					SliderLabelSpinner: { spcbSliderLabel.initialize(blockName, e)}
					SliderLabelCheckBox: { SliderLabelCheckBox.initialize(blockName, e)}
					SpinRadioButton: { spcbRadioButton.initialize(blockName, e) }
					SpinSubdivision: { spcbSubdivision.initialize(blockName, pr) }
				}»
			«ENDFOR»
				frame.addWindowListener(new MyWindowListener());
				frame.pack();
				frame.setResizable(false);
				frame.setLocationRelativeTo(SpinCADFrame.getInstance());
				frame.setVisible(true);		
			}
		});
		}

		// add change listener for Sliders, Spinners 
		class «blockName»Listener implements ChangeListener { 
		public void stateChanged(ChangeEvent ce) {
			«FOR SpinElement e : pr.elements»
				«switch e {
					SpinSliderLabel: { spcbSliderLabel.genChangeListener(e)}
					SliderLabelSpinner: { spcbSliderLabel.genChangeListener(e)}
					SliderLabelCheckBox: { SliderLabelCheckBox.genChangeListener(e)}
				}»
			«ENDFOR»
			}
		}

		// add item state changed listener for Checkbox
		class «blockName»ItemListener implements java.awt.event.ItemListener { 
			
		@Override
			public void itemStateChanged(ItemEvent arg0) {
			«FOR SpinElement e : pr.elements»
				«switch e {
					SpinCheckBox: { spcbCheckBox.genItemListener(e)}
				}»
			«ENDFOR»
			}
		}
		
		// add action listener for Combo Box
		class «blockName»ActionListener implements java.awt.event.ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			«FOR SpinElement e : pr.elements»
				«switch e {
					SpinComboBox: { spcbComboBox.genActionListener(e)}
					SpinSubdivision: { spcbSubdivision.genActionListener(e, pr)}
				}»
			«ENDFOR»
			}
		}
		«FOR SpinElement e : pr.elements»
			«switch e {
				SpinSliderLabel: { spcbSliderLabel.genLabelUpdater(e) }
				SliderLabelSpinner: { spcbSliderLabel.genLabelUpdater(e) }
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