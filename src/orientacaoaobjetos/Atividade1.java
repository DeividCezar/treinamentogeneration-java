package orientacaoaobjetos;

public class Atividade1 {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Deivid", "Silva", 23, 'M');
		
		System.out.println(cliente.getPrimeiroNome());
		System.out.println(cliente.getSobrenome());
		System.out.println(cliente.getIdade());
		System.out.println(cliente.getSexo());

	}

}
