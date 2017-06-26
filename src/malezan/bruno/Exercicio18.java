package malezan.bruno;

//18) Crie um algoritmo que calcula juros simples utilizando recursividade.

import java.util.Scanner;

public class Exercicio18{
	
	static Scanner entrada;
	static double valor1 = 0.0, juros = 0.0, meses = 0.0, cont1 = 0.0, soma = 0.0;
	
	public static void main(String[] args){
		System.out.println("Vamos aos juros simples...");
		System.out.println(" ");
		funcao(valor1, juros);
	}
	
	static void funcao(double valor1, double juros){
		System.out.print("Qual seu capital? = ");
		entrada = new Scanner(System.in);
		valor1 = entrada.nextDouble();
		System.out.print("Quantos % de juros? = ");
		entrada = new Scanner(System.in);
		juros = entrada.nextDouble();
		System.out.print("Em quantos meses? = ");
		entrada = new Scanner(System.in);
		meses = entrada.nextDouble();
		formula(valor1, juros, meses, cont1, soma);
	}
	
	static void formula(double valor1, double juros, double meses, double cont1, double soma){
		if(cont1 < meses){
			cont1++;
			soma += valor1 * (juros / 100) * 1;
			formula(valor1, juros, meses, cont1, soma);
		}
		else{
			System.out.println(" ");
			System.out.println("Seu juros simples será de R$ " + soma);
			System.out.println(" ");
			System.out.println("Baseado em = http://brasilescola.uol.com.br/matematica/juros-simples.htm ");
		}
	}

}
