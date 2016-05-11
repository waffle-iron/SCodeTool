/**
 * 
 */
package br.edu.cm.utfpr.scodetool.loader;

import java.io.File;
import java.util.ArrayList;

import br.edu.cm.utfpr.scodetool.entities.generics.Project;
import br.edu.cm.utfpr.scodetool.entities.generics.SourceCode;

/**
 * @author Paulo
 *
 */
public interface ProjectMounter<S extends SourceCode, PA extends Package, PO extends Project> {
    public ArrayList<S> mountSourceCodes(ArrayList<File> files);
    public ArrayList<PA> mountPackages(ArrayList<S> sourceCodes);
    public PO mountProject(ArrayList<PA> packages);
    public PO execute(String Url);
}
