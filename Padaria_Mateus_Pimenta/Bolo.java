package Atividade_Pimenta;

public class Bolo extends ProdutoPadaria{

	public Bolo() {
	}
	public Bolo(String n, double p) {
		this.nome = n;
		this.preco = p;
	}
	
	
	
	public String getNome() {
		return nome;
		
		
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double p) {
		this.preco = p;
	}
	
	public void exibir() {
		System.out.println("o nome do bolo e: " + this.nome + " e o preco do bolo e: " + this.preco);
	}
	
}
