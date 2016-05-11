/**
 * 
 */
package br.edu.cm.utfpr.scodetool.entities;

import java.util.ArrayList;
import br.edu.cm.utfpr.scodetool.entities.generics.Package;
/**
 * @author Paulo
 *
 */
public class JavaPackage extends Package {
	
	private ArrayList<JavaClass> classes;
	
	/**
	 * @return the classes
	 */
	public ArrayList<JavaClass> getClasses() {
		return classes;
	}

	/**
	 * @param classes the classes to set
	 */
	public void setClasses(ArrayList<JavaClass> classes) {
		this.classes = classes;
	}


	
}
