package curso;

public class DesafioEx18 {

	public static void main(String[] args) {
		int soma = 0;
		int dividendo = 1;
		for (int divisor = 1; divisor <= 50; divisor++) {
			soma = soma + (dividendo/divisor);
			System.out.println(dividendo + "/" + divisor + " - " + soma);
			dividendo += 2;
		}
		System.out.println("Sequência " + soma);

	}

}
