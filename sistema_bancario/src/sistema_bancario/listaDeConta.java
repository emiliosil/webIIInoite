package sistema_bancario;

import java.util.ArrayList;

public class listaDeConta {
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void cadastrar(Conta conta) {
		if(conta != null) {
			contas.add(conta);
		}
	}
	
	public void remover(Conta conta) {
		contas.removeIf((elemento)->elemento.getNumero() == conta.getNumero());
	}
	
	public Conta buscar(Conta conta) {
		for(Conta elemento : this.contas) {
			if(elemento.getNumero() == conta.getNumero()) {
				return elemento;
			}
		}
		
		return null;
	}
	
	public void editar(Conta conta) {
		int indice = contas.indexOf(this.buscar(conta));
		if(indice != -1) {
			contas.set(indice, conta);
		}
	}
	
	public String listar() {
		StringBuilder builder = new StringBuilder();
		for(Conta conta : this.contas) {
			builder.append(conta.toString());
		}
		return builder.toString();
	}
}
