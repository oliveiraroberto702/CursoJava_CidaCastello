package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio22_2 {
	public static void main(String[] args) {
		// configura Locale
		Locale.setDefault(Locale.US);
				
		// instancia objeto Scanner
		Scanner sc = new Scanner(System.in);
				
		// declara variáveis primitivas
		   int fat = 1, n;
		   System.out.print("Digite o número inteiro a ser fatorado: ");
		   n = Integer.parseInt(sc.nextLine());
		   do {
			    fat = (n > 0 ? fat * n : fat * 1);
			    n--;
			    

			   
		   } while (n > 0);
		
		System.out.print("Fatorial = " + fat);
		sc.close();

	}

}
