package atividade3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//respons�vel por capturar as respostas do usu�rio
        Scanner s = new Scanner(System.in);
 
        //lista de perguntas
        String[] perguntas = new String[5];
            perguntas[0] = "Telefonou para a v�tima? sim ou n�o?";
            perguntas[1] = "Esteve no local do crime? sim ou n�o?";
            perguntas[2] = "Mora perto da v�tima? sim ou n�o?";
            perguntas[3] = "Devia para a v�tima? sim ou n�o?";
            perguntas[4] = "J� trabalhou com a v�tima? sim ou n�o?";
       
        // vari�vel que guardar� o n�mero de respostas "sim"
        int respostasPositivas = 0;
       
        //ciclo de repeti��o respons�vel por fazer as perguntas, coletar as respostas do usu�rio
        //e verificar se a resposta foi sim
        for(int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);//exibe a pergunta
            String respostas = s.nextLine();//captura a resposta do usu�rio
           
            
            //toLowerCase() coloca todas as letras em min�sculo
            if(respostas.toLowerCase().equals("sim")){ // verifica se a resposta for sim
                respostasPositivas++; //adiciona +1 � vari�vel respostasPositivas
            }
        }
 
        //verifica��o da quantidade de respostas positivas
        switch(respostasPositivas){
            case 2: // caso o n�mero de respostas positivas seja 2
                System.out.println("Suspeito");
                break;
 
            case 3:// caso o n�mero de respostas positivas seja 3 ou 4
            case 4:
                System.out.println("C�mplice");
                break;
 
            case 5:// caso o n�mero de respostas positivas seja 5
                System.out.println("Assassino");
                break;
 
            default:// caso o n�mero de respostas positivas n�o seja nenhuma das outras op��es
                System.out.println("Inocente");
                break;
        }
	}

}
