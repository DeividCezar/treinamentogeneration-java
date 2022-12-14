package lacosdecisao;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int numA, numB, numC;
		
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();  
		
		System.out.println("Primeiro número:");
		numA = ler.nextInt();
		
		System.out.println("Segundo número:");
		numB = ler.nextInt();
		
		System.out.println("Terceiro número:");
		numC = ler.nextInt(); 
		
		// Quando o menor número é o primeiro digitado:
		if (numA < numB && numA < numC) {
			lista.add(numA);
			if (numB < numC) {
				lista.add(numB);
				lista.add(numC);
			} else {
				lista.add(numC);
				lista.add(numB);
			}
		
		// Quando o menor número é o segundo digitado:
		} else if (numB < numC) {
			lista.add(numB);
			if (numA < numC) {
				lista.add(numA);
				lista.add(numC);
			} else {
				lista.add(numC);
				lista.add(numA);
			}
		
		// Quando o menor número é o terceiro digitado:
		} else {
			lista.add(numC);
			if (numA < numB) {
				lista.add(numA);
				lista.add(numB);
			} else {
				lista.add(numB);
				lista.add(numA);
			}
			
		}
		
		System.out.println("A ordem crescente dos números é "+ lista);
		        
	}

}
