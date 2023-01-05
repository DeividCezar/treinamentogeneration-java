package polimorfismoeheranca;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Au au au!");
	}
	
	public void correr() {
		System.out.println("Correndo...");
	}

}
