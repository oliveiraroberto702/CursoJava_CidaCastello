package com.github.oliveiraroberto702.main;

import com.github.oliveiraroberto702.modelo.PessoaFisica;

public class App {

	public static void main(String[] args) {
		
		
		// get
		// retornar valor - get --> pegar
		
		
		// set 
		// void - não rfetyornar valor --> receeber parâmetro
		
		
		
		
		// instancia pessoa fisica
				PessoaFisica pf = new PessoaFisica();
				
				pf.setNome("Cida");
				String nomeRecebido = pf.getNome();
				System.out.println("Nome: " + nomeRecebido);
				
				pf.setSobrenome("Castello");
				String sobrenome = pf.getSobrenome();
				System.out.println("Sobrenome: " + sobrenome);
				
				pf.setCpf("123.456.789-00");
				System.out.println("CPF " + pf.getCpf());
				
				pf.setTelefone("9-6587-7898");
				System.out.println("Telefone: " + pf.getTelefone());
				
				pf.setEmail("cidaCastello@hotmail.com");
				System.out.println("Email: " + pf.getEmail());

	}

}
