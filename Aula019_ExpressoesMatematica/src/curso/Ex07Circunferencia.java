package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex07Circunferencia {
	public static void main(String[] args) {
		
		// declara varaiáveis
		Scanner tela = new Scanner(System.in);
		tela.useLocale(Locale.US);
		double raio, area, comprimento;
		final double PI = 3.14159;
		
		// entrada de dados
	
		System.out.print("Valor do raio? ");
		raio = tela.nextDouble();
		
		
		// cálculo da área e comprimenmto da circuferência
		area = PI * Math.pow(raio,2);
		comprimento = 2 * PI * raio;
		
		// apresentar a área e o comprimento da circunferência
		System.out.println( "Área = " + area);
		System.out.println("Comprimento = " + comprimento);
		
		
		
		
	}

}
