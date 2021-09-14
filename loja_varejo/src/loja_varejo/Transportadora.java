package loja_varejo;

public class Transportadora {
	private String telefoneDaTransportadora;
	private Cliente cliente;
	private Produto produto;
	private Endereco endereco;
	
	public Transportadora(String telefoneDaTransportadora, Cliente cliente, Produto produto, Endereco endereco) {
		this.telefoneDaTransportadora = telefoneDaTransportadora;
		this.cliente = cliente;
		this.produto = produto;
		this.endereco = endereco;
	}
	
	public String getTelefoneDaTransportadora() {
		return this.telefoneDaTransportadora;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void getTelefoneDaTransportadora(String telefoneDaTransportadora) {
		this.telefoneDaTransportadora = telefoneDaTransportadora;
	}
	
	public void getCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void getProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void getEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return String.format("Telefone: %\tCliente: %\tProduto: %\tEndereco: %",this.telefoneDaTransportadora,this.cliente,this.produto,this.endereco);
	}
}
