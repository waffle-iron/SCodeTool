/**
 * 
 */
package br.edu.cm.utfpr.scodetool.entities;

import java.util.ArrayList;

/**
 * @author Paulo
 *
 */
public class JavaPackage {
	private String namePackage;
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

	/**
	 * @return the namePackage
	 */
	public String getNamePackage() {
		return namePackage;
	}

	/**
	 * @param namePackage the namePackage to set
	 */
	public void setNamePackage(String namePackage) {
		this.namePackage = namePackage;
	}
	
	
}
