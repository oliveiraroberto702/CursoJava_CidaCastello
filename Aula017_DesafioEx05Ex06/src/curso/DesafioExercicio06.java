package curso;


import java.util.Locale;
import java.util.Scanner;

public class DesafioExercicio06 {

	public static void main(String[] args) {
		// declara variaveis
				// criar objeto Scanner
				Scanner sc = new Scanner(System.in);
				sc.useLocale(Locale.US);
				double x, y; 
				
				System.out.print("Digite o primeiro número: ");
				x = sc.nextDouble();
				System.out.print("Digite o segundo numero: ");
				y = sc.nextDouble();
				
				System.out.println("Soma          = " + x + " + " + y + " = " + (x + y));
				System.out.println("Subtração     = " + x + " - " + y + " = " + (x - y));
				System.out.println("Multiplicação = " + x + " * " + y + " = " + (x * y));
				System.out.println("Divisão       = " + x + " / " + y + " = " + (x / y));
				

	}

}
