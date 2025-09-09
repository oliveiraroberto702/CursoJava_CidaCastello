package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex10AreaDoTrapezio {
	public static void main(String[] args) {
		
		// criar objeto scanner
		Scanner sc = new Scanner(System.in);
		//setar locale
		sc.useLocale(Locale.US);
		// declarar variaveis primitivas
		double base;
		double Base;
		double altura; 
		double area;
		
		// entrar dados do trapézio
		System.out.print("digitar o tamanho em metros da Base maior do Trapézio: ");
		Base = sc.nextDouble();
		
		System.out.print("digitar o tamanho em metros da base menor do Trapézio: ");
		base = sc.nextDouble();
		
		System.out.print("digitar o tamanho em metros da altura do Trapézio: ");
		altura = sc.nextDouble();
		
		// calcular a área do trapézio
		area = altura * ((Base + base) / 2.0);		
		
		// apresentar valor calculado do trapézio
		System.out.println("Volume do Trapézio = " + area + " m2");
		
	}

}
