package Atividade_Pimenta;

public class Brinquedo {

	private String nome;
	private double alturaMinima;	
	private int capacidadeMaxima;
	
	public double getAlturaMinima() {
		return alturaMinima;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setAlturaMinima(double a) {
		this.alturaMinima = a;
	}
	public void setCapacidadeMaxima(int c) {
		this.capacidadeMaxima = c;
	}
	
	public void exibirInfo() {
		System.out.println("Nome:\" + nome + \"Altura\" + alturaMinima + \"Capacidade\" + capacidadeMaxima");
	}
}
