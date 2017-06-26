package malezan.bruno;

//02) Crie um algoritmo que imprime números de 0 até 100 em ordem decrescente utilizando recursividade.

public class Exercicio02{
	
	static Integer cont1 = 100, b = 0;
	
	public static void main(String[] args){
		funcao(cont1, b);
	}
	
	static void funcao(Integer cont1, Integer b){
		System.out.print(cont1 + ", ");
		if(cont1 > b){
			cont1--;
			funcao(cont1, b);
		}
	}

}
