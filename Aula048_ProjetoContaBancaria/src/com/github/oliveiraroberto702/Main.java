package com.github.oliveiraroberto702;

import com.github.oliveiraroberto702.objeto.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		// instanciar a classe ContaBancaria
		//criar o objeto tipo ContaBancaria
		ContaBancaria conta = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		
		// conta 1
		conta.agencia = "123-4";
		conta.numeroDaConta = "7683.678-0";
		conta.nome = "Roberto V Oliveira";
		conta.saldo = 12789.0;
		
	
		
		System.out.println("Nome: " + conta.nome);
		System.out.println("Nº Conta: " + conta.numeroDaConta);
		System.out.println("Agência: " + conta.agencia);
		System.out.println("Saldo: " + conta.saldo);
		
			// conta 2
			conta2.agencia = "123-4";
			conta2.numeroDaConta = "512.677-9";
			conta2.nome = "Carlos Roberto da Silva";
			conta2.saldo=1456756.0;
			
			System.out.println("Nome: " + conta2.nome);
			System.out.println("Nº Conta: " + conta2.numeroDaConta);
			System.out.println("Agência: " + conta2.agencia);
			System.out.println("Saldo: " + conta2.saldo);

	}

}
