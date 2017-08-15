package br.com.interfaces.acoplamento;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		GeradorDeNotaFiscal g = new GeradorDeNotaFiscal();

		List<AcoesAposGerarAnota> listaDeAcoes = new ArrayList<>();
		NFdao nf = new NFdao();
		QualquerOutraAcao qa = new QualquerOutraAcao();
		
		listaDeAcoes.add(nf);
		listaDeAcoes.add(qa);
		
		g.setListaAcoes(listaDeAcoes);
	}

}
