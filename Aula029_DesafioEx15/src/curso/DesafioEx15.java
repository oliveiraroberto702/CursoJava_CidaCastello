package curso;

import java.util.Locale;
import java.util.Scanner;

public class DesafioEx15 {
	
	public static void main(String [] args) {
		
		
	// comfigura Locale
	Locale.setDefault(Locale.US);
		
	// instancia objeto Sanner
	Scanner tela = new Scanner(System.in);
	
	// declara variáveis
	double nota1, nota2, media;
	
	
	// entrada de dados
	System.out.print("Digite a 1ª nota:  ");
	nota1 = Double.parseDouble(tela.nextLine());
	System.out.print("Digite a 2ª nota:  ");
	nota2 = Double.parseDouble(tela.nextLine());
	
	// calcula a média
	media = (nota1 + nota2) / 2;
	// \n -> escape, pular uma linha, enter
	// classsiica e apresenta o resultado
	String saida;
	System.out.println("Média  Conceito    Situação");
	if (media >=9.0) {
		saida = String.format(" %.1f       A      Aprovado", media);
		System.out.print(saida);
				
	} else if (media >=8.0 && media < 9.0) {
		saida = String.format(" %.2f       B      Aprovado", media);
		System.out.print(saida);
	} else if (media >= 7.0 && media < 8.0) {
		saida = String.format(" %.2f       C      Aprovado", media);
		System.out.print(saida);
	} else if (media >= 6.0 && media < 7.0) {
		saida = String.format(" %.2f       D      Recuperação", media);
		System.out.print(saida);
	} else {
		saida = String.format(" %.2f       E      Reprovado", media);
		System.out.print(saida);
	}
	
	}
}
