package curso;
/**
 * Curso de Java - RODRIGO fREITAS - aULA 15: Ler, Criar, Deletar, Arquivos TXT - Curso de Java Interface
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PrincipalArquivoTexto {

	public static void main(String[] args) throws IOException {
		
              
		Path caminho =  Path.of("c:/ws-roberto/text02.txt");
		/*
		if(Files.notExists(caminho)) {
			Files.createFile(caminho);
		}
		
		String texto = "oi tudo bem?";
		
		byte[] bytes = texto.getBytes();
		Files.write(caminho, bytes);
		
		
		// Files.writeString(caminho, texto1);   alternativo
		*/
		
		/*
		List<String> strings = Files.readAllLines(caminho);
		for (String texto: strings) {
			System.out.println(texto);
		}
		// forma alternativa
		byte[] bytes = Files.readAllBytes(caminho);
		String texto =  new String(bytes); //bytes.toString(); // em razão do último mandar uma mensagem
		
		System.out.println(texto);
		*/
		
		Files.delete(caminho);
		
		
		

	}

}
