/**
 * 
 */
package br.edu.cm.utfpr.scodetool.filter.Interface;

import java.util.ArrayList;

/**
 * @author batista
 *
 */
public interface PreFilter {
	public ArrayList<String> removeTermsByLength(ArrayList<String> text);
	public ArrayList<String> applyCamelCase(ArrayList<String> text);
	public ArrayList<String> removeDigit(ArrayList<String> text);
	public ArrayList<String> removeComment(ArrayList<String> text);
	public ArrayList<String> removeEmptyLine(ArrayList<String> text);
	public ArrayList<String> removeStopWords(ArrayList<String> text);
	public ArrayList<String> removeNonWordsAndTokenize(ArrayList<String> text);
}
