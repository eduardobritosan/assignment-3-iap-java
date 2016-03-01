package exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Java program that defines a Snake class and instances an example of it. Uses a HashMap.
 * 
 * Subject: Interactive Apps Programming
 * @author eebritos eduardobritosanchez@gmail.com
 * @version 1.0.0
 * @since 2016-19-02
 */

public class MapSnake {
	
	public MapSnake() {
		setNumSnake(getNumSnake() + 1);
		setIdSnake(getNumSnake());
	}
	
	public static void main(String[] args) {
		try {
			HashMap<String, MapSnake> mapSnake = new HashMap<String, MapSnake>();
			
			for (Integer i = 0; i < Integer.parseInt(args[0]); i++) {
				MapSnake newSnake = new MapSnake();
				mapSnake.put(i.toString(), newSnake);
			}
			
			Iterator<String> it = mapSnake.keySet().iterator();
			
			while (it.hasNext()) {
				String string = (String) it.next();
				System.out.println("La clave es: " + string);
				mapSnake.get(string).slither();
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
		MapSnake.numSnake = numSnake;
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
