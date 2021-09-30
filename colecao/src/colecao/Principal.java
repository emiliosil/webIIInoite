package colecao;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
//		// Métodos
//		int tamanho = alunos.size();
//		System.out.printf("A coleção tem %d elementos\n",tamanho);
		
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("José");
		
//		tamanho = alunos.size();
//		System.out.printf("Agora a lista tem %d elementos\n",tamanho);
//		
//		String ultimoAluno = alunos.get(tamanho-1);
//		String primeiroAluno = alunos.get(0);
//		System.out.printf("O último aluno é: %s\n",ultimoAluno);
//		System.out.printf("O primeiro aluno é: %s\n",primeiroAluno);
//		
//		// Alterar os elementos
//		alunos.set(2, "Marília");
//		ultimoAluno = alunos.get(tamanho-1);
//		System.out.printf("O último aluno agora é: %s\n", ultimoAluno);
//		
//		//Localizar um elemento
//		boolean localizado = alunos.contains("josé");
//		
//		if(localizado) {
//			System.out.println("");
////			System.out.println("%s foi localizado(a) na posição %d da lista de alunos");
//			System.out.println("Mari é o(a) 2º aluno(a) da lista");
//		}else {
//			System.out.println("Não foi localizado na lista");
//		}
//		
//		// Remoção de elementos
//		int indiceRemocao = alunos.indexOf("Maria");
//		alunos.remove(1);// Remover a Maria
//		System.out.println(alunos.toString());
//		
//		alunos.removeIf((nome)->nome.startsWith("Mar"));
//		
//		System.out.println(alunos.toString());
//		
//		// --------------------------------------------------
//		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// Adicionar os Números
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
//		System.out.println(numeros.toString());
//		// num % 2 == 0 Logo é par
		numeros.removeIf((num) -> num % 2 != 0);
		
//		System.out.println(numeros.toString());
		
//		// EStruturas de repetação
//		
//		//Incremental
//		for(byte indice=1;indice<11;indice++) {
//			System.out.printf("%d X %d = %d\n",indice);
//		}
//		
//		//Decremental
//		for(byte indice=9;indice>-1;indice--) {
//			System.out.printf("O índice atual é %d\n",indice);
//		}
		
		ArrayList<Integer> numeros2 = new ArrayList<Integer>();
		numeros.add(50);
		numeros.add(12);
		numeros.add(78);
		numeros.add(3);
		pilha(numeros2);
		
		for(Integer item : numeros2) {
			System.out.println(item);
		}
	}

//	// 2 métodos (Fila e uma pilha)
//	private static void fila(ArrayList<Integer> itens) {
//		for(byte indice=1;indice<6;indice++) {
//			System.out.printf("Processando o item%d\n",indice);
//		}
//	}
	
	private static void pilha(ArrayList<Integer> itens) {
		for(int indice=6;indice>-1;indice--) {
			System.out.printf("Processando o item%d\n",indice);
		}
	}
}
