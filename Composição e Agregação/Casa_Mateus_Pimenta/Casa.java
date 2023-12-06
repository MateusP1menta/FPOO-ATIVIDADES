package Atividade_Pimenta;

public class Casa {

	private String cor;
	private float preco;
	private float metragem;
	private Quarto numeroCamas;
	private Quarto nome;
	
	public Casa() {
	}
	public Casa(String cor, float preco, float metragem, Quarto numeroCamas, Quarto nome) {
		this.cor = cor;
		this.preco = preco;
		this.metragem = metragem;
		this.numeroCamas = numeroCamas;
		this.nome = nome;
	}
	
	
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getMetragem() {
		return metragem;
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	
	public Quarto getNome() {
		return nome;
	}
	public void setNome(Quarto nome) {
		this.nome = nome;
	}
	
	public Quarto getNumeroCamas() {
		return numeroCamas;
	}
	public void setNumeroCamas(Quarto numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
	
	
	public void mostrarDetalhes() {
		System.out.println("A cor da sua casa e: " + getCor() + 
				", o preco dela e: " + getPreco() + "REAIS " +  ", a metragem dela e: " 
				+ getMetragem() + "cm quadrados ");
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
