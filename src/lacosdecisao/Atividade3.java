package lacosdecisao;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Idade:");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Categoria infantil.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Categoria juvenil.");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Categoria adulto.");
		} else {
			System.out.println("Categoria não definida.");
		}
		
		

	}

}
