/**
 * 
 */
package br.edu.cm.utfpr.scodetool.entities.generics;

import java.util.ArrayList;

/**
 * @author Paulo
 *
 */
public abstract class SourceCode {
    private String className;
    private String packageName;
    private ArrayList<String> text;
    
    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }
    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }
    /**
     * @return the packageName
     */
    public String getPackageName() {
        return packageName;
    }
    /**
     * @param packageName the packageName to set
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
	public ArrayList<String> getText() {
		return text;
	}
	public void setText(ArrayList<String> text) {
		this.text = text;
	}
    
}
