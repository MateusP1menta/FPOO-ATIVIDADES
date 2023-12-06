package ComandaDigital_Mateus_Pimenta;

import java.util.List;

public class GRAAL {
	private String endereco;
	private int mesas;
	private List<Itens> itens;
	
	public GRAAL(){	
		
	}
	public GRAAL(String endereco, int mesas, List<Itens> itens) {
		this.endereco = endereco;
		this.mesas = mesas;
		this.itens = itens;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getMesas() {
		return mesas;
	}
	public void setMesas(int mesas) {
		this.mesas = mesas;
	}
	public List<Itens> getIntens() {
		return itens;
	}
	public void setIntens(List<Itens> intens) {
		this.itens = intens;
	}
	
	
	
	public void getExibirInfo() {
		
	}
}
