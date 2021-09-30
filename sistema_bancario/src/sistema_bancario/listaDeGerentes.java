package sistema_bancario;

import java.util.ArrayList;

public class listaDeGerentes {
	private ArrayList<Gerente> lista = new ArrayList<Gerente>();
	
	public void cadastrar(Gerente gerente) {
		if(gerente != null) {
			lista.add(gerente);
		}
	}
	
	public void remover(Gerente gerente) {
		lista.removeIf((elemento)->elemento.getNome().equalsIgnoreCase(gerente.getNome()));
	}
	
	public Gerente buscar(Gerente gerente) {
		for(Gerente elemento : lista) {
			if(elemento.getNome().equalsIgnoreCase(gerente.getNome())) {
				return elemento;
			}
		}
		
		return null;
	}
	
	public void editar(Gerente novoGerente) {
		int indice = lista.indexOf(this.buscar(novoGerente));
		if(indice != -1) {
			lista.set(indice, novoGerente);
		}
	}
	
	public String listar() {
		StringBuilder builder = new StringBuilder();
		for(Gerente gerente : this.lista) {
			builder.append("Nome: "+gerente.getNome()+" - Telefone: "+gerente.getTelefone()+"\n");
		}
		return builder.toString();
	}
	
}