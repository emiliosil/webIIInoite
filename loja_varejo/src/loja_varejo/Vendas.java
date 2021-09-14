package loja_varejo;

public class Vendas {
	private String preco;
	private String quantidade;
	private String notaFiscal;
	private Produto produto;
	
	public Vendas(String preco, String quantidade, String notaFiscal, Produto produto) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.notaFiscal  = notaFiscal;
		this.produto = produto;
	}
	
	public String getPreco() {
		return this.preco;
	}
	
	public String getQuantidade() {
		return this.quantidade;
	}
	
	public String getNotaFiscal() {
		return this.notaFiscal;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		return String.format("Preco: %\tQuantidade: %\tNota: %\tProduto: %",this.preco,this.quantidade,this.notaFiscal,this.produto);
	}
}
