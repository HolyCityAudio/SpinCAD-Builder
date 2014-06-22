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

