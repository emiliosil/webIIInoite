package colecao;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
		// M�todos
		int tamanho = alunos.size();
		System.out.printf("A cole��o tem %d elementos\n",tamanho);
		
		alunos.add("Jo�o");
		alunos.add("Maria");
		alunos.add("Jos�");
		
		tamanho = alunos.size();
		System.out.printf("Agora a lista tem %d elementos\n",tamanho);
		
		String ultimoAluno = alunos.get(tamanho-1);
		String primeiroAluno = alunos.get(0);
		System.out.printf("O �ltimo aluno �: %s\n",ultimoAluno);
		System.out.printf("O primeiro aluno �: %s\n",primeiroAluno);
		
		// Alterar os elementos
		alunos.set(2, "Mar�lia");
		ultimoAluno = alunos.get(tamanho-1);
		System.out.printf("O �ltimo aluno agora �: %s\n", ultimoAluno);
		
		//Localizar um elemento
		boolean localizado = alunos.contains("jos�");
		
		if(localizado) {
			System.out.println("Foi localizado na lista");
		}else {
			System.out.println("N�o foi localizado na lista");
		}
	}

}
