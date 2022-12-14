package lacosdecisao;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int numA, numB, numC;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Primeiro número:");
		numA = ler.nextInt();
		
		System.out.println("Segundo número:");
		numB = ler.nextInt();
		
		System.out.println("Terceiro número:");
		numC = ler.nextInt();
		
		if (numA > numB && numA > numC) {
			System.out.println("O maior número é "+ numA);
		} else if (numB > numC) {
			System.out.println("O maior número é "+ numB);
		} else {
			System.out.println("O maior número é " + numC);
		}

	}

}
