package com.holycityaudio.spincad.generator

import com.holycityaudio.spincad.spinCAD.SpinSliderLabel

class SliderLabel extends ControlPanel {

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
		«ELSE»
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
		«ENDIF»
		«e.ename»Slider.addChangeListener(new «blockName»SliderListener());
		«e.ename»Label = new JLabel();
		update«e.ename»Label();
		frame.getContentPane().add(«e.ename»Label);
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
		«ELSE»
				«e.ename»Label.setText("«e.controlName» " + String.format("%4.«e.precision»f", gCB.get«e.ename»()));		
		«ENDIF»
		}		
	'''
	}
}

