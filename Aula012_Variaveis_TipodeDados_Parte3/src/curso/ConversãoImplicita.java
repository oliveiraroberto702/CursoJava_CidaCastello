package curso;
/**
 * @author Roberto Oliveira
 * Programa para conversão de dados
 * Explicitamente
 */

public class ConversãoImplicita {
	
	public static void main (String[] args) {
		
		// do menor para o maior
		byte varByte = 21;
		int varInt = varByte;
		System.out.println("Byte: " + varByte); // concatenação
		System.out.println("Int: " + varInt);
		
		double varDouble = varInt;
		System.out.println("Double: " + varDouble);
		
	}

}
