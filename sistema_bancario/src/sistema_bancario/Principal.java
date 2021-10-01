package sistema_bancario;

public class Principal {

	public static void main(String[] args) {
//		listaDeGerentes gerentes = new listaDeGerentes();
//		// Criar dois gerentes
//		Gerente paulo = new Gerente("Paulo","1111");
//		Gerente maria  = new Gerente("Maria","2222");
//		
//		// Adicionar a lista
//		gerentes.cadastrar(paulo);
//		gerentes.cadastrar(maria);
//		
//		// Listar elementos
//		System.out.println(gerentes.listar());
//		
//		//Modificar maria
//		Gerente novaMaria = new Gerente("Maria","3333");
//		
//		gerentes.editar(novaMaria);
//		
//		// Listar elementos
//		//System.out.println(gerentes.listar());
//				
//		// Remoção
//		gerentes.remover(maria);
//		gerentes.remover(paulo);
//		
//		// Listar elementos
//		System.out.println(gerentes.listar());
//		
		//--------------------------------------------//
//		
//		listaDeCliente clientes = new listaDeCliente();
//		
//		Cliente paula = new Cliente("0101","Paula");
//		Cliente mauro = new Cliente("0202","Mauro");
//		
//		clientes.cadastrar(paula);
//		clientes.cadastrar(mauro);
//		
//		System.out.println(clientes.listar());
//		
//		Cliente novaPaula = new Cliente("0303","Paula");
//		
//		clientes.editar(novaPaula);
//		
//		System.out.println(clientes.listar());
//		
//		clientes.remover(novaPaula);
//		clientes.remover(mauro);
//		
//		System.out.println(clientes.listar());
//		
		//--------------------------------------------//
		
		listaDeConta banco = new listaDeConta();
		
		Conta conta1 = new Conta(1,200);
		Conta conta2 = new Conta(2,1000);
		
		Conta contaEditada = new Conta(1,500);
		
		// Cadastrar as contas
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		
		// Listar contas 
		System.out.println(banco.listar());
		
		banco.editar(contaEditada);
		
		// Listar contas 
		System.out.println(banco.listar());
	}

}
