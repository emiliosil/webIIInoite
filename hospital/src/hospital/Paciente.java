package hospital;

public class Paciente {
	private String nomeCompleto;
	private String rg;
	private String cpf;
	private String telefone;
	private Endereco endereco;
	
	public Paciente(String nomeCompleto, String cpf, String telefone, Endereco endereco) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
