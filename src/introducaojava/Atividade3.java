package introducaojava;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é o tempo de duração do evento (expresso em segundos)?");
		segundos = ler.nextInt();

		horas = segundos/3600;
		segundos -= horas * 3600;

		minutos = segundos/60;
		segundos -= minutos * 60;
		
		System.out.println("O tempo de duração foi de "+ horas+ " horas, "+ minutos+ " minutos e "+ segundos+ " segundos.");

	}

}
