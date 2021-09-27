package n1;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int numeroUsuario;
		int escolhaComputador;
		
		escolhaComputador = gerador.nextInt(3)+1;
		
		System.out.println("Escolha uma opição:");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		numeroUsuario = teclado.nextInt();
		teclado.close();
		
		System.out.println(gerador.nextInt(3));
		
		switch(escolhaComputador) {
			case 1:
				System.out.println("computador escolheu pedra.");
				break;
		
			case 2:
				System.out.println("computador escolheu papel.");
				break;
			case 3:
				System.out.println("computador escolheu tesoura.");
				break;
		}
		
		if(numeroUsuario == escolhaComputador){
			System.out.printf("Empate.");
		}else if((numeroUsuario - escolhaComputador) == -1 ||
		(numeroUsuario - escolhaComputador) == 2){
			System.out.printf("Computador vencedor.");
		}else {
			System.out.printf("Usuario vencedor.");
		}
		
	}

}
