package orientacaoaobjetos;

public class Patinete {
	
	private int altura;
	private int aro;
	private int pesoMaximo;
	private String marca;
	
	public Patinete(int altura, int aro, int pesoMaximo, String marca) {
		this.altura = altura;
		this.aro = aro;
		this.pesoMaximo = pesoMaximo;
		this.marca = marca;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public int getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
}
