package malezan.bruno;

//08) Crie um algoritmo que imprime números pares de 0 até 100 em ordem decrescente utilizando recursividade.

public class Exercicio08{
	
	static Integer cont4 = 100, h = 0;
	
	public static void main(String[] args){
		funcao();
	}
	
	static void funcao(){
		System.out.print(cont4 + ", ");
		if(cont4 > h){
			cont4 -= 2;
			funcao();
		}
	}

}
