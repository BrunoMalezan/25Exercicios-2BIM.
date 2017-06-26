package malezan.bruno;

//01) Crie um algoritmo que imprime números de 0 até 100 em ordem crescente utilizando recursividade.

public class Exercicio01{
	
	static Integer cont0 = 0, a = 100;
	
	public static void main(String[] args){
		funcao(cont0, a);
	}
	
	static void funcao(Integer cont0, Integer a){
		System.out.print(cont0 + ", ");
		if(cont0 < a){
			cont0++;
			funcao(cont0, a);
		}
	}

}
