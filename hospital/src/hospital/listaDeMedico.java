package hospital;

import java.util.ArrayList;

public class listaDeMedico {
	private ArrayList<Medico> medicos = new ArrayList<Medico>();
	
	public void cadastrar(Medico medico) {
		if(medico != null) {
			medicos.add(medico);
		}
	}
	
	public void remover(Medico medico) {
		medicos.removeIf((elemento)->elemento.getNomeCompleto().equalsIgnoreCase(medico.getNomeCompleto()));
	}
	
	public Medico buscar(Medico medico) {
		for(Medico elemento : this.medicos) {
			if(elemento.getNomeCompleto().equalsIgnoreCase(medico.getNomeCompleto())) {
				return elemento;
			}
		}
		return null;
	}
	
	public void editar(Medico medico) {
		int indice = medicos.indexOf(this.buscar(medico));
		if(indice != -1) {
			medicos.set(indice, medico);
		}
	}
	
	public String listar() {
		StringBuilder builder = new StringBuilder();
		for(Medico medico : this.medicos) {
			builder.append(medico.toString());
		}
		return builder.toString();
	}
}
