package malezan.bruno;

//22) Crie um algoritmo para gerar a sequência de Fibonacci.

import java.util.Scanner;

public class Exercicio22{
	
	static Scanner entrada;
	static long valor1 = 1, valor2 = 0, valor3 = 0, soma = 0;
	
	public static void main(String[] args){
		System.out.println("Sequência de Fibonacci = ");
		System.out.print("Sabendo que sua sequência é infinita, até qual posição deseja parar? (EX = 10) = ");
		entrada = new Scanner(System.in);
		valor3 = entrada.nextLong();
		funcao(valor1, valor2, valor3, soma);
	}
	
	static void funcao(long valor1, long valor2, long valor3, long soma){
		for(Integer bm = 0; bm < valor3; bm++){
			soma = valor1 + valor2;
			System.out.print(soma + ", ");
			valor1 = valor2;
			valor2 = soma;
		}
		System.out.println(" ");
		System.out.println("Baseado em = http://mundoestranho.abril.com.br/ciencia/o-que-e-a-sequencia-de-fibonacci/");
	}

}
