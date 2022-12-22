package orientacaoaobjetos;

public class Aviao {
	
	// Atributos:
	private String modelo;
	private String companhia;
	private int capacidade;
	private String cor;
	
	// Construtor:
	public Aviao(String modelo, String companhia, int capacidade, String cor) {
		this.modelo = modelo;
		this.companhia = companhia;
		this.capacidade = capacidade;
		this.cor = cor;
	}
	
	// Métodos:
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
