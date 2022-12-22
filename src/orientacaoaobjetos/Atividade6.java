package orientacaoaobjetos;

public class Atividade6 {

	public static void main(String[] args) {
	
		ContaBancaria contaBancaria = new ContaBancaria("Maria", 123456789, 1000, true);
		
		// Depositar 2000 reais:
		contaBancaria.depositar(2000);
		
		// Verificando crédito aprovado:
		System.out.println("Crédito aprovado " + contaBancaria.calcularCreditoAprovado());
		
		// Verificando limite total para gastos:
		System.out.println("Limite total: " + contaBancaria.calcularLimiteTotal());
		
		// Valor dos atributos:
		System.out.println("\n" + contaBancaria.getNome());
		System.out.println(contaBancaria.getCpf());
		System.out.println(contaBancaria.getSaldo());
		System.out.println(contaBancaria.isCreditoAprovado());

	}

}
