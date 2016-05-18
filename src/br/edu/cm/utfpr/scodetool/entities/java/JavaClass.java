/**
 * 
 */
package br.edu.cm.utfpr.scodetool.entities.java;

import java.io.File;

import br.edu.cm.utfpr.scodetool.entities.generics.SourceCode;
import br.edu.cm.utfpr.scodetool.loader.JavaLoaderTools;

/**
 * @author Paulo
 *
 */
public class JavaClass extends SourceCode{
	
	public JavaClass (File file) {
		
		this.setClassName(file.getName());
		this.setPackageName(JavaLoaderTools.getPackageNameOfAJavaClass(file));
	}
	
}
