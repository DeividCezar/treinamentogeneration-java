package orientacaoaobjetos;

public class ProdutoEletronico {
	
	// Atributos:
	private String nome;
	private float preco;
	private boolean cashback;
	private boolean descontoAVista;
	
	// Construtor:
	public ProdutoEletronico(String nome, float preco, boolean cashback, boolean descontoAVista) {
		this.nome = nome;
		this.preco = preco;
		this.cashback = cashback;
		this.descontoAVista = descontoAVista;
	}

	// Métodos:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public boolean isCashback() {
		return cashback;
	}

	public void setCashback(boolean cashback) {
		this.cashback = cashback;
	}

	public boolean isDescontoAVista() {
		return descontoAVista;
	}

	public void setDescontoAVista(boolean descontoAVista) {
		this.descontoAVista = descontoAVista;
	}
	
	
	

}
