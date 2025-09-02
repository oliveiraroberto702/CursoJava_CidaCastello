package curso;
/**
 * @author Roberto Oliveira
 * Programa para conversão de dados
 * Explicita
 */

public class ConversaoExplicita {

	public static void main(String[] args) {
		
		// do maior para o menor tipo
		
		long varLong = 9000000000000L; //653654;
		int varInt = (int) varLong;
		System.out.println("Long: " + varLong);
		System.out.println("Int: " + varInt);
		
		
		 double varDouble = 3654.9875;
		 int varInt2 = (int) varDouble;
		 System.out.println("Double: " + varDouble );
		 System.out.println("Double para Int: " + varInt2);
		 
		 
		 float varFloat = (float) varDouble;
		 System.out.println("Double para float: " + varFloat);
		 
		 
		
		

	}

}
