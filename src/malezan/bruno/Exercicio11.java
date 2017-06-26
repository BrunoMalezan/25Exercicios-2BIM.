package malezan.bruno;

//11) Crie um algoritmo que salva 125 números em uma matriz tridimensional utilizando recursividade.

import java.util.Scanner;

public class Exercicio11{
	
	static Scanner entrada;
	static Integer posicao = 1;
	static Integer[][][] matriz = new Integer[5][5][5];
	
	public static void main(String[] args){
		System.out.println("Matriz = Salvando 25 dados.");
		funcao(posicao, matriz);
	}
	
	static void funcao(Integer posicao, Integer[][][] matriz){
		entrada = new Scanner (System.in);
		for(int b = 0; b < matriz.length; b++){ 
			for(int m = 0; m < matriz.length; m++){ 
				for(int w = 0; w < matriz.length; w++){ 
					System.out.print("Insira o " + posicao + "° valor = ");
					matriz[b][m][w] = entrada.nextInt();  
					posicao++;
				}
			}
		}
		System.out.print("A matriz chegou no limite de 125 posições.");
	}  
}
