package com.github.oliveiraroberto702;
// imports
import com.github.oliveiraroberto702.modelo.Carro;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hello, minha primeira classe!");
		// criando objeto do tipo Carro
		// tipo - nome = new construtor da classe
		Carro carro = new Carro();
		carro.marca = "VW";
		carro.modelo = "Nivus";
		carro.anoFabricacao = 2024;
		carro.cor = "Cinza";
		carro.preco = 119900.0;
		
		
		
		// segundo objeto do tipo
		Carro carro2 = new Carro();
		carro2.marca = "Chevrolet";
		carro2.modelo = "Onix";
		carro2.preco = 72500.0;
		carro2.anoFabricacao = 2023;
		carro2.cor = "Prata";
		
		// carro
		System.out.println("Marca: " + carro.marca);
		
		
		// carro 2
		System.out.println("Marca: " + carro2.marca);
		
	}

}
