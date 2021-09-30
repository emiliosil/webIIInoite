package sistema_bancario;

public class Principal {

	public static void main(String[] args) {
		listaDeGerentes gerentes = new listaDeGerentes();
		// Criar dois gerentes
		Gerente paulo = new Gerente("Paulo","1111");
		Gerente maria  = new Gerente("Maria","2222");
		
		// Adicionar a lista
		gerentes.cadastrar(paulo);
		gerentes.cadastrar(maria);
		
		// Listar elementos
		System.out.println(gerentes.listar());
		
		//Modificar maria
		Gerente novaMaria = new Gerente("Maria","3333");
		
		gerentes.editar(novaMaria);
		
		// Listar elementos
		//System.out.println(gerentes.listar());
				
		// Remoção
		gerentes.remover(maria);
		gerentes.remover(paulo);
		
		// Listar elementos
				System.out.println(gerentes.listar());
	}

}
