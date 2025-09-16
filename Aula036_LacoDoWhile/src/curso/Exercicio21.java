package curso;
import java.util.Locale;
import java.util.Scanner;


public class Exercicio21 {

	public static void main (String [] args) {
		
		// seta Locale
		Locale.setDefault(Locale.US);
		
		// instacia tela como ojeto Scanner
		Scanner tela = new Scanner(System.in);
		
		// declara variáveis primitivas
		double nota;
		int aluno = 1;
		
		// entrada de dados - processamento
		do {
			double soma = 0;
			System.out.println("Aluno " + aluno);
			for (int i = 1; i<=2; i++) {
			     System.out.print(i + "ª Nota: ");
			     nota = Double.parseDouble(tela.nextLine());
			     soma = soma + nota;
			}
			System.out.println("Média do Aluno " + aluno + " = "+ (soma/2) + "\n");
			aluno++;
									
		} while(aluno <= 3);
		
	    System.out.println("Fim Programa");
	}
}
