package atividades;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {

		float nota1, nota2, nota3, mediaPonderada;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Primeira nota:");
		nota1 = ler.nextFloat();
			
		System.out.println("Segunda nota:");
		nota2 = ler.nextFloat();
		
		System.out.println("Terceira nota:");
		nota3 = ler.nextFloat();

		mediaPonderada = (2 * nota1 + 3 * nota2 + 5 * nota3) / 10;

		System.out.println("A média ponderada das notas é "+ mediaPonderada);		

	}

}
