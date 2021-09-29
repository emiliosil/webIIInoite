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
			System.out.println("");
//			System.out.println("%s foi localizado(a) na posi��o %d da lista de alunos");
			System.out.println("Mari � o(a) 2� aluno(a) da lista");
		}else {
			System.out.println("N�o foi localizado na lista");
		}
		
		// Remo��o de elementos
		int indiceRemocao = alunos.indexOf("Maria");
		alunos.remove(1);// Remover a Maria
		System.out.println(alunos.toString());
		
		alunos.removeIf((nome)->nome.startsWith("Mar"));
		
		System.out.println(alunos.toString());
		
		// --------------------------------------------------
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// Adicionar os N�meros
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		System.out.println(numeros.toString());
		
		// num % 2 == 0 Logo � par
		numeros.removeIf((num) -> num % 2 != 0);
		
		System.out.println(numeros.toString());
	}

}
