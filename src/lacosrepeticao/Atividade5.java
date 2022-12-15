package lacosrepeticao;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		int numero, soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Número:");
			numero = ler.nextInt();
			soma += numero;
		} while (numero != 0);
		
		System.out.println("A soma de todos os números digitados é igual a "+ soma);
	}

}
