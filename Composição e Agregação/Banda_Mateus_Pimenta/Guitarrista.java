package Atividade_Pimenta;

public class Guitarrista extends MembroBanda{

	public Guitarrista() {
		super();
		
	}
	
	public Guitarrista(String nome) {
		super(nome);
	}
	
	
	
	public void tocar() {
		System.out.println("o guitarrista esta tocando...");
	}
}
