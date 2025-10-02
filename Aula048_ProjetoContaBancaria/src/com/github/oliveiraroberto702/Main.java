package com.github.oliveiraroberto702;

import java.util.Locale;

import com.github.oliveiraroberto702.modelo.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// instancia objeto 1
		ContaBancaria conta = new ContaBancaria();
		conta.nome = "Rafa";
		conta.numeroDaConta = 	"1234-5";
		conta.agencia = "123-4";
		conta.saldo = 120.90;
		
		System.out.println("Nome: " + conta.nome);
		System.out.println("Número da Conta: " + conta.numeroDaConta);
		System.out.println("Agencia: " + conta.agencia);
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("-----------------------------------");
		// instancia objeto 2 da classe ContaBancaria
		ContaBancaria conta1 = new ContaBancaria();
		conta1.nome = "Bela";
		conta1.numeroDaConta = 	"67899-0";
		conta1.agencia = "567-9";
		conta1.saldo = 350000.00;
		
		System.out.println("Nome: " + conta1.nome);
		System.out.println("Número da Conta: " + conta1.numeroDaConta);
		System.out.println("Agencia: " + conta1.agencia);
		System.out.println("Saldo: " + conta1.saldo);
		System.out.println("-----------------------------------");
		
	}

}
