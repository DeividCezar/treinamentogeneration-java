package orientacaoaobjetos;

public class ContaBancaria {
	
	private String nome;
	private int cpf;
	private float saldo;
	private boolean creditoAprovado;
	
	public ContaBancaria(String nome, int cpf, float saldo, boolean creditoAprovado) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
		this.creditoAprovado = creditoAprovado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isCreditoAprovado() {
		return creditoAprovado;
	}

	public void setCreditoAprovado(boolean creditoAprovado) {
		this.creditoAprovado = creditoAprovado;
	}
	
	public void depositar(float deposito) {
		this.saldo += deposito;
	}
	
	public float calcularCreditoAprovado() {
		return saldo * 2;
	}
	
	public float calcularLimiteTotal() {
		return saldo + calcularCreditoAprovado();
	}

}
