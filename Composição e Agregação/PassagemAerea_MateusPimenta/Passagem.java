package Atividade_Pimenta;

public class Passagem {

	private  Voo voo;
	private Cliente cliente;
	private double precoTotal;
	
	
	public Passagem() {
		
	}
	public Passagem(Voo voo, Cliente cliente, double precoTotal) {
		this.voo = voo;
		this.cliente = cliente;
		this.precoTotal = precoTotal;
	}
	
	public Passagem(Voo voo, Cliente cliente) {
		this.voo = voo;
		this.cliente = cliente;
	}
	
	
	
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	@Override
	public String toString() {
		return "cliente: " + cliente.getNome() + " " + cliente.getSobreNome() + " numeroVoo: " + voo.getNumeroVoo() 
		+ " origem do voo: "+voo.getOrigem()
		+ " destino: "+voo.getDestino() + " preco: "+voo.getPreco();
	}
	
	
	
	
	
	
	
	
}
