package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float num1;
		float num2;
		
		try {
		System.out.print("Digite o primeiro n�mero");
		num1 = teclado.nextFloat();
		}catch (Exception ex) {
			teclado = new Scanner(System.in);
			num1 = 0;
		}
		
		System.out.print("Digite o segundo n�mero");
		num2 = teclado.nextFloat();
		
		Calculadora calc = new Calculadora();
		System.out.printf("A soma �: %.2f", calc.somar(num1, num2));
	}
	
}
