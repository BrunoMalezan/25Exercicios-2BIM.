package malezan.bruno;

//16) Crie um algoritmo que solicita o nome de 10 alunos e imprima todos os nomes armazenados utilizando recursividade.

import java.util.Scanner;

public class Exercicio16{
	
	static Scanner entrada;
	static Integer cont1 = 0, cont2 = 10;
	static String nome, soma = "Nomes = ", virgula = "; ", resposta;
	
	public static void main(String[] args){
		System.out.println("Insira 10 nomes de 10 alunos = ");
		funcao();
	}
	
	static void funcao(){
		if(cont1 < cont2){
			entrada = new Scanner(System.in);
			nome = entrada.nextLine();
			soma += nome += virgula;
			cont1++;
			funcao();
		}
		else{
			System.out.println(soma);
		}
	}

}
