package exercise4;

import java.io.IOException;

/**
 * Java program that runs an example of the parser and the word counter.
 * 
 * Subject: Interactive Apps Programming
 * @author eebritos eduardobritosanchez@gmail.com
 * @version 1.0.0
 * @since 2016-19-02
 */
public class Main {

/**
 * 
 * @param args Recieves the filename.
 */
	public static void main(String[] args) {
		try {
			Parser parser = new Parser(args[0]);
			CountWords counter = new CountWords(parser.getWordList());
			counter.run();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
