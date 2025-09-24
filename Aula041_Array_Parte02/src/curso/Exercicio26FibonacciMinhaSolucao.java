package curso;

import java.util.Scanner;

public class Exercicio26FibonacciMinhaSolucao {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int num;
		
		System.out.print("Digite o nº do termo desejado da série de Fibonnacci: ");
		num = Integer.parseInt(sc.nextLine());
		int fibo [] = new int[num];
		
		fibo[0]=0;
		fibo[1]=1;
		
		for (int i=0; i<=(fibo.length-1); i++) {
			if ( i <= 1 ) {
				fibo[i] = i;
			} else {
				fibo[i] = fibo[i-2] +  fibo[i-1];
			}
			System.out.println(fibo[i]);
			
		}
		System.out.println("Termo " + num + "º = " + fibo[num-1]);	
		
	}

}
