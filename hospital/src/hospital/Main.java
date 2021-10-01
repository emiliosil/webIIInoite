package hospital;

public class Main {

	public static void main(String[] args) {
//		// Criando os objeto
//		Endereco end1 = new Endereco("Travessa não te interresa","12-A","Centro","Porto Alegre","RS","0000");
//		Paciente pac1 = new Paciente("Julia","9999","98888",end1);
//		Medico med1 = new Medico("000-RS","Geovane","0000");
//		Medico med2 = new Medico("111-RS","Maria","1111");
//		Internacao inter1 = new Internacao(pac1,med1);
//		med1.setEndereco(end1);
//		
//		// Imprimir dados
////		System.out.printf("O senhor %s reside no endereço %s nº %s, no bairro %s - %s/%s",pac1.getNomeCompleto(),end1.getRua(),end1.getNumero(),end1.getBairro(),end1.getCidade(),end1.getEstado());
////		
////		System.out.printf(inter1.dadosDoMedico());
//		
//		System.out.println(inter1.toString());
//		
		//------------------------------------------------//
//		
//		listaDeMedico medico = new listaDeMedico();
//		
//		// Criar elementos
//		Medico med1 = new Medico("000-RS","Geovane","0000");
//		Medico med2 = new Medico("111-RS","Maria","1111");
//		
//		// Novo elemento
//		Medico novoMed2 = new Medico("222-RS","Maria","2222");
//		
//		// Cadastrar elementos
//		medico.cadastrar(med1);
//		medico.cadastrar(med2);
//		
//		System.out.println(medico.listar());
//		
//		// Editar elementos
//		medico.editar(novoMed2);
//		
//		System.out.println(medico.listar());
//		
//		// Remover elementos
//		medico.remover(med2);
//		medico.remover(md1);
//		
//		System.out.println(medico.listar());
//		
		//------------------------------------------------//
//		
//		listaDePaciente paciente = new listaDePaciente();
//		
//		// Criar elementos
//		Paciente pac1 = new Paciente("0000");
//		Paciente pac2 = new Paciente("1111");
//		
//		// Novo elemento
//		Paciente novoPac2 = new Paciente("2222");
//		
//		// Cadastrar elementos
//		paciente.cadastrar(pac1);
//		paciente.cadastrar(pac2);
//		
//		System.out.println(paciente.listar());
//		
//		// Editar elementos
//		paciente.editar(novoPac2);
//		
//		System.out.println(paciente.listar());
//		
//		// Remover elementos
//		paciente.remover(pac2);
//		paciente.remover(pac1);
//		
//		System.out.println(paciente.listar());
//		
		//------------------------------------------------//
		
		listaDeInternacao internacao = new listaDeInternacao();
		
		// Criar elementos
		Internacao int1 = new Internacao(null);
		Internacao int2 = new Internacao(null);
		
		// Novo elemento
		Internacao novoInt2 = new Internacao(null);
		
		// Cadastrar elementos
		internacao.cadastrar(int1);
		internacao.cadastrar(int2);
		
		System.out.println(internacao.listar());
		
		// Editar elementos
		internacao.editar(novoInt2);
		
		System.out.println(internacao.listar());
		
		// Remover elementos
		internacao.remover(int2);
		internacao.remover(int1);
		
		System.out.println(internacao.listar());
	}

}
