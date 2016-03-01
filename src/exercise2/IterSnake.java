package exercise2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Java program that defines a Snake class and instances an example of it, using an iterator.
 * 
 * Subject: Interactive Apps Programming
 * @author eebritos eduardobritosanchez@gmail.com
 * @version 1.0.0
 * @since 2016-19-02
 */

public class IterSnake {
	
	public IterSnake() {
		setNumSnake(getNumSnake() + 1);
		setIdSnake(getNumSnake());
	}
	
	public static void main(String[] args) {
		try {
			ArrayList<IterSnake> snakeArray = new ArrayList<IterSnake>();
			
			for (int i = 0; i < Integer.parseInt(args[0]); i++) {
				snakeArray.add(new IterSnake());
			}
			
			Iterator<IterSnake> it = snakeArray.iterator();
			
			while (it.hasNext()) {
				IterSnake iterSnake = (IterSnake) it.next();
				iterSnake.slither();
			}
			
//			for (int i = 0; i < snakeArray.size(); i++) {
//				snakeArray.get(i).slither();
//			}
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
		IterSnake.numSnake = numSnake;
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
