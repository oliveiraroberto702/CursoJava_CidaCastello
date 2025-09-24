package curso;

import javax.swing.JOptionPane;

public class AppFibonacciEx26 {

	public static void main(String[] args) {
		
		
		
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Termo desejado da Série de Fibonacci? "));
		while (num <= 0)  {
			num = Integer.parseInt(JOptionPane.showInputDialog("Termo inválido. \n Tente novamente. \nTermo desejado da Série de Fibonacci? "));
			
		}
		int vetor [] = new int[num];
		
		for (int i = 0; i < vetor.length; i++) {
			if ( i == 0 || i == 1) {
				vetor[i] = i;
				
			} else {
				vetor[i] = vetor[i-2] + vetor[i-1];
				
			}
			System.out.print((i == num -1) ? vetor[i] : vetor[i] + ", " );
		}
		
		JOptionPane.showMessageDialog(null, "Termo " + num + "º é : " + vetor [num-1]);
		
	}

}
