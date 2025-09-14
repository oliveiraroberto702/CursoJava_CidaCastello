package curso;

public class CondicionalTernaria {
	public static void main (String[] args) {
		
		// condiocional composta
		// if(condição) {
		//	verdadeira
		// else {
		//	falsa
		// }
		
		// condicional ternária
		// variável/print = condição ? verdadeira: falsa
		
		int x =921;
		System.out.println((x % 2 == 0) ? "Par": "Impar");
		
		int a = 80, b;
		b = a >= 0 ? 1 : -1;
		System.out.println(b);
		
		double valor = 100;
		
		double desconto = valor * (valor >= 150 ? 15.0/100 : 5.0/100);
		System.out.println(String.format("desconto de R$ %.2f",desconto));
		System.out.println(String.format("Valor a pagr R$ %.2f",(valor - desconto)));
		
		/*
		 * if (x % 2 == 0) {
				System.out.println("Par");
		 * 
		 * }else { 
		 * System.out.println("Ímpar");
		    }
		 */
		
		
		
	}
}
