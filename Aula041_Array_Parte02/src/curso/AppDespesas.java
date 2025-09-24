package curso;

import java.util.Locale;

import javax.swing.JOptionPane;

public class AppDespesas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double [] despesas = new double [4];
		for (int i=0; i< despesas.length; i++) {
			despesas[i] = Double.parseDouble(JOptionPane.showInputDialog("Valor da " + (i+1) + "ª despesa: "));
			
		}
		double valorTotal =0.0;

		for (double desp : despesas) {
			System.out.println("R$ " + desp);
			valorTotal += desp;
		}
		JOptionPane.showMessageDialog(null, "Total = R$ " + valorTotal);	
	}	

}
