package curso;

import java.util.Locale;
import java.util.Scanner;

public class CalculoMediaNotas {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner tela = new Scanner (System.in);
		
		double [] nota = new double[2];
		double media;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Notas do Aluno " + i + " ==>");
			media = 0.0;
			for (int j = 0; j < 2; j++) {
				System.out.print("Digite a " + (j+1) + "ª Nota: ");
				nota[j] = Double.parseDouble(tela.nextLine());
				while (nota[j] < 0.0 | nota[j] > 10.0) {
					System.out.print("Nota deve está entre 0 e 10. Digite novamente a " + (j+1) + "ª Nota: ");
					nota[j] = Double.parseDouble(tela.nextLine());
									
				}
				media = media + nota[j];
			}
			System.out.println("Média = " + media/2.0);
			System.out.println("------------------------------\n");
		}
		
		System.out.println("Fim do programa");
		
		
		
	}

}
