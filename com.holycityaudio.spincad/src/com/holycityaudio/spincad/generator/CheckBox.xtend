/* SpinCAD Builder - DSP Development Tool for the Spin FV-1 
 * CheckBox.xtend
 * This file supplies template code generation for the CheckBox data type.
 * This turns into a Java Swing Checkbox in a Control Panel.
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

import com.holycityaudio.spincad.spinCAD.SpinCheckBox

class CheckBox extends ControlPanel {

// creates variable in CADBlock
// may not want to actually do this in practice
def static declareVar(SpinCheckBox e) { '''
		JCheckBox «e.ename»CheckBox;
'''}

// this will generate setters and getters in the CADBlock class

def static genSetterGetter(SpinCheckBox b) { '''
	public void set«b.ename»(boolean __param) {
		«b.ename» = __param;	
	}

	public boolean get«b.ename»() {
		return «b.ename»;
	}
'''	
}
	
// this will generate the proper style of listener
def static genItemListener(SpinCheckBox b) { '''
		if(ce.getSource() == «b.ename»CheckBox) {
			gCB.set«b.ename»((boolean) («b.ename»CheckBox.isSelected()));
		}
'''
}

def static initialize(String blockName, SpinCheckBox b) { '''
		«b.ename»CheckBox = new JCheckBox();
		«b.ename»CheckBox.setText("«b.controlName»");
		«b.ename»CheckBox.addItemListener(new «blockName»ItemListener());
		frame.getContentPane().add(«b.ename»CheckBox);		
'''
	}
}

