package orientacaoaobjetos;

import java.time.LocalDate;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private LocalDate dataAdmissao;
	private int funcional;
	
	public Funcionario(String nome, String sobrenome, LocalDate dataAdmissao, int funcional) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataAdmissao = dataAdmissao;
		this.funcional = funcional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public int getFuncional() {
		return funcional;
	}

	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}
	
	

}
