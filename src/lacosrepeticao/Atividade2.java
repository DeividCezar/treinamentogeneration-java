package lacosrepeticao;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		int incremento, numero, impar = 0, par = 0;
		
		for (incremento = 1; incremento <= 10; incremento++) {
			
			Scanner ler = new Scanner(System.in);
			System.out.println("Número:");
			numero = ler.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Foram digitados " + par + " números pares e " + impar + " números ímpares.");
		
	}

}
