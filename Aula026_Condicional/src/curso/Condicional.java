package curso;

import java.util.Locale;
import java.util.Scanner;

public class Condicional {
	public static void main(String[] args) {
		// configura Locale
		Locale.setDefault(Locale.US);
		
		
		int idade = 12;
		
		// condicional simples
		// se -> if
		if (idade !=  12) {
			System.out.println("Idade é igual a 10");
		}
		// Condicional composta
		// se - senão -> if - else
		if (idade ==10) {
			System.out.println("Idade é igual a 10");
		} else {
			System.out.println("Idade não é igual a 10");
		}
		// continua do código
		System.out.println("Depois da condicional");
		
		
	}

}
