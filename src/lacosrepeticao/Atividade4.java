package lacosrepeticao;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		int incremento = 1, idade, sexo, personalidade, 
				calmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervosas40 = 0, calmas18 = 0;
		
		Scanner ler = new Scanner(System.in);
		
		// Para 150 pessoas basta mudar o valor final do incremento abaixo:
		while (incremento <= 3) {
			
			System.out.println("Idade:");
			idade = ler.nextInt();
			
			System.out.println("Sexo (1-feminino / 2-masculino / 3-Outros):");
			sexo = ler.nextInt();
			
			System.out.println("Personalidade (1-calma / 2-nervosa / 3-agressiva):");
			personalidade = ler.nextInt();
			
			if (personalidade == 1) {calmas++;}
			if (sexo == 1 && personalidade == 2) {mulheresNervosas++;}
			if (sexo == 2 && personalidade == 3) {homensAgressivos++;}
			if (sexo == 3 && personalidade == 1) {outrosCalmos++;}
			if (personalidade == 2 && idade > 40) {nervosas40++;}
			if (personalidade == 1 && idade < 18) {calmas18++;}
			
			incremento++;
		}
	
		System.out.println("Número de pessoas calmas: " + calmas);
		System.out.println("Número de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Número de homens agressivos: " + homensAgressivos);
		System.out.println("Número de outros calmos: " + outrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nervosas40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + calmas18);

	}
}
