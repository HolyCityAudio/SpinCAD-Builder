/* SpinCAD Builder - DSP Development Tool for the Spin FV-1 
 * Bool.xtend
 * This file supplies template code generation for the SliderLabel data type.
 * This turns into a Java Swing JSlider with an associated JLabel.
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

import com.holycityaudio.spincad.spinCAD.SpinSliderLabel

class spcbSliderLabel extends ControlPanel {

// this will generate setters and getters in the CADBlock class

def static declareVar(SpinSliderLabel e) { '''
		JSlider «e.ename»Slider;
		JLabel  «e.ename»Label;	
'''}

def static initialize(String blockName, SpinSliderLabel e) { '''

		«IF e.option != null»
			«IF e.option == "lengthToTime"»
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
			«ENDIF»
			«IF e.option == "LOGFREQ"»
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(Math.log10(«e.minVal») * 100.0),(int) (Math.log10(«e.maxVal») * 100.0), (int) (Math.log10(gCB.get«e.ename»()) * 100));
			«ENDIF»
			«IF e.option == "LINEAR"»
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "SINLFOFREQ"»
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "RAMPLFOFREQ"»
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "BOOSTCUT"»
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
		«ELSE»
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
		«ENDIF»
			«e.ename»Slider.addChangeListener(new «blockName»SliderListener());
			«e.ename»Label = new JLabel();
			update«e.ename»Label();
			frame.add(Box.createRigidArea(new Dimension(5,4)));			
			frame.getContentPane().add(«e.ename»Label);
			frame.add(Box.createRigidArea(new Dimension(5,4)));			
			frame.getContentPane().add(«e.ename»Slider);		
'''
	}
	
def static genSetterGetter(SpinSliderLabel e) { '''
	public void set«e.ename»(double __param) {
		«e.ename» = __param;	
	}

	public double get«e.ename»() {
		return «e.ename»;
	}
'''	
}
	
// this will generate the proper style of listener
def static genChangeListener(SpinSliderLabel e) { '''
		if(ce.getSource() == «e.ename»Slider) {
			gCB.set«e.ename»((double) («e.ename»Slider.getValue()/«e.multiplier»));
			update«e.ename»Label();
		}
'''
}

def static genLabelUpdater(SpinSliderLabel e) {
	'''
		private void update«e.ename»Label() {
		«IF e.option != null»
			«IF e.option == "lengthToTime"»
				«e.ename»Label.setText("«e.controlName» " + String.format("%4.«e.precision»f", (1000 * gCB.get«e.ename»())/gCB.getSamplerate()));		
			«ENDIF»
			«IF e.option == "LOGFREQ"»
				«e.ename»Label.setText("«e.controlName» " + String.format("%4.«e.precision»f", Math.pow(10.0, gCB.get«e.ename»())) + " Hz");		
			«ENDIF»
			«IF e.option == "SINLFOFREQ"»
				«e.ename»Label.setText("«e.controlName» " + String.format("%4.«e.precision»f", coeffToLFORate(gCB.get«e.ename»())));		
			«ENDIF»
		«ELSE»
				«e.ename»Label.setText("«e.controlName» " + String.format("%4.«e.precision»f", gCB.get«e.ename»()));		
		«ENDIF»
		}		
	'''
	}
}

