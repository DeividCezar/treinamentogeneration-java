package orientacaoaobjetos;

public class Atividade7 {

	public static void main(String[] args) {
	
		Paciente paciente = new Paciente("João", 10, 82, true);
		
		System.out.println(paciente.getNome());
		System.out.println(paciente.getDiasInternado());
		System.out.println(paciente.getIdade());
		System.out.println(paciente.isPacientePlano());

		
	}

}
