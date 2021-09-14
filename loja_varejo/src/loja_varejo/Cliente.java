package loja_varejo;

public class Cliente {
	private String nome;
	private String email;
	private String telefonePessoal;
	private Endereco endereco;
	
	public Cliente(String nome, String telefonePessoal, Endereco endereco) {
		this.nome = nome;
		this.telefonePessoal = telefonePessoal;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTelefonePessoal() {
		return this.telefonePessoal;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setTelefonePessoal(String telefonePessoal) {
		this.telefonePessoal = telefonePessoal;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("Nome Completo: %\tTelefone: %\tEndereco: %s",this.nome,this.telefonePessoal,this.endereco.toString());
	}
}
