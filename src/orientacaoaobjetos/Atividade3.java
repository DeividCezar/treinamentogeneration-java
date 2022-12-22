package orientacaoaobjetos;

public class Atividade3 {

	public static void main(String[] args) {
	
		ProdutoEletronico produtoEletronico = new ProdutoEletronico("Samsung M21S", 1599, true, true);
		
		System.out.println(produtoEletronico.getNome());
		System.out.println(produtoEletronico.getPreco());
		System.out.println(produtoEletronico.isCashback());
		System.out.println(produtoEletronico.isDescontoAVista());

	}

}
