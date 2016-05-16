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
	
	
	public JavaPackage(JavaClass javaClass) {
		this.setPackageName(javaClass.getPackageName());
		this.classes = new ArrayList<JavaClass>();
		this.classes.add(javaClass);
	}
	
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
