package curso;

import java.util.Scanner;

public class DesafioExercicio04 {

	public static void main(String[] args) {
		
		// instanciar objeto da classe scanner
		// criar objeto
		Scanner sc = new Scanner(System.in);
		
		// declarar variaveis
		int num1, num2, soma;
		
		// entrada de dados
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		// processamento
		//soma = num1 + num2;
		
		// saída de dados
		// System.out.println("Soma = " + soma);
		// System.out.println("Soma = " + num1 + num2);
		System.out.println("Soma = " + (num1 + num2));
		sc.close();
		//num1 = sc.nextInt();
		
		
	}
}
