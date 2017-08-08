package br.com.dddPratica;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		if (Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return Cargo.DESENVOLVEDOR.getRegra().calcula(funcionario);
		}
		
		if(Cargo.DBA.equals(funcionario.getCargo()) 
				|| Cargo.TESTER.equals(funcionario.getCargo())){
			return Cargo.DBA.getRegra().calcula(funcionario);
		}

		throw new RuntimeException("funcionario invalido");
					
	}
		
}
