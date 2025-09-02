package curso;

import java.util.Scanner;

public class Ex03NomeIdade {

	public static void main(String[] args) {
		
		// instanciar um objeto da classe Scanner
		//criar um objeto
		Scanner teclado = new Scanner(System.in);
		// variaveis
		String nome;
		String sobrenome;
		int idade;
		
		//entrada de dados
		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite seu sobrenome: ");
		sobrenome= teclado.nextLine();
		System.out.print("Digite sua idade: ");
		idade = teclado.nextInt();
		// saída de dados
		System.out.println("Seu nome é " + nome + " " + sobrenome + " e você tem " + idade + " anos");
		
	}
}
