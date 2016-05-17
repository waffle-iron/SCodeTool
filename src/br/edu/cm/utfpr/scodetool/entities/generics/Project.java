/**
 * 
 */
package br.edu.cm.utfpr.scodetool.entities.generics;

/**
 * @author Paulo
 *
 */
public abstract class Project {
    private String projectName;
    private String Url;
    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }
    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    /**
     * @return the url
     */
    public String getUrl() {
        return Url;
    }
    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        Url = url;
    }
    
}
