package exercise5;

/**
 * Java program that tests the manual throwing of exceptions, the creation of custom exceptions and what syntax is needed.
 * 
 * Subject: Interactive Apps Programming
 * @author eebritos eduardobritosanchez@gmail.com
 * @version 1.0.0
 * @since 2016-19-02
 */

public class Log2 {

	public static void main (String args[]) throws WrongParameterException{
		try {
			double aDouble = Double.parseDouble(args[0]);
			if (aDouble <= 0) {
				throw new WrongParameterException("Por favor, introducir numero mayor que 0.");
			}
			System.out.println(Math.log(aDouble));
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.err.println("Por favor, introducir parametros.");
		} catch (NumberFormatException e2){
			throw new WrongParameterException(e2);
		}
		

	}

}

//Sin parametros array out of bounds
//No numerico numberFormatException
//Ejecucion sin problema

