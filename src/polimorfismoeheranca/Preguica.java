package polimorfismoeheranca;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
    }
	
	@Override
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Uiiiiiiii!");
	}
	
	public void subirArvore() {
		System.out.println("Escalando...");
	}

}
