package malezan.bruno;

//03) Crie um algoritmo que imprime a soma dos valores de um Array (Vetor) com 10 valores inteiros informados pelo usuário utilizando recursividade.

import java.util.Scanner;

public class Exercicio03{
	
	static Scanner entrada;
	static Integer posicao = 1, soma = 0;
	static Integer[] vetor = new Integer[10];
	
	public static void main(String[] args){
		System.out.println("vetor = Salvando 10 dados e somando;");
		funcao(posicao, vetor);
	}
	
	static void funcao(Integer posicao, Integer[] vetor){
		entrada = new Scanner (System.in);
		for(int bm = 0; bm < vetor.length; bm++){ 
			System.out.print("Insira o " + posicao + "° valor = ");
			vetor[bm] = entrada.nextInt();
			soma += vetor[bm];
			posicao++;
		}
		System.out.print("Soma = " + soma);
	}  
}
