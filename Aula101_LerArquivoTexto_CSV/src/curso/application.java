package curso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * DevSuperior - "Como ler arquivo texto em Java *(aplicação real) - Aulão #002
 * github> "github.com/devsuperior/aulao002"
 */


public class application {

	public static void main(String[] args) {
		File file = new File("C:\\ws-roberto\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner (file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line); // ou System.out.println(sc.nextLine());
									
			}
			// sc.close();
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			
					
		}
		finally {
			if (sc != null)
			sc.close();
		}
		

	}

}
