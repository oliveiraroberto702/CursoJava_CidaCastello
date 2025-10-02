package com.github.oliveiraroberto702.modelo;

public class ContaBancaria {
	
	// atributos
	private String nome;
	private String numeroDaConta;
	private String agencia;
	private double saldo;
	private boolean ativa;
	
	// métodos
	
	// setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void setAtiva(Boolean ativa) {
		this.ativa = ativa;
	}
	
	// getters
	public String getNome() {
		return nome;
	}
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public String gettAgencia() {
		return agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public boolean IsActive() {
		return ativa;
	}

}
