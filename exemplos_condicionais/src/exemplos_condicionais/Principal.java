      package exemplos_condicionais;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu sexo: M ou F");
		String sexo = teclado.next();
		
		String resultado = verificarSexo(sexo);
		System.out.printf("Seu sexo é %s\n",resultado);
	}

	private static float maiorNumero(float num1, float num2) {
		// Primeiro if
		if (num1 == num2) {
			return 0;
		}

		// Segundo if
		if (num1 > num2) {
			return num1;
		}

		return num2;
	}

	private static boolean ePositivo(float num) {
		return num > -1;
	}
	
	private static boolean eVogal(String letra) {
		return letra.equalsIgnoreCase("a")  || letra.equalsIgnoreCase("e")  || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u");
	}
	
	private static String verificarSexo(String sexo) {
		if(sexo.equalsIgnoreCase("M")) {
			return "Masculino";
		}else if(sexo.equalsIgnoreCase("F")) {
			return "Feminino";
		}else {
			return "Sexo inválido";
		}
	}
}