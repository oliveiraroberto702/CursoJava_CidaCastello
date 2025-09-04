package curso;
/**
 * @author Roberto Oliveira
 * 
 * 
 */
public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		double z = 2.5;
		
		/*
		 Operadores Aritméticos
		 + - * / %
		 */
		
		// resultado
		int resultado = a + b;
		System.out.println("Soma          ==> " + a + " + " + b + " = " + resultado);
		System.out.println("Subtração     ==> " + a + " - " + b + " = " + (a - b));
		System.out.println("Multiplicação ==> " + a + " * " + b + " = " + (a * b));
		System.out.println("Divisão       ==> " + a + " / " + b + " = " + (a / b));
		System.out.println("                  Resto = " + (a % b));
		
		double resultado1 = a + z;
		System.out.println("==========================");
		System.out.println("Soma          ==> " + a + " + " + z + " = " + resultado1);
		System.out.println("Subtração     ==> " + a + " - " + z + " = " + (a - z));
		System.out.println("Multiplicação ==> " + a + " * " + z + " = " + (a * z));
		System.out.println("Divisão       ==> " + a + " / " + z + " = " + (a / z));
		
	}

}
