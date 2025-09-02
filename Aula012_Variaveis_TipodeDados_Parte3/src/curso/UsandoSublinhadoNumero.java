package curso;
/**
 * @author Roberto Oliveira
 * Usando sublinhado em números
 * 
 */
public class UsandoSublinhadoNumero {

	public static void main(String[] args) {
		
		long numeroCartaoDeCredito = 1234_5678_9012_3456L;
		System.out.println("Número cartão de crédito: " + numeroCartaoDeCredito);
		
		// válido
		float pi = 3.14_15F;
		// inválido
		// float pi =3._1415;
		//float pi = 3.14_15F;
		
		// Válido
		int varInt = 5_2;
		System.out.println(varInt);
		// inválido
		// int varInt1 = 52_;
		
	}

}
