package br.ufjf.dcc.poo.model;

public class Login {
	
	private String usuario;
	private String senha;
	private CarrinhoCompras carrinhoCompras;
	private Cliente cliente;
	
	public void createUsuario() {
		
	}
	
	public void efetuarLogin() {
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public CarrinhoCompras getCarrinhoCompras() {
		return carrinhoCompras;
	}

	public void setCarrinhoCompras(CarrinhoCompras carrinhoCompras) {
		this.carrinhoCompras = carrinhoCompras;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
