package malezan.bruno;

//17) Crie um algoritmo que multiplica dois números naturais, através de somas sucessivas utilizando recursividade (Ex.: 6 * 4 = 4 + 4 + 4 + 4 + 4 + 4).

import java.util.Scanner;

public class Exercicio17{
	
	static Scanner entrada;
	static Integer valor1 = 0, valor2 = 0, valor3 = 0, cont1 = 0;
	
	public static void main(String[] args){
		System.out.println("***Insira dois numeros naturais***");
		System.out.println(" ");
		funcao();
	}
	
	static void funcao(){
		System.out.print("Insira o primeiro numero natural = ");
		entrada = new Scanner(System.in);
		valor1 = entrada.nextInt();
		System.out.print("Insira o segundo numero natural = ");
		entrada = new Scanner(System.in);
		valor2 = entrada.nextInt();
		valor3 = valor2;
		imput(valor1, valor2, valor3, cont1);
	}
	
	static void imput(Integer valor1, Integer valor2, Integer valor3, Integer cont1){
		if(cont1 < valor1){
			cont1++;
			valor2 += valor3;
			imput(valor1, valor2, valor3, cont1);
		}
		else{
			valor2 -= valor3;
			System.out.print("A multiplicação deste dois valores naturais foi = " + valor2);
		}
	}

}
