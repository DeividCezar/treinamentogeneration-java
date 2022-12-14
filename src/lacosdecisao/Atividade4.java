package lacosdecisao;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		int numero;
		double raiz, quadrado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Número:");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("O número é PAR e sua raiz quadrada é " + raiz);
		} else {
			quadrado = Math.pow(numero, 2);
			System.out.println("O número é ÍMPAR e seu quadrado é " + quadrado);
		}

	}

}
