package exercise1;

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
			
			for (int i = 0; i < snakeArray.size(); i++) {
				snakeArray.get(i).slither();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid arguments, remember to pass the size of the array through the command line");
		}
	}
	
	public void slither(){
		System.out.println("La serpiente " + getIdSnake() + " esta reptando.");
	}
	
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
	 * @return the idSnake
	 */
	protected int getIdSnake() {
		return idSnake;
	}
	/**
	 * @param idSnake the idSnake to set
	 */
	protected void setIdSnake(int idSnake) {
		this.idSnake = idSnake;
	}
	
	private static int numSnake = 0;
	private int idSnake;
}
