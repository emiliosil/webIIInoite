package colecao;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
		// Métodos
		int tamanho = alunos.size();
		System.out.printf("A coleção tem %d elementos\n",tamanho);
		
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("José");
		
		tamanho = alunos.size();
		System.out.printf("Agora a lista tem %d elementos\n",tamanho);
		
		String ultimoAluno = alunos.get(tamanho-1);
		String primeiroAluno = alunos.get(0);
		System.out.printf("O último aluno é: %s\n",ultimoAluno);
		System.out.printf("O primeiro aluno é: %s\n",primeiroAluno);
		
		// Alterar os elementos
		alunos.set(2, "Marília");
		ultimoAluno = alunos.get(tamanho-1);
		System.out.printf("O último aluno agora é: %s\n", ultimoAluno);
		
		//Localizar um elemento
		boolean localizado = alunos.contains("josé");
		
		if(localizado) {
			System.out.println("Foi localizado na lista");
		}else {
			System.out.println("Não foi localizado na lista");
		}
	}

}
