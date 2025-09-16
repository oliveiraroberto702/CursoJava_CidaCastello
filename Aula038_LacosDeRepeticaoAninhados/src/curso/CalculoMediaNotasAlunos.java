package curso;

import java.util.Locale;
import java.util.Scanner;



public class CalculoMediaNotasAlunos {

	public static void main(String[] args) {
		
		// configura Locale
		Locale.setDefault(Locale.US);
		
		// instancia objeto Scanner -> tela
		Scanner  tela =  new Scanner(System.in);
		
		// declara variáveis primitivas
		double nota1, nota2, media;
		int numAluno = 5;
		
		for (int i = 1 ; i <= numAluno; i++) {
			System.out.println("ALUNO: " + i);
		    // entrada de dados		
			System.out.print("Digite a 1ª Nota: ");
			nota1 = Double.parseDouble(tela.nextLine());
			while (nota1 < 0. ||  nota1 > 10.) {
				System.out.print("Nota deve ser entre 0 e 10. Digite novamente a 1ª Nota: ");
				nota1 = Double.parseDouble(tela.nextLine());
			}
			System.out.print("Digite a 2ª Nota: ");
			nota2 = Double.parseDouble(tela.nextLine());
			while (nota2 < 0. ||  nota2 > 10.) {
				System.out.print("Nota deve ser entre 0 e 10. Digite novamente a 2ª Nota: ");
				nota2 = Double.parseDouble(tela.nextLine());
			}
		// saida 
			System.out.println("Média do Aluno: " + ((nota1 + nota2)/2.0));
		}
		
		System.out.println("==============================");
	}

}
