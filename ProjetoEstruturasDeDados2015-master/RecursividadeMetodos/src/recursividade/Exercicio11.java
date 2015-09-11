package recursividade;

import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {



	static int exibeNum(int num){
		Random gerador = new Random();
		int aleatorio = gerador.nextInt(100);
		while (aleatorio != num){
			aleatorio = gerador.nextInt(100);
			
			System.out.println(aleatorio);
		}
		return aleatorio;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite o valor: ");
		valor = leitor.nextInt();
		
		System.out.println("ACHOOOU!!! " + exibeNum(valor));
		
	}

}
