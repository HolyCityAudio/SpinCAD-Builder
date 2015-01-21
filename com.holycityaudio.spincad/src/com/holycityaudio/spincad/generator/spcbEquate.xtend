/* SpinCAD Builder - DSP Development Tool for the Spin FV-1 
 * Bool.xtend
 * This file supplies template code generation for the REG data type.
 * This turns into a Java int or double, depending on the context.
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

import com.holycityaudio.spincad.spinCAD.SpinEquate



class spcbEquate extends BlockVariable {

// this will generate setters and getters in the CADBlock class

	def static declareVar(SpinEquate e) { '''
		«IF e.value.toUpperCase.startsWith("REG",0)»
		private int «e.ename»;
		«ELSE»
		private double «e.ename» = «e.value»;
		«ENDIF»
'''}

def static initialize(SpinEquate e) { '''
		«IF e.value.toUpperCase.startsWith("REG",0)»
		«e.ename» = sfxb.allocateReg();
		«ENDIF»
'''
	}
}

