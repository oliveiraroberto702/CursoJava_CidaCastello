package com.github.oliveiraroberto702;

import com.github.oliveiraroberto702.modelo.PessoaFisica;

public class Main {

	public static void main(String[] args) {
		// instancia pessoa fisica
		PessoaFisica pf = new PessoaFisica();
		// pf 1
		pf.nome = "Marcia";
		pf.sobrenome = "Baccarat";
		pf.cpf = "123456-78";
		pf.telefone = "988211908" ;
		pf.email = "mbvascol@hotmail.com";
		PessoaFisica pf2 = new PessoaFisica();
		// pf 2
		pf2.nome = "José";
		pf2.sobrenome = "Baccarat";
		pf2.cpf = "223456-12";
		pf2.telefone = "727211908" ;
		pf2.email = "JoseBaccarat@gmail.com";
		System.out.println("Nome: " + pf.nome);
		System.out.println("Sobrenome: " + pf.sobrenome);
		System.out.println("CPF: " + pf.cpf);
		System.out.println("Telefone: " + pf.telefone);
		System.out.println("Email: " + pf.email);
		System.out.println("Nome: " + pf2.nome);
		System.out.println("Sobrenome: " + pf2.sobrenome);
		System.out.println("CPF: " + pf2.cpf);
		System.out.println("Telefone: " + pf2.telefone);
		System.out.println("Email: " + pf2.email);
		
		
		
		

	}

}
