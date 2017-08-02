package br.com.interfaces;

public class Diretor extends Funcionario implements Autenticavel{

	public Diretor(String nome) {
		super(nome);
	}

	@Override
	public boolean autentica(int senha) {
		// REGRA ESPECIFICA PARA DIRETOR
		return true;
	}

}
