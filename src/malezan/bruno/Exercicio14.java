package malezan.bruno;

//14) Crie um algoritmo que solicita faltas de 10 alunos e imprima a média aritmética utilizando recursividade.

import java.util.Scanner;

public class Exercicio14{
	
	static Scanner entrada;
	static float falta = 0, soma = 0, cont1 = 0, cont2 = 10;
	
	public static void main(String[] args){
		System.out.println("Insira 10 faltas de 10 alunos = ");
		funcao();
	}
	
	static void funcao(){
		if(cont1 < cont2){
			entrada = new Scanner(System.in);
			falta = entrada.nextFloat();
			cont1++;
			soma += falta;
			funcao();
		}
		else{
			System.out.print("A média aritmética foi = " + soma/cont2);
		}
	}

}
