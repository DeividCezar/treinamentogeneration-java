package orientacaoaobjetos;

public class Cliente {
	
	// Atributos:
	private String primeiroNome;
	private String sobrenome;
	private int idade;
	private char sexo;
	
	// Construtor:
	public Cliente(String primeiroNome, String sobrenome, int idade, char sexo) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
	}

	//Métodos:
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
