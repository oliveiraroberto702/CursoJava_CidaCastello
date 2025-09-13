package curso;

import java.util.Locale;
import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// instancia OBJETO sCANNER
		Scanner sc = new Scanner(System.in);
		
		// declara variáveis
		int numero;
		
		// entrada de dados
		System.out.print("Digite um número inteiro: ");
		//numero = sc.nextInt();
		numero = Integer.parseInt(sc.nextLine())
				;
		// verifica se é par ou ímpar
		int resto = numero % 2;
		if (resto == 0) {
			System.out.println(numero + " é par");
			
		} else
			System.out.println(numero + " é ímpar");
	}

}
