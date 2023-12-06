package Aula_2308;

public class Vaso {
	//atributos
	private String cor;
	private double tamanho;
	private String material;
	
	Vaso(){
		System.out.println("O vaso foi criado!!");
	}
	public Vaso(String cor, double tamanho, String material) {
		this.cor = cor;
		this.tamanho = tamanho;
		this.material  = material;
	}
	//metodos getters e setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		 this.cor  = cor;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	public void exibir() {
		System.out.println("Cor:" + this.cor + " " + "Tamanho:" 
	+ this.tamanho + "cm" + " " + "Material:" + this.material);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
