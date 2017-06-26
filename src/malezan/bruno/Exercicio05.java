package malezan.bruno;

//05) Crie um algoritmo que retorne e imprima o maior valor de um Array (Vetor) de 10 valores inteiros informados pelo usuário utilizando recursividade.

import java.util.Arrays;
import java.util.Scanner; 


public class Exercicio05{ 
		
	static Scanner entrada;

	public static void main(String[] args){
		System.out.println("Insira 10 valores = ");
		funcao();
		}

		
	static void funcao(){
		Integer[] vetor = new Integer[10];  
		entrada = new Scanner (System.in);
		for(int bm = 0; bm < vetor.length; bm++){  
			vetor[bm] = entrada.nextInt();  
		}
		Arrays.sort(vetor);
		System.out.println("Maior valor = " + vetor[vetor.length - 1]);
	}  
}
