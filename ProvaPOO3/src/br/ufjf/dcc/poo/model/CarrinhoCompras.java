package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class CarrinhoCompras {

	private Pedido pedido;
	private Login login;
	private ArrayList<ItensCompra> itensCompras;

	public void fecharPedido() {

	}

	public void buscarPedido() {

	}

	public int gerarNumeroPedido() {
		return 0;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public ArrayList<ItensCompra> getItensCompras() {
		return itensCompras;
	}

	public void setItensCompras(ArrayList<ItensCompra> itensCompras) {
		this.itensCompras = itensCompras;
	}
}
