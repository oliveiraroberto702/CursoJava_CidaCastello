package com.github.oliveiraroberto702.modelo;

public class PessoaFisica {
	
	// atributos 
	//modificador de aesso - tipo - nome
	private String nome;
	private String sobrenome;
	private String cpf;
	private String telefone;
	private String email;

	// métodos
	// modificador de acesso - tipo de retorno
	// nome do método parâmetro
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// recuperar o nome
	// modificador de acesso - tipo retorno
	// nome do método - parâmetro
	public String getNome() {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		
	}
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	public String getEmail () {
		return email;
	}
}
