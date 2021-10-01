package sistema_bancario;

public class Cliente {
	private String CPF;
	private String nome;
	
	Cliente(String CPF,String nome) {
		this.CPF = CPF;
		this.nome = nome;
	}
	
	Cliente(String CPF) {
		this.CPF = CPF;
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return String.format("Nome do cliente: %s\nCPF do cliente: %s\n\n", this.nome,this.CPF);
	}
}
