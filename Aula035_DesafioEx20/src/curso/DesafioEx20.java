package curso;

import java.util.Locale;
import java.util.Scanner;

public class DesafioEx20 {
	
	public static void main(String[] args) {
		// configura Locale
		Locale.setDefault(Locale.US);
				
		// instancia objeto Scanner
				Scanner tela = new Scanner(System.in);
				
		// declara variáveis primitivas
		
				
		// entrada de dados
		System.out.print("Digite a sequência de números inteiros (0 encerra): ");
		int num = Integer.parseInt(tela.nextLine());
		double soma = 0;
		int i = 0;
		
		while ( num != 0) {
						
			soma += num; // soma = soma +(Math.pow(num, 2));
			System.out.print("Digite o próximo valor inteiro da sequência (0 encerra): ");
			num  = Integer.parseInt(tela.nextLine());
			
			
		}
		System.out.println(((soma != 0) ? String.format("Resposta: Soma total dos seus quadrados é igual a %.0f", soma): ""));
		
	
		System.out.println("Fim do programa");
		
	}

}
