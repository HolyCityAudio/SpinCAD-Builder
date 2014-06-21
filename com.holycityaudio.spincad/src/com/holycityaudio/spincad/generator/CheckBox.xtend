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

