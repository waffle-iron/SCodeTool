/**
 * 
 */
package br.edu.cm.utfpr.scodetool.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.cm.utfpr.scodetool.entities.JavaClass;
import br.edu.cm.utfpr.scodetool.entities.JavaPackage;

/**
 * @author Paulo
 *
 */
public class JavaLoaderTools {
    
    public static String getPackageNameOfAJavaClass(File javaFile) {
        return javaFile.getAbsolutePath().substring(javaFile.getAbsolutePath().indexOf("/src") + 5, javaFile.getAbsolutePath().lastIndexOf("/")).replaceAll("/", ".");
    }
    
    public static ArrayList<String> loadText(File file) {
        try {
            ArrayList<String> text = new ArrayList<String>();
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            Scanner scan = new Scanner(buffer);
            while(scan.hasNextLine()) {
                text.add(scan.nextLine());
            }
            scan.close();
            try {
                buffer.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return text;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    public static boolean containsJavaPackage(ArrayList<JavaPackage> packages, JavaPackage pack) {
    	for(JavaPackage jpack : packages) {
    		if(jpack.getPackageName().equals(pack.getPackageName())) return true;
    	}
    	return false;
    }
    
    public static boolean containsJavaClass(ArrayList<JavaClass> javaClassList, JavaClass javaClass) {
    	for(JavaClass jclass : javaClassList) {
    		if(jclass.getClassName().equals(javaClass.getClassName())) return true;
    	}
    	return false;
    }
}
