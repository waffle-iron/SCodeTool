/**
 * 
 */
package br.edu.cm.utfpr.scodetool.loader;

import java.io.File;
import java.util.ArrayList;

/**
 * @author Paulo
 *
 */
public interface ProjectLoader {
    
    public ArrayList<File> getSourceFiles(File rootDirectory, String patternLanguageExtension);
}
