package curso;
/*
 * fórmula F = (9*c = 160)/5 
 * fahreinheit (double), celsius 
 */
import java.util.Locale;
import java.util.Scanner;

public class ConversorDeTemperaturas {

	public static void main(String[] args) {
		
		//configura Locale
		Locale.setDefault(Locale.US);
		
		// instanca objeto Scanner
		Scanner tela = new Scanner(System.in);
		
		// declara variáveis
		double fahreinheit, celsius;
		
		
		// entrada de dados
		System.out.print("Digite a temperatura em Celsius: ");
		celsius = Double.parseDouble(tela.nextLine());
		
		// converte para temperatura celsius para temperatua em fahreinheit
		fahreinheit = (9 * celsius + 160) / 5;
		
		
		// saida de dados
		
		String saida; 
			
		if (fahreinheit > 45 && fahreinheit < 90) {
			saida = String.format("Equivale a %.1fF, temperarura ideal para o experimento", fahreinheit); 
		} else {
			saida = String.format("Equivale a %.1fF, temperarura inapropriada para o experimento", fahreinheit);
		}
		System.out.println(saida);
				
		
	}

}
