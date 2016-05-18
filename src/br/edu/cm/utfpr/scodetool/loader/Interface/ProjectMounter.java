/**
 * 
 */
package br.edu.cm.utfpr.scodetool.loader.Interface;

import java.io.File;
import java.util.ArrayList;

import br.edu.cm.utfpr.scodetool.entities.generics.Project;
import br.edu.cm.utfpr.scodetool.entities.generics.SourceCode;
import br.edu.cm.utfpr.scodetool.entities.generics.Package;


/**
 * @author Paulo
 *
 */
public interface ProjectMounter<CLASS extends SourceCode, PACKAGE extends Package, PROJECT extends Project> {
    public ArrayList<CLASS> mountSourceCodes(ArrayList<File> files);
    public ArrayList<PACKAGE> mountPackages(ArrayList<CLASS> sourceCodes);
    public PROJECT mountProject(PROJECT project,ArrayList<PACKAGE> packages);
    public PROJECT execute(String Url);
}
