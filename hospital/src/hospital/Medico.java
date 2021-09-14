package hospital;

public class Medico {
	private String crm;
	private String nomeCompleto;
	private String telefoneContato;
	private Endereco endereco;
	
	public Medico(String crm,String nomeCompleto,String telefoneContato) {
		this.crm = crm;
		this.nomeCompleto = nomeCompleto;
		this.telefoneContato = telefoneContato;
	}
	
	public String getCrm() {
		return crm;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public String getTelefoneContato() {
		return telefoneContato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return String.format("CRM: %s\tNome: %s\tTelefone: %s\tEnderešo: %s",this.crm,this.nomeCompleto,this.telefoneContato,this.endereco.toString());
	}
}
