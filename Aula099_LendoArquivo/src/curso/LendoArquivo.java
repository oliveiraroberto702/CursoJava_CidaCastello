package curso;
/*
 * O Menta 3D - "Como ler arquivos de texto em Java utilizando a classe Scanner"
 * resultado da co nsulta no youtube "gravar lea arquivo txt scanner java eclipse" 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LendoArquivo {

	public static void main(String[] args) throws FileNotFoundException{
		
		String caminho = "C:/ws-roberto/texto.txt";
		String linha ="";
		File file = new File (caminho);
		Scanner scan = new Scanner (file);
		
		for (int i =0; i<file.length();i++) {
			
			if (scan.hasNextLine()) {
				linha = scan.nextLine();
				System.out.println(linha);
			}
		}
		
	}
}
