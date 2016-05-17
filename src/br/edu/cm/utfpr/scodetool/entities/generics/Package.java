/**
 * 
 */
package br.edu.cm.utfpr.scodetool.entities.generics;

/**
 * @author Paulo
 *
 */
public abstract class Package {
    private String packageName;

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
    
}
