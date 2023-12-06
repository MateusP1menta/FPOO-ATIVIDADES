package ComandaDigital_Mateus_Pimenta;

import java.util.List;


public class Comanda {
	private List<Produto> itensComprados;
	private Cliente nome;
	private Cliente numeroMesa;
	private double precoTotal;
	private String pagamento;
	
	public Comanda() {
		
	}
	public Comanda(List<Produto> itensComprados, Cliente nome, Cliente numeroMesa, double precoTotal, String pagamento) {
		this.itensComprados = itensComprados;
		this.nome = nome;
		this.numeroMesa = numeroMesa;
		this.precoTotal = precoTotal;
		this.pagamento = pagamento;
	}
	public List<Produto> getItensComprados(){
		return itensComprados;
	
	}
	public double getPreco() {
		return precoTotal;
	}
	public void setPreco(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public Cliente getNome() {
		return nome;
	}
	public void setNome(Cliente nome) {
		this.nome = nome;
	}
	public Cliente getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(Cliente numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
		System.out.println(" pago com sucesso!! ");
	}
}


