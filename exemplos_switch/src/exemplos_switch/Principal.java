package exemplos_switch;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeito n�mero:");
		float n1 = teclado.nextFloat();
		System.out.println("Digite o segundo n�mero:");
		float n2 = teclado.nextFloat();
		System.out.println("Escolha sua opera��o:");
		System.out.println("1 - Somar");
		System.out.println("2 - Subitrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("0 - Sair");
		
		byte opcao = teclado.nextByte();
		float resultado;
		
		switch(opcao) {
		case 1:
			resultado = somar(n1,n2);
			System.out.printf("A soma � %.2f",resultado);
			break;
		case 2:
			resultado = subtrair(n1,n2);
			System.out.printf("A subtra��o � %.2f",resultado);
			break;
		case 3:
			resultado = multiplicar(n1,n2);
			System.out.printf("A multiplica��o � %.2f",resultado);
			break;
		case 4:
			resultado = dividir(n1,n2);
			System.out.printf("A divis�o � %.2f",resultado);
			break;
		case 0:
			System.out.printf("Obrigado por usar nossa calculadora!!!");
			break;
		default:
			System.out.printf("Op��o inv�lida!!!");
		}
	}
	
	private static float somar(float n1, float n2) {
		return n1+n2;
	}
	
	private static float subtrair(float n1, float n2) {
		return n1-n2;
	}
	
	private static float multiplicar(float n1, float n2) {
		return n1*n2;
	}
	
	private static float dividir(float n1, float n2) {
		return n1/n2;
	}

}
