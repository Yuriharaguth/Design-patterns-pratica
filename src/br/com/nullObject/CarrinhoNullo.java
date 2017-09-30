package br.com.nullObject;

public class CarrinhoNullo extends Carrinho {
	
	public String getValor(){
		return "0.0";
	}
	
	public String getTamanho(){
		return "0";
	}
	
	public String getNomeUsuario(){
		return "<a href=login.jsp>Login</a>";	
	}
	
	public CarrinhoNullo() {
		// TODO Auto-generated constructor stub
	}

}
