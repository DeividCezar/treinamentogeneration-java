package introducaojava;

import java.util.Scanner;
import java.lang.Math;

public class Atividade6 {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2, distancia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é o valor de x1?");
		x1 = ler.nextDouble();
		
		System.out.println("Qual é o valor de y1?");
		y1 = ler.nextDouble();
		
		System.out.println("Qual é o valor de x2?");
		x2 = ler.nextDouble();
		
		System.out.println("Qual é o valor de y2?");
		y2 = ler.nextDouble();
		
		distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("A distância entre os pontos é "+ distancia);

	}

}
