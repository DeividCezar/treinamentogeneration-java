package introducaojava;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int anos, meses, dias;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Quantos dias?");
		dias = ler.nextInt();

		anos = dias / 365;
		dias -= anos * 365;

		meses = dias / 30;
		dias -= meses * 30;
		
		System.out.println("A idade é equivalente a "+ anos+ " anos, "+ meses+ " meses e "+ dias+ " dias.");

	}

}
