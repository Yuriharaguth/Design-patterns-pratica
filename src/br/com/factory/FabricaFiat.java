package br.com.factory;

public class FabricaFiat implements FabricaDeCarro {

	public Carro criarCarro() {
		return new Palio();
	}
	
}
