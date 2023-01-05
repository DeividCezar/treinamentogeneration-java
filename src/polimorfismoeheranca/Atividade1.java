package polimorfismoeheranca;

public class Atividade1 {

	public static void main(String[] args) {
		
		Animal cavalo = new Cavalo("Juarez", 10);
		Animal cachorro = new Cachorro("Chico", 5);
		Animal preguica = new Preguica("Antonia", 2);
		
		// Emitindo sons:
		cavalo.emitirSom();
		cachorro.emitirSom();
		preguica.emitirSom();

	}

}
