package curso;

import java.util.Locale;
import java.util.Scanner;

public class DesafioEx19 {
	public static void main(String[] args) {
		// configura Locale
		Locale.setDefault(Locale.US);
		
		// instancia objeto Scanner
		Scanner tela = new Scanner(System.in);
		
		// declara variáveis primitivas
		int n;
		
		// entrada de dados
		System.out.print("Digite o primeiro valor inteiro da sequência (0 encerra): ");
		n = Integer.parseInt(tela.nextLine());
		while ( n != 0) {
			System.out.println(String.format("Resposta: quadrado de %d é igual a %.0f", n, Math.pow(n,2)));
			System.out.print("Digite o próximo valor inteiro da sequência (0 encerra): ");
			n = Integer.parseInt(tela.nextLine());
		}
		System.out.println("Fim do programa");
	}

}
