/**
 * 
 */
package br.edu.cm.utfpr.scodetool.entities.java;

import java.io.File;
import java.util.ArrayList;

import br.edu.cm.utfpr.scodetool.entities.generics.Project;

/**
 * @author Paulo
 *
 */
public class JavaProject extends Project {
    
	private ArrayList<JavaPackage> packages;
	
	
	public JavaProject(String url) {
		this.setUrl(url);
		this.setProjectName(new File(url).getName());
		this.packages = new ArrayList<JavaPackage>();
	
	}
	
	public JavaProject(String url, ArrayList<JavaPackage> packages) {
		this.setUrl(url);
		this.setProjectName(new File(url).getName());
		this.setPackages(packages);
	}
	
	public ArrayList<JavaPackage>getPackages() {
		return packages;
	}
	
	public void setPackages(ArrayList<JavaPackage> packages) {
		this.packages = packages;
	}
    
}
