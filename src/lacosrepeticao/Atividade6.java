package lacosrepeticao;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		int numero, soma = 0, denominador = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			
			System.out.println("Número:");
			numero = ler.nextInt();
			
				if (numero % 3 == 0 && numero != 0) {
					soma += numero;
					denominador++;
				}
			
				
		} while (numero != 0);
		
		System.out.println("A soma de todos os números digitados múltiplos de três é igual a "+ soma/denominador);
	}

}
