package Atividade_Pimenta;

public class ProdutoPadaria implements Produto{
	
	public String nome;
	public double preco;
	
	public ProdutoPadaria() {
	}
	public ProdutoPadaria(String n, double p) {
		this.nome = n;
		this.preco = p;
	}
	
	
	
	public String getNome() {
		return nome;
		
		
	}

	@Override
	public void setNome(String n) {
		
	}

	@Override
	public double getPreco() {
		return 0;
	}

	@Override
	public void setPreco(double p) {
		
	}
	public void exibir() {
		System.out.println("o nome do pao e: " + getNome());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
