/* SpinCAD Builder - DSP Development Tool for the Spin FV-1 
 * UtilSC.java
 * This file provides utilities for the SpinCAD Builder language which I could not
 * figure out how to write in Xtend.
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
		// also need to eliminate macros from the count.
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
				if(line.contains("CommentImpl") || line.contains("LabelImpl") || line.contains("SemitonesToRmpRateImpl")) {
//					System.out.println(line);
					comments = comments + 1;
				}
			}
		}
		return comments;
	}
}