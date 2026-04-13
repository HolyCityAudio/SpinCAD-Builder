/* SpinCAD Builder - DSP Development Tool for the Spin FV-1 
 * Bool.xtend
 * This file supplies template code generation for the SliderLabel data type.
 * This turns into a Java Swing JSlider with an associated JLabel.
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

import com.holycityaudio.spincad.spinCAD.SpinSliderLabel
import com.holycityaudio.spincad.spinCAD.SliderLabelSpinner

class spcbSliderLabel extends ControlPanel {

// this will generate setters and getters in the CADBlock class

def static declareVar(SpinSliderLabel e) { '''
		FineControlSlider «e.ename»Slider;
		JTextField  «e.ename»Field;
'''}

def static initialize(String blockName, SpinSliderLabel e) { '''
//
// these functions translate between slider values, which have to be integers, to whatever in program value you wish.
//
		«IF e.option != null»
			«IF e.option == "LENGTHTOTIME"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
			«ENDIF»
			«IF e.option == "FILTTOTIME"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (SpinCADBlock.filtToTime(gCB.get«e.ename»()) * 1000 * «e.multiplier»));
			«ENDIF»			
			//---------------------------------------------
			// LOGFREQ is used for single pole filters
			«IF e.option == "LOGFREQ"»
			// multiplier is points per decade here
				«e.ename»Slider = SpinCADBlock.LogSlider(«e.minVal»,«e.maxVal»,gCB.get«e.ename»(), "«e.option»", «e.multiplier»);
			«ENDIF»
			//---------------------------------------------
			// LOGFREQ2 is used for 2-pole SVF
			«IF e.option == "LOGFREQ2"»
			// multiplier is points per decade here
				«e.ename»Slider = SpinCADBlock.LogSlider(«e.minVal»,«e.maxVal»,gCB.get«e.ename»(), "«e.option»", «e.multiplier»);
			«ENDIF»
			// ---------------------------------------------						
			«IF e.option == "DBLEVEL"»
			// dB level slider: multiplier sets steps per dB (e.g. 10 = 0.1 dB steps)
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (20 * Math.log10(gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "LINEAR"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "SINLFOFREQ"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "RAMPLFOFREQ"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "BOOSTCUT"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "SUBDIVISION"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
			«ENDIF»
		«ELSE»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
		«ENDIF»
			«e.ename»Slider.addChangeListener(new «blockName»Listener());
			«e.ename»Field = new JTextField();
			«e.ename»Field.setHorizontalAlignment(JTextField.CENTER);
			Border «e.ename»Border1 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
			«e.ename»Field.setBorder(«e.ename»Border1);
			«e.ename»Field.addActionListener(new java.awt.event.ActionListener() {
				@Override
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try {
						double val = Double.parseDouble(«e.ename»Field.getText().replaceAll("[^0-9.\\-]", ""));
			«IF e.option != null»
				«IF e.option == "LOGFREQ"»
						int sliderVal = SpinCADBlock.logvalToSlider(val, «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»(SpinCADBlock.freqToFilt(SpinCADBlock.sliderToLogval(sliderVal, «e.multiplier»)));
				«ELSEIF e.option == "LOGFREQ2"»
						int sliderVal = SpinCADBlock.logvalToSlider(val, «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»(SpinCADBlock.freqToFiltSVF(SpinCADBlock.sliderToLogval(sliderVal, «e.multiplier»)));
				«ELSEIF e.option == "LENGTHTOTIME"»
						double samples = val * ElmProgram.getSamplerate() / 1000.0;
						int sliderVal = (int) Math.round(samples * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»((double) sliderVal / «e.multiplier»);
				«ELSEIF e.option == "FILTTOTIME"»
						double filt = SpinCADBlock.timeToFilt(val / 1000.0);
						int sliderVal = (int) Math.round(val * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»(filt);
				«ELSEIF e.option == "SINLFOFREQ"»
						double coeff = val * 2.0 * Math.PI * Math.pow(2.0, 17) / (ElmProgram.getSamplerate() * 511.0);
						int sliderVal = (int) Math.round(coeff * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»((double) sliderVal / «e.multiplier»);
				«ELSEIF e.option == "DBLEVEL"»
						int sliderVal = (int) Math.round(val * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»((double) sliderVal / «e.multiplier»);
				«ELSE»
						int sliderVal = (int) Math.round(val * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»((double) sliderVal / «e.multiplier»);
				«ENDIF»
			«ELSE»
						int sliderVal = (int) Math.round(val * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»((double) sliderVal / «e.multiplier»);
			«ENDIF»
						update«e.ename»Label();
					} catch (NumberFormatException ex) {
						update«e.ename»Label();
					}
				}
			});
			update«e.ename»Label();

			Border «e.ename»border2 = BorderFactory.createBevelBorder(BevelBorder.RAISED);
			JPanel «e.ename»innerPanel = new JPanel();

			«e.ename»innerPanel.setLayout(new BoxLayout(«e.ename»innerPanel, BoxLayout.Y_AXIS));
			«e.ename»innerPanel.add(Box.createRigidArea(new Dimension(5,4)));
			«e.ename»innerPanel.add(«e.ename»Field);
			«e.ename»innerPanel.add(Box.createRigidArea(new Dimension(5,4)));
			«e.ename»innerPanel.add(«e.ename»Slider);
			«e.ename»innerPanel.setBorder(«e.ename»border2);

			frame.add(«e.ename»innerPanel);
'''
	}
	
def static genSetterGetter(SpinSliderLabel e) { '''
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
def static genChangeListener(SpinSliderLabel e) { '''
		if(ce.getSource() == «e.ename»Slider) {
		«IF e.option != null»
			«IF e.option == "LOGFREQ"»
				gCB.set«e.ename»((double) SpinCADBlock.freqToFilt(SpinCADBlock.sliderToLogval((int)(«e.ename»Slider.getValue()), «e.multiplier»)));
			«ELSE»					
				«IF e.option == "LOGFREQ2"»
					gCB.set«e.ename»((double) SpinCADBlock.freqToFiltSVF(SpinCADBlock.sliderToLogval((int)(«e.ename»Slider.getValue()), «e.multiplier»)));
				«ELSE»									
					«IF e.option == "FILTTOTIME"»
						gCB.set«e.ename»((double) SpinCADBlock.timeToFilt(«e.ename»Slider.getValue()/«e.multiplier»/1000.0));
			    	«ELSE»
						gCB.set«e.ename»((double) («e.ename»Slider.getValue()/«e.multiplier»));			    					
					«ENDIF»
				«ENDIF»
			«ENDIF» 
		«ELSE»	
			gCB.set«e.ename»((double) («e.ename»Slider.getValue()/«e.multiplier»));
		«ENDIF»
			update«e.ename»Label();
		}
'''
}

def static genLabelUpdater(SpinSliderLabel e) {
	'''
		private void update«e.ename»Label() {
		«IF e.option != null»
			«IF e.option == "LENGTHTOTIME"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", (1000 * gCB.get«e.ename»())/ElmProgram.getSamplerate()));		
			«ENDIF»
			«IF e.option == "FILTTOTIME"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", SpinCADBlock.filtToTime(gCB.get«e.ename»()) * 1000) + " ms");		
			«ENDIF»			
			«IF e.option == "LOGFREQ"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", SpinCADBlock.filtToFreq(gCB.get«e.ename»())) + " Hz");		
			«ENDIF»
			«IF e.option == "LOGFREQ2"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", SpinCADBlock.filtToFreqSVF(gCB.get«e.ename»())) + " Hz");		
			«ENDIF»			
			«IF e.option == "SINLFOFREQ"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", coeffToLFORate(gCB.get«e.ename»())));		
			«ENDIF»
			«IF e.option == "DBLEVEL"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f dB", (20 * Math.log10(gCB.get«e.ename»()))));
			«ENDIF»
			«IF e.option == "SUBDIVISION"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", gCB.get«e.ename»()));
			«ENDIF»
		«ELSE»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", gCB.get«e.ename»()));
		«ENDIF»
		}
	'''
	}

// Overloaded methods for SliderLabelSpinner type (structurally identical to SpinSliderLabel)

def static declareVar(SliderLabelSpinner e) { '''
		FineControlSlider «e.ename»Slider;
		JTextField  «e.ename»Field;
'''}

def static initialize(String blockName, SliderLabelSpinner e) { '''
//
// these functions translate between slider values, which have to be integers, to whatever in program value you wish.
//
		«IF e.option != null»
			«IF e.option == "LENGTHTOTIME"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
			«ENDIF»
			«IF e.option == "FILTTOTIME"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (SpinCADBlock.filtToTime(gCB.get«e.ename»()) * 1000 * «e.multiplier»));
			«ENDIF»
			//---------------------------------------------
			// LOGFREQ is used for single pole filters
			«IF e.option == "LOGFREQ"»
			// multiplier is points per decade here
				«e.ename»Slider = SpinCADBlock.LogSlider(«e.minVal»,«e.maxVal»,gCB.get«e.ename»(), "«e.option»", «e.multiplier»);
			«ENDIF»
			//---------------------------------------------
			// LOGFREQ2 is used for 2-pole SVF
			«IF e.option == "LOGFREQ2"»
			// multiplier is points per decade here
				«e.ename»Slider = SpinCADBlock.LogSlider(«e.minVal»,«e.maxVal»,gCB.get«e.ename»(), "«e.option»", «e.multiplier»);
			«ENDIF»
			// ---------------------------------------------
			«IF e.option == "DBLEVEL"»
			// dB level slider: multiplier sets steps per dB (e.g. 10 = 0.1 dB steps)
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (20 * Math.log10(gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "LINEAR"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "SINLFOFREQ"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "RAMPLFOFREQ"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "BOOSTCUT"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) ((gCB.get«e.ename»()) * «e.multiplier»));
			«ENDIF»
			«IF e.option == "SUBDIVISION"»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
			«ENDIF»
		«ELSE»
				«e.ename»Slider = new FineControlSlider(JSlider.HORIZONTAL, (int)(«e.minVal» * «e.multiplier»),(int) («e.maxVal» * «e.multiplier»), (int) (gCB.get«e.ename»() * «e.multiplier»));
		«ENDIF»
			«e.ename»Slider.addChangeListener(new «blockName»Listener());
			«e.ename»Field = new JTextField();
			«e.ename»Field.setHorizontalAlignment(JTextField.CENTER);
			Border «e.ename»Border1 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
			«e.ename»Field.setBorder(«e.ename»Border1);
			«e.ename»Field.addActionListener(new java.awt.event.ActionListener() {
				@Override
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try {
						double val = Double.parseDouble(«e.ename»Field.getText().replaceAll("[^0-9.\\-]", ""));
			«IF e.option != null»
				«IF e.option == "LOGFREQ"»
						int sliderVal = SpinCADBlock.logvalToSlider(val, «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»(SpinCADBlock.freqToFilt(SpinCADBlock.sliderToLogval(sliderVal, «e.multiplier»)));
				«ELSEIF e.option == "LOGFREQ2"»
						int sliderVal = SpinCADBlock.logvalToSlider(val, «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»(SpinCADBlock.freqToFiltSVF(SpinCADBlock.sliderToLogval(sliderVal, «e.multiplier»)));
				«ELSEIF e.option == "LENGTHTOTIME"»
						double samples = val * ElmProgram.getSamplerate() / 1000.0;
						int sliderVal = (int) Math.round(samples * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»((double) sliderVal / «e.multiplier»);
				«ELSEIF e.option == "FILTTOTIME"»
						double filt = SpinCADBlock.timeToFilt(val / 1000.0);
						int sliderVal = (int) Math.round(val * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»(filt);
				«ELSEIF e.option == "SINLFOFREQ"»
						double coeff = val * 2.0 * Math.PI * Math.pow(2.0, 17) / (ElmProgram.getSamplerate() * 511.0);
						int sliderVal = (int) Math.round(coeff * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»((double) sliderVal / «e.multiplier»);
				«ELSEIF e.option == "DBLEVEL"»
						int sliderVal = (int) Math.round(val * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»((double) sliderVal / «e.multiplier»);
				«ELSE»
						int sliderVal = (int) Math.round(val * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»((double) sliderVal / «e.multiplier»);
				«ENDIF»
			«ELSE»
						int sliderVal = (int) Math.round(val * «e.multiplier»);
						sliderVal = Math.max(«e.ename»Slider.getMinimum(), Math.min(«e.ename»Slider.getMaximum(), sliderVal));
						«e.ename»Slider.setValue(sliderVal);
						gCB.set«e.ename»((double) sliderVal / «e.multiplier»);
			«ENDIF»
						update«e.ename»Label();
					} catch (NumberFormatException ex) {
						update«e.ename»Label();
					}
				}
			});
			update«e.ename»Label();

			Border «e.ename»border2 = BorderFactory.createBevelBorder(BevelBorder.RAISED);
			JPanel «e.ename»innerPanel = new JPanel();

			«e.ename»innerPanel.setLayout(new BoxLayout(«e.ename»innerPanel, BoxLayout.Y_AXIS));
			«e.ename»innerPanel.add(Box.createRigidArea(new Dimension(5,4)));
			«e.ename»innerPanel.add(«e.ename»Field);
			«e.ename»innerPanel.add(Box.createRigidArea(new Dimension(5,4)));
			«e.ename»innerPanel.add(«e.ename»Slider);
			«e.ename»innerPanel.setBorder(«e.ename»border2);

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

def static genChangeListener(SliderLabelSpinner e) { '''
		if(ce.getSource() == «e.ename»Slider) {
		«IF e.option != null»
			«IF e.option == "LOGFREQ"»
				gCB.set«e.ename»((double) SpinCADBlock.freqToFilt(SpinCADBlock.sliderToLogval((int)(«e.ename»Slider.getValue()), «e.multiplier»)));
			«ELSE»
				«IF e.option == "LOGFREQ2"»
					gCB.set«e.ename»((double) SpinCADBlock.freqToFiltSVF(SpinCADBlock.sliderToLogval((int)(«e.ename»Slider.getValue()), «e.multiplier»)));
				«ELSE»
					«IF e.option == "FILTTOTIME"»
						gCB.set«e.ename»((double) SpinCADBlock.timeToFilt(«e.ename»Slider.getValue()/«e.multiplier»/1000.0));
			    	«ELSE»
						gCB.set«e.ename»((double) («e.ename»Slider.getValue()/«e.multiplier»));
					«ENDIF»
				«ENDIF»
			«ENDIF»
		«ELSE»
			gCB.set«e.ename»((double) («e.ename»Slider.getValue()/«e.multiplier»));
		«ENDIF»
			update«e.ename»Label();
		}
'''
}

def static genLabelUpdater(SliderLabelSpinner e) {
	'''
		private void update«e.ename»Label() {
		«IF e.option != null»
			«IF e.option == "LENGTHTOTIME"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", (1000 * gCB.get«e.ename»())/ElmProgram.getSamplerate()));
			«ENDIF»
			«IF e.option == "FILTTOTIME"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", SpinCADBlock.filtToTime(gCB.get«e.ename»()) * 1000) + " ms");
			«ENDIF»
			«IF e.option == "LOGFREQ"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", SpinCADBlock.filtToFreq(gCB.get«e.ename»())) + " Hz");
			«ENDIF»
			«IF e.option == "LOGFREQ2"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", SpinCADBlock.filtToFreqSVF(gCB.get«e.ename»())) + " Hz");
			«ENDIF»
			«IF e.option == "SINLFOFREQ"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", coeffToLFORate(gCB.get«e.ename»())));
			«ENDIF»
			«IF e.option == "DBLEVEL"»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f dB", (20 * Math.log10(gCB.get«e.ename»()))));
			«ENDIF»
		«ELSE»
				«e.ename»Field.setText("«e.controlName» " + String.format("%4.«e.precision»f", gCB.get«e.ename»()));
		«ENDIF»
		}
	'''
	}
}

