package curso;

import javax.swing.JOptionPane;

public class AppVet {

	public static void main(String[] args) {
		int [] vetor = new int[5];
		
		for (int i=0; i < vetor.length; i++) {
			vetor[i]= Integer.parseInt(JOptionPane.showInputDialog("Valor da Despesa R$ "));
					
		}
		
	// saída
		int total = 0;
		for (int val : vetor) {
			total += val;
			System.out.println("Valor : 3R$ " + val);
		}
		double media = (total/5.0);
		JOptionPane.showMessageDialog(null, "Média = R$ " + media);
		
		
		
	}	
}
