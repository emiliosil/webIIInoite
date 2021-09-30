package sistema_bancario;

public class Gerente {
	private String nome;
	private String telefone;
	
	Gerente(String nome,String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	Gerente(String nome) {
		this.nome = nome;
	}
	
	// Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
}
