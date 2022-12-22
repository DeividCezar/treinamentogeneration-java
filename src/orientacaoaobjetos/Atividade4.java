package orientacaoaobjetos;

import java.time.LocalDate;

public class Atividade4 {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Paulo", "Cezar", LocalDate.of(2020, 3, 23), 17852462);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSobrenome());
		System.out.println(funcionario.getDataAdmissao());
		System.out.println(funcionario.getFuncional());

	}

}
