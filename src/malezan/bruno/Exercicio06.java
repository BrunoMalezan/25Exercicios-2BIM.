package malezan.bruno;

//06) Crie um algoritmo que imprime números pares de 0 até 100 em ordem crescente utilizando recursividade.

public class Exercicio06{
	
	static Integer cont2 = 0, f = 100;
	
	public static void main(String[] args){
		funcao();
	}
	
	static void funcao(){
		System.out.print(cont2 + ", ");
		if(cont2 < f){
			cont2 += 2;
			funcao();
		}
	}

}
