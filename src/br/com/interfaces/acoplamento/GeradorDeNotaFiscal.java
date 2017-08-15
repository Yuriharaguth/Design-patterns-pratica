package br.com.interfaces.acoplamento;

import java.util.List;

public class GeradorDeNotaFiscal {
	
	private List<AcoesAposGerarAnota> listaAcoes;

	public GeradorDeNotaFiscal() {
		// TODO Auto-generated constructor stub
	}

	public List<AcoesAposGerarAnota> getListaAcoes() {
		return listaAcoes;
	}

	public void setListaAcoes(List<AcoesAposGerarAnota> listaAcoes) {
		this.listaAcoes = listaAcoes;
	}
	
	

}
