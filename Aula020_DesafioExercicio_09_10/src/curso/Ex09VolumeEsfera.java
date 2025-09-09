package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex09VolumeEsfera {
	public static void main(String[] args) {
		// DECLARAR VARIÁVEIS - ob scanner
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		// final double PI = 3.14159;
		double raio, volume;
		
		// Entrar dados
		System.out.print("Digite o raio da circunferência: ");
		raio = teclado.nextDouble();
		
		// Calcular Volume da Circunferência
		volume = (4.0 * Math.PI * Math.pow(raio,3)/3.0);
		// volume = (4 * PI * Math.pow(raio,3)/3);
		
		// Apresentar o volume calculado
		System.out.println("Volume = " + volume);
		
	}

}
