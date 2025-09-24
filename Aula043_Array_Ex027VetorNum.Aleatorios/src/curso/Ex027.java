package curso;

import java.util.Arrays;
import java.util.Random;

public class Ex027 {
	public static void main(String[] args) {
		
		int [] array = new int[50];
		Random random = new Random();
		
		int par = 0, impar = 0;
		int indicePar = 0, indiceImpar = 0;
		// gerar o array com numeros aleatórios
		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + random.nextInt(100);
			if (array[i] % 2 == 0 ) {
				par += 1;
				
			}
			else {
				impar += 1;
				
			}
		}	
		// arrays pae - ímpar
		int [] arrayPar = new int[par];
		int [] arrayImpar = new int[impar];
			
		// pércorrer o array e preencher arrays par e ímpar
		for(int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				arrayPar[indicePar] = array [i];
					indicePar++;
			} 
			else {
				arrayImpar[indiceImpar] = array [i];
				indiceImpar++;
			}
		}
		// saída dos 3 vetores
		System.out.println("\nArray\n");
		for (int i=0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		System.out.println("\nPar\n");
		for (int i=0; i < arrayPar.length; i++) {
			System.out.println(arrayPar[i]);
			
		}
		System.out.println("\nImpar\n");
		for (int i=0; i < arrayImpar.length; i++) {
			System.out.println(arrayImpar[i]);
			
		}
		System.out.println("\n========================\n" + arrayPar.length + " +  " +  arrayImpar.length + " = " + (arrayPar.length + arrayImpar.length));
		
		// ordenação dos valores dos vetores
		Arrays.sort(arrayPar);
		Arrays.sort(arrayImpar);
		System.out.println("\n--------------------------------\nOrdenados");
		System.out.println("\nPar\n");
		for (int ipar : arrayPar) {
			System.out.println(ipar);
			
		}
		System.out.println("\nÍmpar\n");
		for (int jImpar : arrayImpar) {
			System.out.println(jImpar);
			
		}

		

	}
}
