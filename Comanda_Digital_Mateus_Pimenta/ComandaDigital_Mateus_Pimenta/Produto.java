package ComandaDigital_Mateus_Pimenta;

public class Produto {
	private String nome;
	private double preco;
	private String categoria;
	private String itens;
	public Produto() {
		
	}
	public Produto(String nome, double preco, String categoria) {
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getItens() {
		return itens;
	}
	public void setItens(String itens) {
		this.itens = itens;
	}
	
}
