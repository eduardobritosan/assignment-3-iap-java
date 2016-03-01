package exercise1;

import java.util.ArrayList;
/**
 * Java program that defines a Snake class and instances an example of it. Alternate version.
 * 
 * Subject: Interactive Apps Programming
 * @author eebritos eduardobritosanchez@gmail.com
 * @version 1.0.0
 * @since 2016-19-02
 */
public class DiffSnake {

	public DiffSnake() {}
	
	public DiffSnake(int numSnake){
		setNumSnake(numSnake);
	}
	
	public static void main(String[] args) {
		try {
			ArrayList<DiffSnake> snakeArray = new ArrayList<DiffSnake>();
			for (int i = 0; i < Integer.parseInt(args[0]); i++) {
				snakeArray.add(new DiffSnake(i));
			}
			for (int i = 0; i < snakeArray.size(); i++) {
				snakeArray.get(i).slither();
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid arguments, remember to pass the size of the array through the command line");
		}
	}
	
	public void slither(){
		System.out.println("La serpiente " + getNumSnake() + " esta reptando.");
	}
	
	/**
	 * @return the numSnake
	 */
	protected int getNumSnake() {
		return numSnake;
	}
	/**
	 * @param numSnake the numSnake to set
	 */
	protected void setNumSnake(int numSnake) {
		this.numSnake = numSnake;
	}
	
	private int numSnake;

}
