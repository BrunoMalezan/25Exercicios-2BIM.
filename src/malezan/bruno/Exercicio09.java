package malezan.bruno;

//09) Crie um algoritmo que imprime n�meros impares de 0 at� 100 em ordem decrescente utilizando recursividade.

public class Exercicio09{
	
	static Integer cont5 = 99, i = 1;
	
	public static void main(String[] args){
		funcao();
	}
	
	static void funcao(){
		System.out.print(cont5 + ", ");
		if(cont5 > i){
			cont5 -= 2;
			funcao();
		}
	}

}
