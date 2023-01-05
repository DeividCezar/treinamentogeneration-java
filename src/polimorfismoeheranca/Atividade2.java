package polimorfismoeheranca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int i = 4;
		
		Scanner ler = new Scanner(System.in);
		
		List<String> estoqueJogos = new ArrayList<>();
		
		// Estoque básico para iniciar o programa
		estoqueJogos.addAll(Arrays.asList("Fortnite",
				"Final Fantasy XIV: A Realm Reborn",
				"Valorant",
				"World of Warcraft",
				"League of Legends",
				"Free Fire"));
		
		while (i != 5) {
			
			// OPÇÕES
			System.out.println("");
			System.out.println("1 - Armazenar novo produto");
			System.out.println("2 - Excluir produto");
			System.out.println("3 - Atualizar produto");
			System.out.println("4 - Apresentar estoque");
			System.out.println("5 - Sair");
			
			i = ler.nextInt();
			
			// ARMAZENAR
			if (i == 1) {
				
				System.out.println("Digite o nome do jogo a ser armazenado:");
				String dado = ler.next();
				estoqueJogos.add(dado);
			
			} else if (i == 2) {
				
				System.out.println("Digite o nome do jogo a ser excluído:");
				String dado = ler.next();
				estoqueJogos.remove(dado);
				
			} else if (i == 3) {
				
				System.out.println("Digite o nome do jogo a ser atualizado:");
				String dado = ler.next();
				estoqueJogos.remove(dado);
				
				System.out.println("Digite o novo nome:");
				String dado1 = ler.next();
				estoqueJogos.add(dado1);
				
			} else if (i == 4) {
				
				System.out.println(estoqueJogos);
				
			} else if (i == 5) {
				
				System.out.println("Fim do programa!");
				
			} else {
				
				System.out.println("Valor inexistente, tente novamente!");
			}	
		}
	}
}
