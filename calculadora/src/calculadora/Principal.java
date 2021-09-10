package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float num1;
		float num2;
		
		try {
		System.out.println("Digite o primeiro número");
		num1 = teclado.nextFloat();
		}catch (Exception ex) {
			teclado = new Scanner(System.in);
			num1 = 0;
		}
		
		try {
		System.out.print("Digite o segundo número");
		num2 = teclado.nextFloat();
		}catch(Exception ex) {
			num2 = 0;
		}
		Calculadora calc = new Calculadora();
		System.out.printf("A soma é: %.2f", calc.somar(num1, num2));
		teclado.close();
	}
	
}
