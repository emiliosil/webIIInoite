package loja_varejo;

public class Main {

	public static void main(String[] args) {
		Cliente clie1 = new Cliente();
		Endereco end1 = new Endereco();
		Produto prod1 = new Produto();
		
		clie1.nome = "Sasuke Uchiha";
		clie1.telefonePessoal = "9090909";
		clie1.email = "UchihaSasuke333@folha.com";
		clie1.endereco = end1;
		
		end1.estado = "País do Fogo";
		end1.cidade = "Konoha";
		end1.bairro = "Uchiha";
		end1.rua = "Rua dos Uchiha";
		end1.numero = "333";
		end1.cep = "333000333";
		
		prod1.nomeDoProduto = "kunai";
		prod1.corDoProduto = "Prata Avermelhado";
		prod1.quantidade = "300";
		prod1.valor = "9,000";
		
		System.out.printf("O senhor %s que reside no endereço %s nº %s, no bairro %s - %s/%s, comprou o produto de nome %, de cor %s, quantidade %s e valor %s",clie1.nome,end1.rua,end1.numero,end1.bairro,end1.cidade,end1.estado,prod1.nomeDoProduto,prod1.corDoProduto,prod1.quantidade,prod1.valor);
	}

}
