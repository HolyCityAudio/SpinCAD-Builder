/* SpinCAD Builder - DSP Development Tool for the Spin FV-1 
 * spcbComboBox.xtend
 * This file supplies template code generation for the ComboBox data type.
 * This turns into a Java Swing ComboBox in a Control Panel.
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

import com.holycityaudio.spincad.spinCAD.SpinComboBox

class spcbComboBox extends ControlPanel {

// creates variable in CADBlock
// may not want to actually do this in practice
def static declareVar(SpinComboBox e) { '''
private JComboBox <String> «e.ename»ComboBox; 
'''}

// this will generate setters and getters in the CADBlock class
// For a ComboBox, we either set or get the index, or perhaps by the label?

def static genSetterGetter(SpinComboBox b) { '''
	public void set«b.ename»(int __param) {
		«b.ename» = (double) __param;	
	}

	public int get«b.ename»() {
		return (int) «b.ename»;
	}
'''	
}
	
// this will generate the proper style of listener
def static genActionListener(SpinComboBox b) { '''
		if(arg0.getSource() == «b.ename»ComboBox) {
			gCB.set«b.ename»((«b.ename»ComboBox.getSelectedIndex()));
		}
'''
}

def static initialize(String blockName, SpinComboBox b) { '''
			«b.ename»ComboBox = new JComboBox <String> ();
			«b.ename»ComboBox.addItem("«b.optiona»");
			«b.ename»ComboBox.addItem("«b.optionb»");
		«IF b.optionc != null»	
			«b.ename»ComboBox.addItem("«b.optionc»");
		«ENDIF»
		«IF b.optiond != null»	
			«b.ename»ComboBox.addItem("«b.optiond»");
		«ENDIF»
		«IF b.optione != null»	
			«b.ename»ComboBox.addItem("«b.optione»");
		«ENDIF»
		«IF b.optionf != null»	
			«b.ename»ComboBox.addItem("«b.optionf»");
		«ENDIF»
			«b.ename»ComboBox.setSelectedIndex(gCB.get«b.ename»());
			frame.add(Box.createRigidArea(new Dimension(5,8)));			
			frame.getContentPane().add(«b.ename»ComboBox);
			«b.ename»ComboBox.addActionListener(new «blockName»ActionListener());
'''
	}
}

