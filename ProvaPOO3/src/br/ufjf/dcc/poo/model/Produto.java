package br.ufjf.dcc.poo.model;

public class Produto {

	private EspecificacaoProduto especificacaoProduto;
	private ItensCompra itensCompra;
	
	public EspecificacaoProduto getEspecificacaoProduto() {
		return especificacaoProduto;
	}
	public void setEspecificacaoProduto(EspecificacaoProduto especificacaoProduto) {
		this.especificacaoProduto = especificacaoProduto;
	}
	public ItensCompra getItensCompra() {
		return itensCompra;
	}
	public void setItensCompra(ItensCompra itensCompra) {
		this.itensCompra = itensCompra;
	}
	
}
