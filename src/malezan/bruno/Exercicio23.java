package malezan.bruno;

//23) Crie o algoritmo de euclides para encontrar o máximo divisor comum (MDC) entre dois números inteiros diferentes de zero.

import java.util.Scanner;

public class Exercicio23{
	
	static Scanner entrada;
	static Integer valor1, valor2, sobra, cont1;

	public static void main(String[] args){
		  entrada = new Scanner(System.in);
		  System.out.print("Insira o primeiro valor = ");
		  valor1 = entrada.nextInt();
		  System.out.print("Insira o segundo valor = ");
		  valor2 = entrada.nextInt();
		  funcao(valor1, valor2, sobra, cont1);
	}
		  
	static void funcao(Integer valor1, Integer valor2, Integer sobra, Integer cont1){
		  if(valor1 < valor2){
			  cont1 = valor1;
			  valor1 = valor2;
			  valor2 = cont1;
		  }
		  sobra = valor1 % valor2;
		  while(sobra != 0){
		   valor1 = valor2;
		   valor2 = sobra;
		   sobra = valor1 % valor2;
		  }
		  System.out.println( "MDC = " + valor2);
	}

}
