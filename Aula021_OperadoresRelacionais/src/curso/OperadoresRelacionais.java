package curso;

public class OperadoresRelacionais {
	
	public static void main (String[] args) {
		
		// declaração de variáveis
		int num1 = 7, num2 =7;
		boolean resultado;
		
		// maior >
		resultado = num1 > num2;
		System.out.println("Resultado " + num1 + " maior (>)            " + num2 + ": " + resultado);
		
		
		// maior ou igual >=
		resultado = num1 >= num2;
		System.out.println("Resultado " + num1 + " maior ou igual (>=)  " + num2 + ": " + resultado);
		
				
		// menor <
		resultado = num1 < num2;
		System.out.println("Resultado " + num1 + " menor (<)            " + num2 +  ": " + resultado);
		
		// menor ou igual <=
		resultado = num1 <= num2;
		System.out.println("Resultado " + num1 + " menor ou igual (<=)  " + num2 + ": " + resultado);
		
		// igual ==
		resultado = num1 == num2;
		System.out.println("Resultado " + num1 + " igual (==)           " + num2 + ": " + resultado);
		
		
		// diferente !=
		resultado = num1 != num2;
		System.out.println("Resultado " + num1 + " diferente (!=)       " + num2 + ": " + resultado);
		
		
		
		
	}

}
