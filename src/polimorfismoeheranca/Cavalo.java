package polimorfismoeheranca;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Hiin in in!");
	}
	
	public void correr() {
		System.out.println("Correndo...");
	}

}
