package br.com.nullObject;

public class ApresentacaoCarrinho {

	public void colocarInformacoesCarrinho(String HTTPServletRequest) {
		// logica para pegar carrinho no cokie
		// Carrinho c = CookieFactory.criarCarrinho(request);
		Carrinho c = pegarCarrinho();
		System.out.println("valor" + c.getValor());
		System.out.println("qtd" + c.getTamanho());
		
		// não existe mais a necessidade do check de null antes de pegar o valor
		// deixando o codigo mais limpo
	}

	
	public Carrinho pegarCarrinho(){
		return new CarrinhoNullo();
	}
}
