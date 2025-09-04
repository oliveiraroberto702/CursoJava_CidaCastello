package curso;
/*
Operadores Aritméticos
 / %
*/
public class TestaDivisão {

	public static void main(String[] args) {
		int x = 5;
		float x1 = 5;
		int y = 3;
				
		// resultado
		
		System.out.println("Divisão       ==> " + x + " / " + y + " = " + (x / y));
		System.out.println("                  Resto = " + (x % y));
		float resultado = x / y;
		System.out.println("Divisão       ==> " + x + " / " + y + " = " + resultado);
		System.out.println("Divisão       ==> " + x + " / " + y + " = " + (float) x / y );
		System.out.println("Divisão       ==> " + x1 + " / " + y + " = " + x1 / y );
		
		
		
		
		

	}

}
