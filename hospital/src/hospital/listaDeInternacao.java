package hospital;

import java.util.ArrayList;

public class listaDeInternacao {
	private ArrayList<Internacao> internacoes = new ArrayList<Internacao>();
	
	public void cadastrar(Internacao internacao) {
		if(internacao != null) {
			internacoes.add(internacao);
		}
	}
	
	public void remover(Internacao internacao) {
		internacoes.removeIf((elemento)->elemento.getObservacoes().equalsIgnoreCase(internacao.getObservacoes()));
	}
	
	public Internacao buscar(Internacao internacao) {
		for(Internacao elemento : this.internacoes) {
			if(elemento.getObservacoes().equalsIgnoreCase(internacao.getObservacoes())) {
				return elemento;
			}
		}
		return null;
	}
	
	public void editar(Internacao internacao) {
		int indice = internacoes.indexOf(this.buscar(internacao));
		if(indice != -1) {
			internacoes.set(indice, internacao);
		}
	}
	
	public String listar() {
		StringBuilder builder = new StringBuilder();
		for(Internacao internacao : this.internacoes) {
			builder.append(internacao.toString());
		}
		return builder.toString();
	}
}
