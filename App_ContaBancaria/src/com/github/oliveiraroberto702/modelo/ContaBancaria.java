package com.github.oliveiraroberto702.modelo;

import javax.swing.JOptionPane;

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
	
	
	// nosssos métodos
	
	public void depositar(double valor) {
		if(!ativa) {
			JOptionPane.showMessageDialog(null, "Conta Desativada!");
			return;
		} else 	if(valor <= 0 ) {
			JOptionPane.showMessageDialog(null, "Valor R$ " + valor + " inválido!");
			return;
		} else {
		
			saldo = saldo + valor; // saldo -= valor
		}
		
	}
	
	public void sacar(double valor) {
		if(!ativa) {
			JOptionPane.showMessageDialog(null, "Conta Desativada!");
			return;
		} else 	if(valor <= 0 ) {
			JOptionPane.showMessageDialog(null, "Valor R$ " + valor + " inválido!");
			return;
		} else if (saldo < valor) {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente de R$ " + saldo + "para retirada de R$ " + valor);
			return;
			
		} else {
			saldo -= valor;  // saldo = saldo - valor
		}

		
	}
}
