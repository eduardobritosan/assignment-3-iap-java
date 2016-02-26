package exercise1;

import java.util.ArrayList;

public class AltSnake {

	public AltSnake() {}
	
	public AltSnake(int numSnake){
		setNumSnake(numSnake);
	}
	
	public static void main(String[] args) {
		try {
			ArrayList<AltSnake> snakeArray = new ArrayList<AltSnake>();
			for (int i = 0; i < Integer.parseInt(args[0]); i++) {
				snakeArray.add(new AltSnake(i));
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
