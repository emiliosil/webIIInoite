package loja_varejo;

public class Main {

	public static void main(String[] args) {
		Endereco end1 = new Endereco("Rua dos Uchiha","333","Uchiha","Konoha","País do Fogo");
		Cliente clie1 = new Cliente("Sasuke uchiha","9090909",end1);
//		Produto prod1 = new Produto("kunai","9,000","300","Prata Avermelhado");

//		System.out.printf("O senhor %s que reside no endereço %s nº %s, no bairro %s - %s/%s, comprou o produto de nome %s, de cor %s, quantidade %s e valor %s",clie1.getNome(),end1.getRua(),end1.getNumero(),end1.getBairro(),end1.getCidade(),end1.getEstado(),prod1.getNomeDoProduto(),prod1.getCorDoProduto(),prod1.getQuantidade(),prod1.getValor());
		
		System.out.println(clie1.toString());
	}

}
