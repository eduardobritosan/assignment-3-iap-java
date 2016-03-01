package exercise5;

/**
 * Java program to test simple exceptions.
 * 
 * Subject: Interactive Apps Programming
 * @author eebritos eduardobritosanchez@gmail.com
 * @version 1.0.0
 * @since 2016-19-02
 */
public class Log1 {

	public static void main (String args[]){
		try {
			double aDouble = Double.parseDouble(args[0]);
			System.out.println(Math.log(aDouble));
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.err.println("Por favor, introducir parametros.");
		} catch (NumberFormatException e2){
			System.err.println("Por favor, introducir un numero.");
		}
		

	}

}

//Sin parametros array out of bounds
//No numerico numberFormatException
//Ejecucion sin problema
