package Atividade_Pimenta;

import java.util.List;

public class Banda {

	private String nome;
	private List <MembroBanda> membros;
	
	public Banda() {
		
	}
	public Banda(String nome, List<MembroBanda> membros) {
		this.nome = nome;
		this.membros = membros;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List <MembroBanda> getMembros() {
		return membros;
	}
	public void setMembros(List <MembroBanda> membros) {
		this.membros = membros;
	}

	public void realizarShow() {
		System.out.println("a banda vai tocar em 3, 2, 1");
	}
	public List<MembroBanda> getAdicionarMembro() {
		return membros;
	}
}
