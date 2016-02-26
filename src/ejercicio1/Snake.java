package ejercicio1;

import java.util.ArrayList;

/**
 * Simple snake class, used to test collections in Java.
 * @version 1.0.0
 * @author eebritos
 * Subject: Interactive 
 */

public class Snake {
	
	public Snake() {
		setNumSnake(getNumSnake() + 1);
		setIdSnake(getNumSnake());
	}
	
	public static void main(String[] args) {
		try {
			ArrayList<Snake> snakeArray = new ArrayList<Snake>();
			for (int i = 0; i < Integer.parseInt(args[0]); i++) {
				snakeArray.add(new Snake());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid arguments, remember to pass the size of the array through the command line");
		}
	}
	
	public int crawl(){
		return getIdSnake();
	}
	
	private static int numSnake = 0;
	private int idSerpiente;
	/**
	 * @return the numSnake
	 */
	protected static int getNumSnake() {
		return numSnake;
	}
	/**
	 * @param numSnake the numSnake to set
	 */
	protected static void setNumSnake(int numSnake) {
		Snake.numSnake = numSnake;
	}
	/**
	 * @return the idSerpiente
	 */
	protected int getIdSnake() {
		return idSerpiente;
	}
	/**
	 * @param idSerpiente the idSerpiente to set
	 */
	protected void setIdSnake(int idSerpiente) {
		this.idSerpiente = idSerpiente;
	}
}
