/**
 * 
 */
package br.edu.cm.utfpr.scodetool.loader;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

import br.edu.cm.utfpr.scodetool.entities.generics.Project;
import br.edu.cm.utfpr.scodetool.entities.generics.SourceCode;

/**
 * @author Paulo
 *
 */
public class JavaLoader<S extends SourceCode, PA extends Package, PO extends Project>
        implements
            ProjectLoader,
            ProjectMounter<S, PA, PO> {
    private final String javaExtension = "(.*\\.java)";
    @Override
    public ArrayList<S> mountSourceCodes(ArrayList<File> files) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<PA> mountPackages(ArrayList<S> sourceCodes) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PO mountProject(ArrayList<PA> packages) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<File> getSourceFiles(File rootDirectory) {
        // TODO Auto-generated method stub
       
        ArrayList<File> primaryJavaFiles = this.findFilethroughADirectory(rootDirectory, this.javaExtension);
        ArrayList<File> javaFiles = new ArrayList<File>();

        for (File file : primaryJavaFiles) {
            if (!file.getAbsolutePath().endsWith("package-info.java")) {
                javaFiles.add(file);
            }
        }
        return javaFiles;
    }

    @Override
    public ArrayList<File> findFilethroughADirectory(File rootDirectory,
            String pattern) {
        // TODO Auto-generated method stub
        ArrayList<File> files = new ArrayList<File>();
        if (rootDirectory.isDirectory()) {
        }
        File[] subDirectory = rootDirectory.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory()
                        || pathname.getName().matches(pattern);

            }
        });
        for (File file : subDirectory) {
            if (file.isDirectory()) {
                files.addAll(findFilethroughADirectory(file, pattern));
            } else {
                files.add(file);
            }
        }
        return files;

    }

    @Override
    public PO execute(String Url) {
        // TODO Auto-generated method stub
        return null;
    }

}
