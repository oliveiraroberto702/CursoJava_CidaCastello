package curso;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {
		
		// conmfigura Locale
		Locale.setDefault(Locale.US);
		
		// instancia objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// declara variáveis primitivas
		int n = 0, fatorial = 1;
		boolean ok = false, erro = true;
		while (ok == false) {
				
			System.out.print("Digite o número inteiro a ser fatorado: ");
			if (sc.hasNextInt()) {
				n = Integer.parseInt(sc.nextLine());
				ok =true;
			} else { 
		       	System.out.println("número inválido");
		       	n = 0;
		       	
		    }
		}

    	for (int i = n; i > 0; i--) {
    		fatorial = (( i == n) ? i :  (fatorial * i));
	     }
		 
	    System.out.println("Fatorial de " + n + "! é igual a " + fatorial);
				
	}

}
