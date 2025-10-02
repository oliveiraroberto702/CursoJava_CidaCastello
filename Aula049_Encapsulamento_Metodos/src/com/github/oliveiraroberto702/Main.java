package com.github.oliveiraroberto702;

import com.github.oliveiraroberto702.modelo.PessoaFisica;

public class Main {

	public static void main(String[] args) {
		// instancia pessoa fisica
		PessoaFisica pf = new PessoaFisica();
		
		pf.guardarNome("Cida");
		String nomeRecebido = pf.recuperarNome();
		System.out.println("Nome: " + nomeRecebido);
		
		pf.guardarSobrenome("Castello");
		String sobrenome = pf.recuperarSobrenome();
		System.out.println("Sobrenome: " + sobrenome);
		
		pf.guardarCpf("123.456.789-00");
		System.out.println("CPF " + pf.recuperarCpf());
		
		pf.guardarTelefone("9-6587-7898");
		System.out.println("Telefone: " + pf.recuperarTelefone());
		
		pf.guardarEmail("cidaCastello@hotmail.com");
		System.out.println("Email: " + pf.recuperarEmail());
		
		
		// pf 1
//		pf.nome = "Marcia";
//		pf.sobrenome = "Baccarat";
// 		pf.cpf = "123456-78";
//		pf.telefone = "988211908" ;
//		pf.email = "mbvascol@hotmail.com";
		
		
		
		
		
		

	}

}
