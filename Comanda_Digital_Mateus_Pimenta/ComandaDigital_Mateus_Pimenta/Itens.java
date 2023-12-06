package ComandaDigital_Mateus_Pimenta;

public class Itens {
	//private String descricao;

	private Produto nome;
	private Produto preco;
	
	public Itens() {
		
	}
	public Itens( Produto nome, Produto preco) {
		//this.descricao = descricao;
		this.nome =nome;
		this.preco = preco;
	}
	/*public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}*/
	public Produto getNome() {
		return nome;
	}
	public void setNome(Produto nome) {
		this.nome = nome;
	}
	public Produto getPreco() {
		return preco;
	}
	public void setPreco(Produto preco) {
		this.preco = preco;
	}
	
}
