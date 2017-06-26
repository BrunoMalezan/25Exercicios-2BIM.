package malezan.bruno;

//20) Crie um algoritmo para calcular o fatorial de um número.

import java.util.Scanner;

public class Exercicio20{
	
	static Scanner entrada;
	static Integer valor1;
	static String resposta1;
	
	public static void main(String[] args){
		System.out.print("[JAVA] Bem - Vindo ao Fatorial interativo; Digite qualquer numero; = ");
		chamando();
	}
	
	static void chamando(){
		entrada = new Scanner(System.in);
		valor1 = entrada.nextInt();
		resultado(valor1);
		System.out.println("[JAVA] O resultado é = " + resultado(valor1));
		finalizando();
	}
	
	static void finalizando(){
		System.out.print("[JAVA] Deseja continuar? [s/n] = ");
		entrada = new Scanner(System.in);
		resposta1 = entrada.nextLine();
		if(resposta1.equals("s")){
			System.out.print("[JAVA] Insira outro numero; = ");
			chamando();
		}
		else{
			System.out.print("[JAVA] Okay. Até logo!");
		}
	}
	
	static long resultado(Integer bm){
		if(bm==0){
			return 1;
		}
		else{
			return bm*resultado(bm-1);
		}
	}

}