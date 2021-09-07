package precificacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto prod = new Produto();
		
		System.out.println("Digite o nome do produto:");
		prod.nome = teclado.nextLine();
		
		System.out.println("Digite o preço de compra do produto:");
		prod.precoDeCusto = teclado.nextFloat();
		
		System.out.println("Digite a quantidade do produto:");
		prod.quantidade = teclado.nextByte();
		
		System.out.println("Digite o seu custo fixo:");
		float custoFixo = teclado.nextFloat();
		
		System.out.println("Digite o seu lucro desejado:");
		float lucro = teclado.nextFloat();
		
		teclado.close();
		
		float precoDeVenda = prod.calcularPrecoDeVenda(custoFixo, lucro);
		
		System.out.printf("O preço de venda do produto %s é de R$ %.2f UN",prod.nome,precoDeVenda);
	}

}
