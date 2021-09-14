package loja_varejo;

public class Vendedores {
	private String nomeDoVendedor;
	private String emailDaLoja;
	private String telefoneDaLoja;
	private Endereco endereco;
	
	public Vendedores(String nomeDoVendedor, String telefoneDaLoja, Endereco endereco) {
		this.nomeDoVendedor = nomeDoVendedor;
		this.telefoneDaLoja = telefoneDaLoja;
		this.endereco = endereco;
	}
	
	public String getNomeDoVendedor() {
		return this.nomeDoVendedor;
	}
	
	public String getTelefoneDaLoja() {
		return this.telefoneDaLoja;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setNomeDoVendedor(String nomeDoVendedor) {
		this.nomeDoVendedor = nomeDoVendedor;
	}
	
	public void setEmailDaLoja(String emailDaLoja) {
		this.emailDaLoja = emailDaLoja;
	}
	
	public void setTelefoneDaLoja(String telefoneDaLoja) {
		this.telefoneDaLoja = telefoneDaLoja;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %\tTelefone: %\tEndereco: %",this.nomeDoVendedor,this.telefoneDaLoja,this.endereco);
	}
}
