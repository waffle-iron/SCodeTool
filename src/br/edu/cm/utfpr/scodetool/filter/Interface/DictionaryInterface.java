/**
 * 
 */
package br.edu.cm.utfpr.scodetool.filter.Interface;

import java.util.ArrayList;

/**
 * @author batista
 *
 */
public interface DictionaryInterface {
	public ArrayList<String> getDictionaryStopWords();
	public boolean isStopWord(String word);
	
	
}
