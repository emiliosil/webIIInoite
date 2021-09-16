package calculadora_fisica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Forca_centripeta for1 = new Forca_centripeta();
		Forca_peso for2 = new Forca_peso();
		Movimento_retilinio mru1 = new Movimento_retilinio();
		Velocidade_media vlm1 = new Velocidade_media();
		
		System.out.println("Digite a massa: ");
		for1.massa = teclado.nextFloat();
		System.out.println("Digite o peso: ");
		for1.peso = teclado.nextFloat();
		System.out.println("Digite o raio: ");
		for1.raio = teclado.nextFloat();
		
		System.out.println("Digite a massa: ");
		for2.massa = teclado.nextFloat();
		System.out.println("Digite o peso: ");
		for2.peso = teclado.nextFloat();
		
		System.out.println("Digite a velocidade: ");
		mru1.velocidade = teclado.nextFloat();
		System.out.println("Digite o tempo: ");
		mru1.tempo = teclado.nextFloat();
		
		System.out.println("Digite a velocidade inicial: ");
		vlm1.velocidadeInicial = teclado.nextFloat();
		System.out.println("Digite a velocidade final: ");
		vlm1.velocidadeFinal = teclado.nextFloat();
		teclado.close();
		
		System.out.print(for1);
		System.out.print(for2);
		System.out.print(mru1);
		System.out.print(vlm1);
	}

}
