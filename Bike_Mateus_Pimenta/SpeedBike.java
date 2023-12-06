package Atividade_Pimenta;

public class SpeedBike implements Veiculo{

	public int velocidade;
	public int marcha;
	public String modelo;
	public String cor;
	
	public SpeedBike() {
		
	}
	public SpeedBike(int v, int m, String md, String co) {
		this.marcha = m;
		this.velocidade = v;
		this.modelo = md;
		this.cor = co;
	}
	@Override
	public String mudarMarcha() {
		System.out.println("a marcha mudou para 5...");
		return null;
	}
	@Override
	public void acelerar(int vel) {
		System.out.println("aumentando a velocidade: " + vel);
		vel = vel + 1;
	}
	@Override
	public void frear(int vel) {
		System.out.println("diminuindo a velocidade: " + vel);
		vel = vel + 1;
		
	}
	
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int m) {
		this.marcha = m;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int v) {
		this.velocidade = v;
	}
	
	//bonus
	
	public String getModelo() {
		return modelo;
		
	}
	public void setModelo(String md) {
		this.modelo = md;
	}
	
	public String getCor() {
		return cor;
		
	}
	public void setCor(String co) {
		this.cor = co;
	}
	
	
	public void exibir() {
		System.out.println("a speedBike esta na velocidade: " + getVelocidade() + 
				"  e esta na marcha: " + getMarcha() + " a cor da speedBike e: " + getCor() + " e o seu modelo e: "
				+ getModelo());
	}
	
	
	
	
	
	
	
}
