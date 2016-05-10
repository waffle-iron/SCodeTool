/**
 * 
 */
package br.edu.cm.utfpr.scodetool.entities;

/**
 * @author Paulo
 *
 */
public class JavaProject {
    private String projectName;
    private String Url;
    
    
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
    
    
}
