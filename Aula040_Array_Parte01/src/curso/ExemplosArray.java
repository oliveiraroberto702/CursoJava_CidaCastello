package curso;

public class ExemplosArray {

	public static void main(String[] args) {
		// declaração de arrays
		int pontos []; // int pontos [];
		pontos = new int[5];
		
		// declaração em um única linha
		int valores [] = new int[10];
		
		double notas [] = new double[100];
		
		double salarios [] = new double[5];
		// atrbui valores de salários
		salarios[0] = 3250.0;
		salarios[1] = 680.23;
		salarios[2] = 6200;
		salarios[3] = 7658.32;
		salarios[4] = 925.01;
		
		double [] despesas = {3250, 680.23, 1528.32, 682.65};
		
		int [] num = {1, 2, 3, 4, 5 , 6, 7, 8, 9};
		
		// para ler um vetor, percorrer o vetor
		// laço repeticção
		for (int i = 0; i < 9; i++) {
			// apresentar todos os elementos do vetor
			System.out.println(num[i]);
		}
		/*
		 * método length() é reponsável por retornat o número de
		 * um Array
		 */
		for (int j = 0; j < despesas.length; j++) {
			System.out.println(despesas[j]);
		}
		
		String nomes [] = {"Maria", "José", "Anderson", "Maria"};
		for (int z = 0; z < nomes.length; z++) {
			System.out.println(nomes[z]);
		}
		String sobrenomes [] = new String[3];
		sobrenomes[0] = "Silva";
		sobrenomes[1] = "Oliveira";
		sobrenomes [2] = "Costa";
		// sobrenomes[3] = "Pereira";
		for (int q = 0; q < sobrenomes.length; q++) {
			System.out.println(sobrenomes[q]);
		}

	}

}
