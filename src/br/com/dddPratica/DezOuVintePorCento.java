package br.com.dddPratica;

public class DezOuVintePorCento implements RegraDeCalculo{

	public DezOuVintePorCento() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		}
		else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

}
