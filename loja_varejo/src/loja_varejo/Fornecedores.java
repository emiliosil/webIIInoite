package loja_varejo;

public class Fornecedores {
	private String nomeDoFornecedor;
	private String telefoneContato;
	private String mercadoria;
	private Endereco endereco;
	
	public Fornecedores(String nomeDoFornecedor, String telefoneContato, String mercadoria, Endereco endereco) {
		this.nomeDoFornecedor = nomeDoFornecedor;
		this.telefoneContato = telefoneContato;
		this.mercadoria = mercadoria;
		this.endereco = endereco;
	}
	
	public String getNomeDoFornecedor() {
		return this.nomeDoFornecedor;
	}
	
	public String getTelefoneContato() {
		return this.telefoneContato;
	}
	
	public String getMercadoria() {
		return this.mercadoria;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setNomeDoFornecedor(String nomeDoFornecedor) {
		this.nomeDoFornecedor = nomeDoFornecedor;
	}
	
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	
	public void setMercadoria(String mercadoria) {
		this.mercadoria = mercadoria;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return String.format("Nome Completo: %\tTelefone: %\tMercadoria: %\tEndereco: %",this.nomeDoFornecedor,this.telefoneContato,this.mercadoria,this.endereco);
	}
}
