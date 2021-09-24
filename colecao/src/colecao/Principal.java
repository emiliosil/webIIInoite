package colecao;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
		// M�todos
		int tamanho = alunos.size();
		System.out.printf("A cole��o tem %d elemantos\n",tamanho);
		
		alunos.add("Jo�o");
		alunos.add("Maria");
		alunos.add("Jos�"); 
		
		tamanho = alunos.size();
		System.out.printf("Agora a lista tem %d elementos\n",tamanho);
		
		// Pegar os elemantos
		String ultimoAluno = alunos.get(tamanho-1);
		String primeiroAluno = alunos.get(0);
		System.out.printf("O primeiro aluno � %s\n", primeiroAluno);
		System.out.printf("O �ltimo aluno � %s\n", ultimoAluno);
		
		// Alterar os elemantos
		alunos.set(2, "Mar�lia");
		ultimoAluno = alunos.get(tamanho-1);
		System.out.printf("O �ltimo aluno agora �: %s\n", ultimoAluno);
		
		// Localizar um elemento
//		boolean localizado = alunos.contains("Maria");
		int colocacao = alunos.indexOf("Maria");
		
		if(colocacao>=0) {
			String nome = alunos.get(colocacao);
//			System.out.printf("%s foi localizado(a) na posi��o %d da lista",nome,posicao);
			System.out.printf("%s � o(a) %d aluno(a) da lista",nome,colocacao);
		}else {
			System.out.println("N�o foi localizado na lista");
		}
	}

}
