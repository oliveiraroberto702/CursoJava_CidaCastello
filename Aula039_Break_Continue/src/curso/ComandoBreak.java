package curso;

public class ComandoBreak {
	public static void main (String[] args) {
		
		int x = 0;
		
		while (true) {
			System.out.println("Valor de x = " + x);
			x++;
			if (x==10) {
				System.out.println("Laço de Repetição interrompido");
				break;
			}
			
		}
		System.out.println("Depois do Laço de repetição");
	}

}
