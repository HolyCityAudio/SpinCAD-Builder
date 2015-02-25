/* SpinCAD Builder - DSP Development Tool for the Spin FV-1 
 * RadioButton.xtend
 * This file supplies template code generation for the RadioButton data type.
 * This turns into a Java Swing RadioButton in a Control Panel.
 * 
 * Copyright (C)2015 - Gary Worsham 
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

class RadioButton extends ControlPanel {

// creates variable in CADBlock
// may not want to actually do this in practice
def static declareVar(RadioButton e) { '''
		JRadioButton «e.ename»RadioButton;
'''}

// this will generate setters and getters in the CADBlock class

def static genSetterGetter(RadioButton b) { '''
	public void set«b.ename»(boolean __param) {
		«b.ename» = __param;	
	}

	public boolean get«b.ename»() {
		return «b.ename»;
	}
'''	
}
	
// this will generate the proper style of listener
def static genItemListener(RadioButton b) { '''
		if(ce.getSource() == «b.ename»CheckBox) {
			gCB.set«b.ename»((boolean) («b.ename»CheckBox.isSelected()));
		}
'''
}

def static initialize(String blockName, RadioButton b) { '''
		«b.ename»CheckBox = new JCheckBox();
		«b.ename»CheckBox.setText("«b.controlName»");
		«b.ename»CheckBox.addItemListener(new «blockName»ItemListener());
		frame.getContentPane().add(«b.ename»CheckBox);		
		// add class code for RadioButton handler
		class «blockName» extends JPanel implements ActionListener {
		private static final long serialVersionUID = -507133930408340822L;
		JRadioButton lfo0 = new JRadioButton("LFO 0");
		JRadioButton lfo1 = new JRadioButton("LFO 1");

		public LFORadioButtons() {
			super(new BorderLayout());

			lfo0.setActionCommand("LFO 0");
			lfo1.setActionCommand("LFO 1");

			if(pC.getLFOSel() == 0)
				lfo0.setSelected(true);
			else if(pC.getLFOSel() == 1)
				lfo1.setSelected(true);

			//Group the radio buttons.
			ButtonGroup group = new ButtonGroup();
			group.add(lfo0);
			group.add(lfo1);

			//Register a listener for the radio buttons.
			lfo0.addActionListener(this);
			lfo1.addActionListener(this);

			JPanel radioPanel = new JPanel(new GridLayout(1, 2));
			radioPanel.add(lfo0);
			radioPanel.add(lfo1);
			lfo1.setAlignmentY(SwingConstants.CENTER);
			add(radioPanel, BorderLayout.LINE_START);
		}
			
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			
		}
	}
'''
	}
}

