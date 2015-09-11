package recursividade;

import java.util.Scanner;

public class Exercicio11_b {

	/**
	 * @param args
	 */
	static int tentativas = 1;
	static Scanner leitor = new Scanner(System.in);
	
	
	static int cadastrarNotasFrequencia (double media, int faltas){
		System.out.println("Digite o nota 1: ");
		double nota1 = leitor.nextDouble();
		System.out.println("Digite o nota 2: ");
		double nota2 = leitor.nextDouble();
		System.out.println("Digite o numero de faltas: ");
		int numFaltas = leitor.nextInt();
		
		double mediaFinal = (nota1 + nota2) / 2;
		
		if((mediaFinal < media) || (numFaltas > faltas)){
			tentativas ++;
			cadastrarNotasFrequencia(media, faltas);
		}
		
		
		return tentativas; 
	}
	
	
	public static void main(String[] args) {
		System.out.println("Digite a media: ");
		double media = leitor.nextDouble();
		System.out.println("Digite o numero de faltas permitidos: ");
		int faltas = leitor.nextInt();
		
		System.out.println("Parabens pela percistencia, voce tentou "+cadastrarNotasFrequencia(media, faltas)+" vezes");
		
		
	}

}
