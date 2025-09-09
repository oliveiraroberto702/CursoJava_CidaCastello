package curso;

import java.util.Scanner;

public class DesafioExercicio05 {

	public static void main(String[] args) {
		
		// declara variaveis
		// criar objeto Scanner
		Scanner sc = new Scanner(System.in);
		int x, y; // double x, y;
		
		System.out.print("Digite o primeiro número: ");
		x = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		y = sc.nextInt();
		
		System.out.println("Soma          = " + x + " + " + y + " = " + (x + y));
		System.out.println("Subtração     = " + x + " - " + y + " = " + (x - y));
		System.out.println("Multiplicação = " + x + " * " + y + " = " + (x * y));
		System.out.println("Divisão       = " + x + " / " + y + " = " + (x / y));
		System.out.println("              Resto = " + (x % y));
		

	}

}
