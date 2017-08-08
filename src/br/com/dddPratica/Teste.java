package br.com.dddPratica;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
		Funcionario funcionario = new Funcionario(5222, Cargo.DBA);
		
		System.out.println(calculadoraDeSalario.calcula(funcionario));

	}

}
