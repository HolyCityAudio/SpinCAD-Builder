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
import com.holycityaudio.spincad.spinCAD.SliderLabelSpinner

class spcbSliderLabelSpinner extends ControlPanel {

// this will generate setters and getters in the CADBlock class

def static declareVar(SliderLabelSpinner e) { '''
		JSlider «e.ename»Slider;
		JLabel  «e.ename»Label;
		JSpinner  «e.ename»Spinner;	
		private boolean «e.ename»silentGUIChange = false;	
'''}

def static initialize(String blockName, SliderLabelSpinner e) { '''

		«IF e.option != null»
			«IF e.option == "LENGTHTOTIME"»
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
			«ENDIF»
			«IF e.option == "LOGFREQ"»
			// multiplier is points per decade here
				«e.ename»Slider = SpinCADBlock.LogSlider(«e.minVal»,«e.maxVal»,gCB.get«e.ename»(), "«e.option»", «e.multiplier»);
			«ENDIF»
			«IF e.option == "DBLEVEL"»
			// dB level slider goes in steps of 1 dB
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(«e.minVal»),(int) («e.maxVal»), (int) (20 * Math.log10(gCB.get«e.ename»())));
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
			«e.ename»Slider.addChangeListener(new «blockName»Listener());
			
			«e.ename»Label = new JLabel("«e.controlName»");

			SpinnerNumberModel «e.ename»SpinnerNumberModel = new SpinnerNumberModel(SpinCADBlock.filtToFreq(gCB.get«e.ename»()) * 100, 0.51, 10000.00, 0.01);

			«e.ename»Spinner = new JSpinner(«e.ename»SpinnerNumberModel);
			JSpinner.NumberEditor «e.ename»editor = (JSpinner.NumberEditor)«e.ename»Spinner.getEditor();  
			DecimalFormat «e.ename»format = «e.ename»editor.getFormat();  
 			«e.ename»format.setMinimumFractionDigits(2);  
			«e.ename»format.setMaximumFractionDigits(2);  
			«e.ename»editor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);  
			Dimension «e.ename»d = «e.ename»Spinner.getPreferredSize();  
			«e.ename»d.width = 25;  
			«e.ename»Spinner.setPreferredSize(«e.ename»d);  
			
			update«e.ename»Spinner();
			«e.ename»Spinner.addChangeListener(new «blockName»Listener());
			
			JPanel «e.ename»topLine = new JPanel();
			«e.ename»topLine.setLayout(new BoxLayout(«e.ename»topLine, BoxLayout.X_AXIS));

			«e.ename»topLine.add(Box.createRigidArea(new Dimension(35,4)));			
			«e.ename»topLine.add(«e.ename»Label);
			«e.ename»topLine.add(Box.createRigidArea(new Dimension(35,4)));			
			«e.ename»topLine.add(«e.ename»Spinner);
			
			Border «e.ename»border2 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
			«e.ename»topLine.setBorder(«e.ename»border2);

			Border «e.ename»border1 = BorderFactory.createBevelBorder(BevelBorder.RAISED);
			JPanel «e.ename»innerPanel = new JPanel();
				
			«e.ename»innerPanel.setLayout(new BoxLayout(«e.ename»innerPanel, BoxLayout.Y_AXIS));
			«e.ename»innerPanel.add(Box.createRigidArea(new Dimension(5,4)));			
			«e.ename»innerPanel.add(«e.ename»topLine);
			«e.ename»innerPanel.add(Box.createRigidArea(new Dimension(5,4)));			
			«e.ename»innerPanel.add(«e.ename»Slider);		
			«e.ename»innerPanel.setBorder(«e.ename»border1);

			frame.add(«e.ename»innerPanel);
'''
	}
	
def static genSetterGetter(SliderLabelSpinner e) { '''
	public void set«e.ename»(double __param) {
		«IF e.option == "DBLEVEL"»
		«e.ename» = Math.pow(10.0, __param/20.0);	
		«ELSE»
		«e.ename» = __param;	
		«ENDIF»
	}

	public double get«e.ename»() {
		return «e.ename»;
	}
'''	
}
	
// this will generate the proper style of listener
// when slider moves, update the spinner
def static genChangeListener(SliderLabelSpinner e) { '''
		if(«e.ename»silentGUIChange == true) 
			return;

		if(ce.getSource() == «e.ename»Slider) {
		«IF e.option == "LOGFREQ"»
			gCB.set«e.ename»((double) gCB.freqToFilt(gCB.sliderToLogval((int)(«e.ename»Slider.getValue()), «e.multiplier»)));
		«ELSE»
			gCB.set«e.ename»((double) («e.ename»Slider.getValue()/«e.multiplier»));
		«ENDIF»
			update«e.ename»Spinner();
		}
		if(ce.getSource() == «e.ename»Spinner) {
		«IF e.option == "LOGFREQ"»
			gCB.set«e.ename»(gCB.freqToFilt((double)(«e.ename»Spinner.getValue())));
		«ELSE»
			gCB.set«e.ename»((double) («e.ename»Slider.getValue()/«e.multiplier»));
		«ENDIF»
			update«e.ename»Slider();
		}
'''
}

def static genSpinnerSliderUpdaterA(SliderLabelSpinner e) {
	'''
		private void update«e.ename»Spinner() {
			SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					«e.ename»silentGUIChange = true;
		«IF e.option != null»
			«IF e.option == "LENGTHTOTIME"»
			// XXX debug
				«e.ename»Spinner.setText("«e.controlName» " + String.format("%4.«e.precision»f", (1000 * gCB.get«e.ename»())/gCB.getSamplerate()));		
			«ENDIF»
			«IF e.option == "LOGFREQ"»
				«e.ename»Spinner.setValue(gCB.filtToFreq(gCB.get«e.ename»()));
			«ENDIF»
			«IF e.option == "SINLFOFREQ"»
			// XXX debug
				«e.ename»Spinner.setText("«e.controlName» " + String.format("%4.«e.precision»f", coeffToLFORate(gCB.get«e.ename»())));		
			«ENDIF»
			«IF e.option == "DBLEVEL"»
			// XXX debug
				«e.ename»Spinner.setText("«e.controlName» " + String.format("%4.«e.precision»f dB", (20 * Math.log10(gCB.get«e.ename»()))));		
			«ENDIF»
		«ELSE»
			// XXX debug
				«e.ename»Spinner.setText("«e.controlName» " + String.format("%4.«e.precision»f", gCB.get«e.ename»()));		
		«ENDIF»
				}
				finally {
					«e.ename»silentGUIChange = false;   	    	  
				}
			}
		});
		}	
		
		private void update«e.ename»Slider() {
			SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					«e.ename»silentGUIChange = true;
		«IF e.option != null»
			«IF e.option == "LENGTHTOTIME"»
// TBD
			«ENDIF»
			«IF e.option == "LOGFREQ"»
				«e.ename»Slider.setValue((int) (100 * Math.log10(gCB.filtToFreq(gCB.get«e.ename»()))));		
			«ENDIF»
			«IF e.option == "SINLFOFREQ"»
// TBD
			«ENDIF»
			«IF e.option == "DBLEVEL"»
// TBD
			«ENDIF»
		«ELSE»
// TBD
		«ENDIF»
				}
				finally {
					«e.ename»silentGUIChange = false;   	    	  
				}
			}
		});
		}		
			
	'''
	}
}

