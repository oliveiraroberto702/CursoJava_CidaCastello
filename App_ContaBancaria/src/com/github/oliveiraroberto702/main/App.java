package com.github.oliveiraroberto702.main;

import java.util.Locale;

import com.github.oliveiraroberto702.modelo.ContaBancaria;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ContaBancaria conta = new ContaBancaria();
		//setters -- seta os valores
		conta.setNome("Roberto");
		conta.setNumeroDaConta("123.456-7");
		conta.setAgencia("123-4");
		conta.setSaldo(125000.00);
		conta.setAtiva(false);
		// getters -- pega os valores setados
		System.out.println("Nome: " + conta.getNome());
		System.out.println("Número da Conta: " + conta.getNumeroDaConta());
		System.out.println("Agência: " + conta.gettAgencia());
		System.out.printf("Saldo: R$ %.2f%n",conta.getSaldo());
		System.out.println(conta.IsActive() ? "Ativa? SIM" : "Ativa? NÃO");
			
		// depositando valor na conta bancária
	//	for (int i =0; i < 4; i++) {
			conta.depositar(1000.0);
			System.out.println(conta.IsActive() && conta.getSaldo() > 0 ? "Novo Saldo: R$ " + conta.getSaldo() : " ");	
	//	}
		
	}

}
