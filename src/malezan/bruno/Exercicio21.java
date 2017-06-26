package malezan.bruno;

//21) Crie um algoritmo para calcular números triangulares.

import java.util.Scanner;

public class Exercicio21{
	
	static Scanner entrada;
	static Integer valor1 = 0, soma = 0;
	
	public static void main(String[] args){
		System.out.print("Insira qualquer número para calcúlar na formato triângulo = ");
		entrada = new Scanner(System.in);
		valor1 = entrada.nextInt();
		funcao(valor1, soma);
	}
	
	static void funcao(Integer valor1, Integer soma){
		if(0 < valor1){
			soma += valor1;
			valor1--;
			funcao(valor1, soma);
		}
		else{
			System.out.println(" ");
			System.out.print("Resultado = " + soma);
		}
	}

}
