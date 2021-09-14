package loja_varejo;

public class Estoque {
	private String cnpj;
	private String telefoneDoEstoque;
	private Produto produto;
	private Endereco endereco;
	
	public Estoque(String cnpj, String telefoneDoEstoque, Produto produto, Endereco endereco) {
		this.cnpj = cnpj;
		this.telefoneDoEstoque = telefoneDoEstoque;
		this.produto = produto;
		this.endereco = endereco;
	}
	
	public String getCNPJ() {
		return this.cnpj;
	}
	
	public String getTelefoneDoEstoque() {
		return this.telefoneDoEstoque;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setTelefoneDoEstoque(String telefoneDoEstoque) {
		this.telefoneDoEstoque = telefoneDoEstoque;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return String.format("CNPJ: %\tTelefone: %\tProduto: %\tEndereco: %",this.cnpj,this.telefoneDoEstoque,this.produto,this.endereco);
		
	}
}
