/**
 * 
 */
package exercise5;

/**
 * Java class that creates a custom Exception to handle in the program.
 * 
 * Subject: Interactive Apps Programming
 * @author eebritos eduardobritosanchez@gmail.com
 * @version 1.0.0
 * @since 2016-19-02
 */
public class WrongParameterException extends Exception {

	/**
	 * 
	 */
	public WrongParameterException(String msg) {
		super(msg);
	}
	
	public WrongParameterException(Exception e){
		super("Formato numerico equivocado.");
	}

}
