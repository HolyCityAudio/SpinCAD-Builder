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
		private boolean silentGUIChange = false;	
'''}

def static initialize(String blockName, SliderLabelSpinner e) { '''

		«IF e.option != null»
			«IF e.option == "lengthToTime"»
				«e.ename»Slider = new JSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
			«ENDIF»
			«IF e.option == "LOGFREQ"»
				«e.ename»Slider = SpinCADBlock.LogFilterSlider(«e.minVal»,«e.maxVal»,gCB.get«e.ename»());
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

			SpinnerNumberModel «e.ename»SpinnerNumberModel = new SpinnerNumberModel(SpinCADBlock.filtToFreq(gCB.getfilt()) * 100, 0.51, 10000.00, 0.01);

			«e.ename»Spinner = new JSpinner(«e.ename»SpinnerNumberModel);
			JSpinner.NumberEditor editor = (JSpinner.NumberEditor)«e.ename»Spinner.getEditor();  
			DecimalFormat format = editor.getFormat();  
 			format.setMinimumFractionDigits(2);  
			format.setMaximumFractionDigits(2);  
			editor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);  
			Dimension d = «e.ename»Spinner.getPreferredSize();  
			d.width = 25;  
			«e.ename»Spinner.setPreferredSize(d);  
			
			update«e.ename»Spinner();
			«e.ename»Spinner.addChangeListener(new «blockName»Listener());
			
			JPanel topLine = new JPanel();
			topLine.setLayout(new BoxLayout(topLine, BoxLayout.X_AXIS));

			topLine.add(Box.createRigidArea(new Dimension(35,4)));			
			topLine.add(«e.ename»Label);
			topLine.add(Box.createRigidArea(new Dimension(35,4)));			
			topLine.add(«e.ename»Spinner);
			
			Border border2 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
			topLine.setBorder(border2);

			Border border1 = BorderFactory.createBevelBorder(BevelBorder.RAISED);
			JPanel innerPanel = new JPanel();
				
			innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.Y_AXIS));
			innerPanel.add(Box.createRigidArea(new Dimension(5,4)));			
			innerPanel.add(topLine);
			innerPanel.add(Box.createRigidArea(new Dimension(5,4)));			
			innerPanel.add(«e.ename»Slider);		
			innerPanel.setBorder(border1);

			frame.add(innerPanel);
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
		if(silentGUIChange == true) 
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
					silentGUIChange = true;
		«IF e.option != null»
			«IF e.option == "lengthToTime"»
			// XXX debug
				«e.ename»Spinner.setText("«e.controlName» " + String.format("%4.«e.precision»f", (1000 * gCB.get«e.ename»())/gCB.getSamplerate()));		
			«ENDIF»
			«IF e.option == "LOGFREQ"»
				«e.ename»Spinner.setValue(gCB.filtToFreq(gCB.getfilt()));
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
					silentGUIChange = false;   	    	  
				}
			}
		});
		}	
		
		private void update«e.ename»Slider() {
			SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					silentGUIChange = true;
		«IF e.option != null»
			«IF e.option == "lengthToTime"»
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
					silentGUIChange = false;   	    	  
				}
			}
		});
		}		
			
	'''
	}
}

