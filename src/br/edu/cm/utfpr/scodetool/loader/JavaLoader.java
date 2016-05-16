/**
 * 
 */
package br.edu.cm.utfpr.scodetool.loader;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

import br.edu.cm.utfpr.scodetool.entities.JavaClass;
import br.edu.cm.utfpr.scodetool.entities.JavaPackage;
import br.edu.cm.utfpr.scodetool.entities.JavaProject;
import br.edu.cm.utfpr.scodetool.entities.generics.Project;


/**
 * @author Paulo
 *
 */
public class JavaLoader<CLASS extends JavaClass, PACKAGE extends JavaPackage, PROJECT extends JavaProject>
        implements
            ProjectLoader,
            ProjectMounter<CLASS, PACKAGE, PROJECT> {
    private final String javaExtension = "(.*\\.java)";
    
    @SuppressWarnings("unchecked")
	@Override
    public ArrayList<CLASS> mountSourceCodes(ArrayList<File> files) {
        // TODO Auto-generated method stub
        ArrayList<JavaClass> javaClasses = new ArrayList<JavaClass>();
    	for(File file : files) {
    		javaClasses.add(new JavaClass(file));
    	}
    	return (ArrayList<CLASS>) javaClasses;
    }

    @Override
    public ArrayList<PACKAGE> mountPackages(ArrayList<CLASS> sourceCodes) {
        // TODO Auto-generated method stub
    	ArrayList<JavaPackage> packages = new ArrayList<JavaPackage>();
    	for(JavaClass jclass : sourceCodes) {
    		//if()
    	}
        return null;
    }

    @Override
    public PROJECT mountProject(ArrayList<PACKAGE> packages) {
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
    public PROJECT execute(String Url) {
        // TODO Auto-generated method stub
        File rootDirectory = new File(Url);
        ArrayList<File> sourceFiles = this.getSourceFiles(rootDirectory);
        
        return null;
    }

}
