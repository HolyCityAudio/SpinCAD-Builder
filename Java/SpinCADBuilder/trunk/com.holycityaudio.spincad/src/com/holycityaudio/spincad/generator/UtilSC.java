package com.holycityaudio.spincad.generator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.holycityaudio.spincad.spinCAD.Skip;

public class UtilSC {
	
	static public int getDiff(Skip rtl) {
		int labelIndex = indexOf(rtl);
		int refIndex = indexOf(rtl.getLabel());
		// TODO - this needs to be modified, since another label or comment might be 
		// between the two end points, it should not be counted
		int c = countComments(rtl, labelIndex, refIndex) + 1;
		return (refIndex - labelIndex) - c;
	}
	
	private static int indexOf(EObject o) {
		if (o.eContainingFeature()!=null && o.eContainingFeature().isMany()) {
			@SuppressWarnings("unchecked")
			List<EObject> siblings = (List<EObject>) o.eContainer().eGet(o.eContainingFeature());
			int indexOf = siblings.indexOf(o);
			return indexOf;
		}
		return -1;
	}

	private static int countComments(EObject o, int start, int end) {
		int comments = 0;
		if (o.eContainingFeature()!=null && o.eContainingFeature().isMany()) {
			@SuppressWarnings("unchecked")
			List<EObject> siblings = (List<EObject>) o.eContainer().eGet(o.eContainingFeature());
			for(int ii = start; ii < end; ii++) {
				EObject getLine = siblings.get(ii);
				String line = getLine.toString();
//				System.out.println(line);
				if(line.contains("CommentImpl") || line.contains("LabelImpl")) {
					comments = comments + 1;
				}
			}
		}
		return comments;
	}
}