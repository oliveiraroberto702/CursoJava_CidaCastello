package curso;
/**
 * @author rober
 * 
 */
import java.util.Locale;
import java.util.Scanner;

public class Ex08MediaAritmetica {
	
	public static void main (String[] args) {
		// DECLARAR VARIÁVEIS
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		double nota1, nota2, media;
		
		// ENTRAR DADOS
		System.out.print("Digitar a Nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.print("Digitar a Nota 2: ");
		nota2 = entrada.nextDouble();
		
		// CALCULAR A MEDIA ARITMÉTCIA DAS NOPTAS
		media = (nota1 + nota2) / 2;
		
		// APRESENTAR A MÉDIA ARITMÉTICA
		System.out.println("Média Aritmética = " + media);
		
						
		
	}

}
