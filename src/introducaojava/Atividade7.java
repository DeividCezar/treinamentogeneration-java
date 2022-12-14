package introducaojava;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
	
		float coefA, coefB, coefC, coefD, coefE, coefF, valX, valY;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é o valor do coeficiente A?");
		coefA = ler.nextFloat();
		
		System.out.println("Qual é o valor do coeficiente B?");
		coefB = ler.nextFloat();
		
		System.out.println("Qual é o valor do coeficiente C?");
		coefC = ler.nextFloat();
		
		System.out.println("Qual é o valor do coeficiente D?");
		coefD = ler.nextFloat();
		
		System.out.println("Qual é o valor do coeficiente E?");
		coefE = ler.nextFloat();
		
		System.out.println("Qual é o valor do coeficiente F?");
		coefF = ler.nextFloat();
		
		valX = (coefC * coefE - coefB * coefF) / (coefA * coefE - coefB * coefD);
		valY = (coefA * coefF - coefC * coefD) / (coefA * coefE - coefB * coefD);
		
		System.out.println("O valor de x é "+ valX+ " e o valor de y é "+ valY);

	}

}
