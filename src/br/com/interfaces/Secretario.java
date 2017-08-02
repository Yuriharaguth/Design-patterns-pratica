package br.com.interfaces;

public class Secretario extends Funcionario implements Autenticavel{

	private String sobrenome;

	public Secretario(String nome, String sobrenome) {
		super(nome);
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public boolean autentica(int senha) {
		// REGRA DE NEGOCIO especifica para secretario
		return true;
	}
	
	
}
