package malezan.bruno;

//07) Crie um algoritmo que imprime números impares de 0 até 100 em ordem crescente utilizando recursividade.

public class Exercicio07{
	
	static Integer cont3 = 99, g = 1;
	
	public static void main(String[] args){
		funcao();
	}
	
	static void funcao(){
		System.out.print(g + ", ");
		if(cont3 > g){
			g += 2;
			funcao();
		}
	}

}
