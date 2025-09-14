package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		
		// seta Locale
		Locale.setDefault(Locale.US);
		
		// instancia objeto Scanner 
		Scanner sc = new Scanner(System.in);
		// declara variáveis
		int n, soma;
		
		// entrada de dados
		System.out.print("Digite o número que deseja realizae a soma ( 1 + 2 + 3 + ...N): ");
		n = Integer.parseInt(sc.nextLine());
		soma = 0;
		for (int i = 1; i <= n; i++) {
		    //  soma = soma + i;
			soma += i;
		}
		System.out.println("Soma = " + soma);
		
	}

}
