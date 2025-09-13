package curso;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class Paciente {
	
	/*
	 * nome comleto
	 * e-mail e telefone de contato
	 * idade, peso e altura
	 */
	
	public static void main(String[] args) throws IOException {
		// config do Locale
		Locale.setDefault(Locale.US);
		Path caminho = Path.of("C:\\ws-roberto\\arquivo.txt");
		if (Files.notExists(caminho)) {
			Files.createFile(caminho);
		}
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		String nomeCompleto, email, telefone;
		int idade;
		double peso, altura;
		
		// entrada de dados
		System.out.print("Nome Completo: ");
		nomeCompleto= sc.nextLine();
		System.out.print("E-mail: ");
		email = sc.nextLine();
		System.out.print("Telefone: ");
		telefone = sc.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(sc.nextLine());
		System.out.print("Peso:  ");
		peso = Double.parseDouble(sc.nextLine());
		System.out.print("Altura: ");
		altura = Double.parseDouble(sc.nextLine());
		// saida de dados
		System.out.println("Nome: " + nomeCompleto);
		System.out.println("E-mail: " + email + " Telefone: " + telefone);
		System.out.println("Idade: " + idade + " " + "Peso: " + " Altura: " + altura);
		
		// Files.writeString(caminho, texto1);   alternativo
		String texto = "\n" + nomeCompleto + "," + email + "," + telefone + "," + idade + "," + peso + "," + altura;
		//Files.writeString(caminho, texto);
		String caminhoArquivo = "c:\\ws-roberto\\arquivo.txt";
		try (FileWriter fw = new FileWriter(caminhoArquivo, true);
				PrintWriter pw = new PrintWriter(fw))  {
			// escreve novo registro no final do arquivo
			pw.println(texto);
			System.out.println("registro adicionado com sucesso");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro ao adicionar registro ao arquivo: " + e.getMessage());
			e.printStackTrace();
			
		}
	}	
}
