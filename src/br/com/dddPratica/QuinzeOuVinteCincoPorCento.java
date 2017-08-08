package br.com.dddPratica;

public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo{

	public QuinzeOuVinteCincoPorCento() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.1;
		}
		else {
			return funcionario.getSalarioBase() * 0.2;
		}
	}

}
