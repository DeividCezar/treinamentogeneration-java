package orientacaoaobjetos;

public class Atividade2 {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao("Airbus A321", "Latam", 177, "Cinza");
		
		System.out.println(aviao.getModelo());
		System.out.println(aviao.getCompanhia());
		System.out.println(aviao.getCapacidade());
		System.out.println(aviao.getCor());

	}

}
