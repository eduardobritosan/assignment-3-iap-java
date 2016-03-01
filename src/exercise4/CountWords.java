package exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Java class that can count the amount of duplicates of a word, disregarding case sensitivity, from an ArrayList<String>.
 * 
 * Subject: Interactive Apps Programming
 * @author eebritos eduardobritosanchez@gmail.com
 * @version 1.0.0
 * @since 2016-19-02
 */

public class CountWords {
	
	private ArrayList<String> wordList;
	private ArrayList<Word> finalList;
	private ArrayList<Word> sortedList;
	
	public CountWords() {
		setWordList(new ArrayList<String>());
		setFinalList(new ArrayList<Word>());
		setSortedList(new ArrayList<Word>());
	}
	
	public CountWords(ArrayList<String> newWorldList) {
		setWordList(newWorldList);
		setFinalList(new ArrayList<Word>());
		setSortedList(new ArrayList<Word>());
	}
	
	private void countList(){
		for (String string : getWordList()) {
			if (!isWordCounted(string)) {
				Word newWord = new Word(string, Collections.frequency(getWordList(), string));
				getFinalList().add(newWord);
			}		
		}
	}
	
	private boolean isWordCounted(String string){
		for (Word word : getFinalList()) {
			if (word.getString().equalsIgnoreCase(string)) {
				return true;
			}
		}
		return false;
	}
	
	private void sortList(){
		Collections.sort(getFinalList() , new Comparator<Word>() {
		    public int compare(Word s1, Word s2) {
		        return s1.getString().compareTo(s2.getString());
		    }
		});
	}
	
	public void run(){
		countList();
		sortList();
		printList();
	}
	
	private void printList(){
		System.out.println("Muestra las palabras y su contador en orden alfabético");
		for (Word word : getFinalList()) {
			System.out.println(word.getDuplicates() + "\t" + word.getString());
		}
	}

	/**
	 * @return the wordList
	 */
	protected ArrayList<String> getWordList() {
		return wordList;
	}

	/**
	 * @param wordList the wordList to set
	 */
	protected void setWordList(ArrayList<String> wordList) {
		this.wordList = wordList;
	}

	/**
	 * @return the FinalList
	 */
	protected ArrayList<Word> getFinalList() {
		return finalList;
	}

	/**
	 * @param FinalList the FinalList to set
	 */
	protected void setFinalList(ArrayList<Word> finalList) {
		this.finalList = finalList;
	}

	/**
	 * @return the sortedList
	 */
	protected ArrayList<Word> getSortedList() {
		return sortedList;
	}

	/**
	 * @param sortedList the sortedList to set
	 */
	protected void setSortedList(ArrayList<Word> sortedList) {
		this.sortedList = sortedList;
	}

}

