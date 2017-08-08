package br.com.dddPratica;

public class Funcionario {

	private double salarioBase;
	private Cargo cargo;

	public Funcionario() {
		super();
	}

	public Funcionario(double salarioBase, Cargo cargo) {
		super();
		this.salarioBase = salarioBase;
		this.cargo = cargo;
	}

	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
}
