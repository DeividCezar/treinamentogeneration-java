package orientacaoaobjetos;

public class Paciente {
	
	private String nome;
	private int diasInternado;
	private int idade;
	private boolean pacientePlano;
	
	public Paciente(String nome, int diasInternado, int idade, boolean pacientePlano) {
		this.nome = nome;
		this.diasInternado = diasInternado;
		this.idade = idade;
		this.pacientePlano = pacientePlano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDiasInternado() {
		return diasInternado;
	}

	public void setDiasInternado(int diasInternado) {
		this.diasInternado = diasInternado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isPacientePlano() {
		return pacientePlano;
	}

	public void setPacientePlano(boolean pacientePlano) {
		this.pacientePlano = pacientePlano;
	}

}
