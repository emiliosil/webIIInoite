package populacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número de habitantes:");
		float hab1 = teclado.nextFloat();
		System.out.println("Digite o número de natatlidade:");
		float nat1 = teclado.nextFloat();
		System.out.println("Digite o número 1000:");
		float n1 = teclado.nextInt();
		System.out.println("Escolha sua opção:");
		System.out.println("1 - Fazer o calcúlo");
		System.out.println("2 - Sair");
		
		int numero = teclado.nextInt();
		float resultado;
		
		switch(numero) {
		case 1:
			resultado = multiplicar(nat1,n1);
			System.out.printf("O número de natatlidade é %.2f",resultado);
			resultado = dividir(resultado,hab1);
			System.out.printf("A taxa de natalidade é %.2f",resultado);
			break;
		case 2:
			System.out.println("Você saiu!!!");
		default:
			System.out.printf("Opção inválida!!!");
		}
	}

	private static float multiplicar(float nat1, float n1) {
		return nat1*n1;
	}
	private static float dividir(float resultado, float hab1) {
		return resultado/hab1;
	}

}
