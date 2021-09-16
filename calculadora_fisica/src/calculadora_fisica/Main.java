package calculadora_fisica;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner teclado = new Scanner(System.in);
		Forca_centripeta for1 = new Forca_centripeta();
		Forca_peso for2 = new Forca_peso();
		movimentoretilinio mr1 = new movimentoretilinio();
		Velocidade_media vm1 = new Velocidade_media();
	
		System.out.println("digite a massa :");
		for1.massa = teclado.nextLine();
		System.out.println("digite o peso:");
		for1.pesso = teclado.nextLine();
		System.out.println("digite o raio:");
		for1.raio = teclado.nextLine();
		
		System.out.println("digite a massa:");
		for2.masssa = teclado.nextLine();
		System.out.println("digite o peso:");
		for2.pesso = teclado.nextLine();
		System.out.println("digite o velocidade:");
		
		mr1.velocidade = teclado.nextLine();
		System.out.println("digite o tempo:");
		mr1.tempo = teclado.nextLine();
		
		System.out.println("digite a velocidade inicial:");
		vm1.velocidadeinicial = teclado.nextLine();
		System.out.println("digite a velocidade final:");
		vm1.velicidadefinal = teclado.nextLine();
		teclado.close();
		
		System.out.printf(calculodopeso);
	}

}