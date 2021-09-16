package atividade2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ent =  new Scanner ( System.in);
        int ano;
        
        System.out.println ( " Digite um ano para saber se é bissexto " );
        ano = ent . nextInt ();
        
        // se o ano para maior que 400
        if (ano %  400  ==  0 ) {
            System.out.println(ano +" é bissexto.");
        // se o ano para menor que 400
        } else  if ((ano %  4  ==  0 ) && (ano % 100  ==  0 )){
            System.out.println(ano +  " é bissexto. " );
        } else {
            System.out.println(ano +  " não é bissexto " );
        }
	}

}
