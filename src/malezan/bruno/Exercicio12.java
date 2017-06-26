package malezan.bruno;

//12) Crie um algoritmo que imprime a tabuada de um número informado pelo usuário utilizando recursividade.

import java.util.Scanner;

public class Exercicio12{
	
	static Scanner entrada;
	static Integer valor1, contador = 0, posicao = 0;
	
	public static void main(String[] args){
		System.out.println("*** TABUADA ***");
		System.out.println(" ");
		imput();
	}
	
	static void imput(){
		System.out.print("Qual base você deseja? = ");
		entrada = new Scanner(System.in);
		valor1 = entrada.nextInt();
		output(valor1);
	}

	
	static void output(Integer valor1){
		Integer[] vetor = new Integer[11];
		for(Integer bm = 0; bm < 11; bm++){
			vetor[bm] = contador++;
			System.out.println(valor1 + " X " +posicao + " = " + vetor[bm]*valor1);
			posicao++;
		}
	}

}
