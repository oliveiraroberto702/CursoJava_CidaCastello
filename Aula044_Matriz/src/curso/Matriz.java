package curso;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		
		// declaração [Linhas] [colunas]
		double [] [] notas = new double[5] [10];
		int numeros [] [] = new int[5][8];
		char [][] letras = {{'a', 'b'}, {'c', 'd'}};
		Random ramdom = new Random();
		
		// preencher com números aleatórios
		// percorrendo / iterando a matriz
		// linhAS COLUNAS
		for(int i=0; i < numeros.length; i++) {
			for(int j = 0; j <numeros[i].length; j++) {
				numeros[i][j] = 1 + ramdom.nextInt(100);
			
				
			}
		
		}
		
		// saida
		// percorrendo // iterando a amatriz
		for(int i = 0; i < numeros.length; i++) {
			for(int j=0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
				
			}
			System.out.println();
		}
		

	}

}
