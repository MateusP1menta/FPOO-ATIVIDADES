package Atividade_Pimenta;

public class MountainBike implements Veiculo{

	public int velocidade;
	public int marcha;
	public String modelo;
	public String cor;
	
	public MountainBike() {
		
	}
	public MountainBike(int v, int m, String md, String co) {
		this.marcha = m;
		this.velocidade = v;
		this.modelo = md;
		this.cor = co;
	}
	@Override
	public String mudarMarcha() {
		
		return null;
	}
	@Override
	public void acelerar(int vel) {
		
		
	}
	@Override
	public void frear(int vel) {
		
		
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
		System.out.println("a moutainBike esta na velocidade: " + getVelocidade() + 
				"  e esta na marcha: " + getMarcha() + " a cor da moutainBike e: " + getCor() + " e o seu modelo e: "
				+ getModelo());
	}

}
