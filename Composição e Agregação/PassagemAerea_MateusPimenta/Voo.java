package Atividade_Pimenta;

import java.time.LocalDate;

public class Voo {
	
	private String numeroVoo;
	private String origem;
	private String destino;	
	private double preco;
	private LocalDate dataIda;
	private LocalDate dataVolta;
	
	public Voo() {
		
	}
	public Voo(String numeroVoo, String origem, String destino, double preco, LocalDate dataIda, LocalDate dataVolta) {
		this.numeroVoo = numeroVoo;
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
	}
	
	
	public String getNumeroVoo() {
		return numeroVoo;
	}
	public void setNumeroVoo(String numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public LocalDate getDataIda() {
		return dataIda;
	}
	public void setDataIda(LocalDate dataIda) {
		this.dataIda = dataIda;
	}
	public LocalDate getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(LocalDate dataVolta) {
		this.dataVolta = dataVolta;
	}
	
	public void mostrarDetalhes() {
		System.out.println("numero do voo: " + this.numeroVoo);
		System.out.println("origem: " + this.origem);
		System.out.println("destino: " + this.destino);
		System.out.println("preco: " + this.preco);
		System.out.println("dataIda: " + this.dataIda);
		System.out.println("dataVolta: " + this.dataVolta);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
