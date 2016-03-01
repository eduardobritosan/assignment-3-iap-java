package exercise4;

/**
 * Parser class that reads words separated by several types of delimiters. 
 * 
 * Subject: Interactive Apps Programming
 * @author eebritos eduardobritosanchez@gmail.com
 * @version 1.0.0
 * @since 2016-19-02
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Parser {
	
	private BufferedReader reader;
	
	public Parser() {}
	
	public Parser(String filename) throws IOException {
		FileReader fileReader = new FileReader(filename);
		setReader(new BufferedReader(fileReader));
	}
	
	public ArrayList<String> getWordList(){
		ArrayList<String> returnArray = new ArrayList<String>();
		
		try {
			while (getReader().ready()) {
				String auxString = getReader().readLine();
				for (String string : auxString.split("(\\.|;|:|,|\\?|\t|\n|\\)|\\(|-|\"|\\s)+")) {
					if (Character.isAlphabetic(string.charAt(0))) {
						returnArray.add(string.toLowerCase());
					}
				}
			}
		} catch (IOException e) {
			System.err.println("Error en la lectura del buffer, intenta con otro fichero.");
		}
		return returnArray;
	}

	/**
	 * @return the reader
	 */
	public BufferedReader getReader() {
		return reader;
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}
}
