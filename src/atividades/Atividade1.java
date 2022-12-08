package atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int anos, meses, dias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos anos?");
		anos = ler.nextInt();
		
		System.out.println("Quantos meses?");
		meses = ler.nextInt();

		System.out.println("Quantos dias?");
		dias = ler.nextInt();

		dias += 365 * anos + 30 * meses;

		System.out.println("São "+ dias+ " dias.");

	}

}
