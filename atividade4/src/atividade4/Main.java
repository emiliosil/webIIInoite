package atividade4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double fi,gas,eta,l,total,calculo,desconto;
		
		System.out.println("Fidelidade?(1)Sim(2)Não");
		fi = sc.nextInt();
		System.out.println("Foi Gasolina(1)Sim(2)Não");
		gas = sc.nextInt();
		System.out.println("Quantidade em litros?");
		l = sc.nextInt();
		
		if (fi==1 && gas == 1&& l<=20){
		  total = (l*4.3)*0.92;
			desconto = total*0.04;
			desconto=  desconto;
		 System.out.println("O valor final é:"+total+"O desconto foi de:" +desconto);
		}
		if (fi==1&&gas==1&& l>20){
		total = (l*4.30)*0.9;
			desconto = total*0.04;
			System.out.println("O total é:"+total);
		}
		if (fi==1&&gas==2&& l<=20){
		total = (l*3.85)*0.94;
			System.out.println("O total é:"+total);
		}
		if (fi==1&&gas==2&&l>20){
		total = (l*3.85)*0.92;
			System.out.println("O total é:"+total);
		}//fim fidelidade
		if (fi==2&&gas==1&&l<=20){
		total = (l*4.3);
			System.out.println("O total é:" +total);
		}
		if (fi==2&&gas==1&&l>20){
		total = (l*4.30);
			System.out.println("O total é: "+total);
		}
		if(fi==2&&gas==2&&l<=20){
		total =(l*3.85);
			System.out.println("O total é:"+total);
		}
		if (fi==2&&gas==2&&l>20){
		total =(l*3.85);
			System.out.println("O total é: "+total);
		}
		System.out.println("Fazer outro calculo?(1)Sim(2)Não");
	  calculo = sc.nextInt();
		if (calculo ==1){
			System.out.println("Fidelidade: (1)Sim (2)Não");
			fi = sc.nextInt();
		}
	}

}
