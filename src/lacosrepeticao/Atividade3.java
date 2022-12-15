package lacosrepeticao;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int maiores = 0, menores = 0, idade = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while (idade != -99) {
			
			System.out.println("Idade:");
			idade = ler.nextInt();
			
			if (idade < 21 && idade > 0) {
				menores++;
			} else if (idade > 50) {
				maiores++;
			}
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + menores);
		System.out.println("Total de pessoas com mais de 50 anos: " + maiores);
		
	}
}
