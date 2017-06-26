package malezan.bruno;

//10) Crie um algoritmo que salva 25 números em uma matriz bidimensional utilizando recursividade.

import java.util.Scanner;

public class Exercicio10{
	
	static Scanner entrada;
	static Integer posicao = 1;
	static Integer[][] matriz = new Integer[5][5];
	
	public static void main(String[] args){
		System.out.println("Matriz = Salvando 25 dados.");
		funcao(posicao, matriz);
	}
	
	static void funcao(Integer posicao, Integer[][] matriz){
		entrada = new Scanner (System.in);
		for(int b = 0; b < matriz.length; b++){ 
			for(int m = 0; m < matriz.length; m++){  
				System.out.print("Insira o " + posicao + "° valor = ");
				matriz[b][m] = entrada.nextInt();  
				posicao++;
			}
		}
		System.out.print("A matriz chegou no limite de 25 posições.");
	}  
}
