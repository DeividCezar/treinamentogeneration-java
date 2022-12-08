package atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		int numeroA, numeroB, numeroC;
		float numeroR, numeroS, resultadoD;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Primeiro número inteiro e positivo:");
		numeroA = ler.nextInt();
		
		System.out.println("Segundo número inteiro e positivo:");
		numeroB = ler.nextInt();
		
		System.out.println("Terceiro número inteiro e positivo:");
		numeroC = ler.nextInt();
		
		numeroR = (numeroA + numeroB) * (numeroA + numeroB);
		numeroS = (numeroB - numeroC) * (numeroB - numeroC);

		resultadoD = (numeroR + numeroS) / 2;
		
		System.out.println("O resultado é "+ resultadoD);

	}

}
