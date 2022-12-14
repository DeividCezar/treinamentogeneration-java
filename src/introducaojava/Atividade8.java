package introducaojava;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
	
		double custoFabrica, custoConsumidor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é o custo de fábrica?");
		custoFabrica = ler.nextFloat();
		
		custoConsumidor = (custoFabrica * (1.0 + 0.28 + 0.45));
		
		System.out.println(("O custo ao consumidor é "+ custoConsumidor));
			
	}

}
