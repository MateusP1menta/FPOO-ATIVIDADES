package Atividade_Pimenta;

public class Doce extends ProdutoPadaria{

	public Doce() {
	}
	public Doce(String n, double p) {
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
		System.out.println("o nome do doce e: " + this.nome + " e o preco do doce e: " + this.preco);
	}
}
