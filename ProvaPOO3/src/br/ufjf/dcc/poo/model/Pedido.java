package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Pedido {

	private Pagamento pagamento;
	private CarrinhoCompras carrinhoCompras;

	public void incluirItens() {

	}

	public ArrayList<Produto> buscarProduto(){
		return null;
	}

	public void inserirProduto() {

	}

	public void excluirProduto() {

	}

	public void alterarProduto() {

	}

	public void finalizarCompra() {

	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public CarrinhoCompras getCarrinhoCompras() {
		return carrinhoCompras;
	}

	public void setCarrinhoCompras(CarrinhoCompras carrinhoCompras) {
		this.carrinhoCompras = carrinhoCompras;
	}

}
