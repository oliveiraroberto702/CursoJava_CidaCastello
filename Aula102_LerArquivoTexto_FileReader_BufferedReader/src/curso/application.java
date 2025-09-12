package curso;

import java.io.BufferedReader;
import java.io.FileReader;


import java.io.EOFException;

/*
 * DevSuperior - "Ler arquivo texto com FileReader e BufferedReader - Aulao #002"
 */

public class application {

	public static void main(String[] args) {
		
		String path = "c:/ws-roberto/in.txt";
		FileReader fr = null; //classe padrão pára ler uma stream de dados
		BufferedReader br = null; // classe que gerencia a memória para a leitura
		
		try {
			
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line =br.readLine();
				
				
			}
			
			
			
		} 
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
			br.close();
			fr.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			// TODO: handle exception
		}
		
	}

}
