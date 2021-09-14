package loja_varejo;

public class Produto {
	private String nomeDoProduto;
	private String valor;
	private String quantidade;
	private String corDoProduto;
	
	public Produto(String nomeDoProduto, String valor, String quantidade, String corDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
		this.valor = valor;
		this.quantidade = quantidade;
		this.corDoProduto = corDoProduto;
	}
	
	public String getNomeDoProduto() {
		return this.nomeDoProduto;
	}
	
	public String getValor() {
		return this.valor;
	}
	
	public String getQuantidade() {
		return this.quantidade;
	}
	
	public String getCorDoProduto() {
		return this.corDoProduto;
	}
	
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setCorDoProduto(String corDoProduto) {
		this.corDoProduto = corDoProduto;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %\tValor: %\tQuantidade: %\tCor: %",this.nomeDoProduto,this.valor,this.quantidade,this.corDoProduto);
	}
}
