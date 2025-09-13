package curso;
/*
 * id (int), nome String), descricao (String)
 * quantidade (int), precoUnitario (double)
 * taxaDeImposto (double), 
 *  valorDoImposto (double), precoTotal (double)
 *  valoTotaDaCompra ()double)
 */
import java.util.Locale;
import java.util.Scanner;

public class Ex024Desafio {

	public static void main(String[] args) {
		// configurar Locale
		Locale.setDefault(Locale.US);
		// INSTANCIA objeto Scanner
		Scanner sc = new Scanner (System.in);
		// declara variaveis
		int id, quantidade;
		double precoUnitario, taxaDeImposto, valorDoImposto, precoTotal, valorTotalDaCompra;
		String nome, descricao;
		
		// entrada de dados
		System.out.print("ID: ");
		id = Integer.parseInt(sc.nextLine());	
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Descrção: ");
		descricao = sc.nextLine();
		System.out.print("Quantidade: ");
		quantidade = Integer.parseInt(sc.nextLine());
		System.out.print("Preço Unitário: ");
		precoUnitario = Double.parseDouble(sc.nextLine());
		System.out.print("Taxa de Imposto: ");
		taxaDeImposto = Double.parseDouble(sc.nextLine());
		
		// processamento - calculo dos valores
		
		precoTotal = precoUnitario * quantidade;
		valorDoImposto = (taxaDeImposto/100) * precoTotal;
		valorTotalDaCompra = precoTotal + valorDoImposto;
		
		// saida de dados
		System.out.println("\n" + "=========================================================");
		System.out.println("Produto: Código " + id + ", " + descricao);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço Unitário: R$ " + precoUnitario);
		System.out.println("Preço Total: R$ " + precoTotal);
		System.out.println("Valopr do Imposto: R$ " + valorDoImposto);
		System.out.println("Valor Total da Compra: R$ " + valorTotalDaCompra);
		
		
		
		
				
		
	}
}
