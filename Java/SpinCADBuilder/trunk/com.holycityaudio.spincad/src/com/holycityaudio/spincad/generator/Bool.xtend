package com.holycityaudio.spincad.generator

import com.holycityaudio.spincad.spinCAD.SpinBool

class spcbBool extends BlockVariable {

// this will generate setters and getters in the CADBlock class

def static declareVar(SpinBool e) { '''
		boolean «e.name»;
'''}

def static initialize(SpinBool e) { '''
		«e.name» = «e.value»;
'''
	}
}

