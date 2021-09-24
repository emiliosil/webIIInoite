package colecao;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
		// Métodos
		int tamanho = alunos.size();
		System.out.printf("A coleção tem %d elemantos\n",tamanho);
		
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("José"); 
		
		tamanho = alunos.size();
		System.out.printf("Agora a lista tem %d elementos\n",tamanho);
		
		// Pegar os elemantos
		String ultimoAluno = alunos.get(tamanho-1);
		String primeiroAluno = alunos.get(0);
		System.out.printf("O primeiro aluno é %s\n", primeiroAluno);
		System.out.printf("O último aluno é %s\n", ultimoAluno);
		
		// Alterar os elemantos
		alunos.set(2, "Marília");
		ultimoAluno = alunos.get(tamanho-1);
		System.out.printf("O último aluno agora é: %s\n", ultimoAluno);
		
		// Localizar um elemento
//		boolean localizado = alunos.contains("Maria");
		int colocacao = alunos.indexOf("Maria");
		
		if(colocacao>=0) {
			String nome = alunos.get(colocacao);
//			System.out.printf("%s foi localizado(a) na posição %d da lista",nome,posicao);
			System.out.printf("%s é o(a) %d aluno(a) da lista",nome,colocacao);
		}else {
			System.out.println("Não foi localizado na lista");
		}
	}

}
