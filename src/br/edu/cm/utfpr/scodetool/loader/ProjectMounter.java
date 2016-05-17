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
public interface ProjectMounter<CLASS, PACKAGE, PROJECT> {
    public ArrayList<CLASS> mountSourceCodes(ArrayList<File> files);
    public ArrayList<PACKAGE> mountPackages(ArrayList<CLASS> sourceCodes);
    public PROJECT mountProject(PROJECT project,ArrayList<PACKAGE> packages);
    public PROJECT execute(String Url);
}
