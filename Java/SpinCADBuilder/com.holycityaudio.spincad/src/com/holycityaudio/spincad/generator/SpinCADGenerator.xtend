/*
 * generated by Xtext
 */
package com.holycityaudio.spincad.generator

//import com.google.inject.Inject 
import com.holycityaudio.spincad.spinCAD.Program
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
//import org.eclipse.xtext.naming.IQualifiedNameProvider

class SpinCADGenerator implements IGenerator {
 
  // @Inject extension IQualifiedNameProvider
 
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var pkage = "\\com\\holycityaudio\\SpinCAD\\CADBlocks\\"
		fsa.generateFile(pkage + resource.className+"CADBlock.java", toCADBlockCode(resource.contents.head as Program))
		pkage = "\\com\\holycityaudio\\SpinCAD\\ControlPanel\\"
		fsa.generateFile(pkage + resource.className+"ControlPanel.java", toControlPanelCode(resource.contents.head as Program))
		pkage = "\\com\\holycityaudio\\SpinCAD\\test\\"
		fsa.generateFile(pkage + resource.className+"Test.java", toTestCode(resource.contents.head as Program))
	}
	
	def className(Resource res) {
		var name = res.URI.lastSegment
		// println(name)
		return name.substring(0, name.indexOf('.'))
	}
	
	def toCADBlockCode(Program pr) {
		val blockName = pr.eResource.className
		var boop = new SpinCADBlockGenerator()
'''
		«boop.codeGenerate(blockName, pr)»
'''
	}

	def toControlPanelCode(Program pr) { 
		val blockName = pr.eResource.className
		var boop = new SpinCADControlPanelGenerator
	'''
	«boop.genControlPanelCode(blockName, pr)»
	'''
	}

	def toTestCode(Program pr) { 
		val blockName = pr.eResource.className
		var boop = new SpinCADTestGenerator
	'''
		«boop.genTestHeader(blockName)»
		«boop.testNoConnections(blockName)»
		«boop.testAllConnections(blockName, pr)»
		«boop.genTestCloser(blockName)»
	'''
	}			
}