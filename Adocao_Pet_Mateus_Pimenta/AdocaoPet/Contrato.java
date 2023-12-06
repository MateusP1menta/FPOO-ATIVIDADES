package AdocaoPet;

public class Contrato {

	private int numeroDoContrato;

	
	public Contrato() {
		
	}
	public Contrato(int numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}
	public int getNumeroDoContrato() {
		return numeroDoContrato;
	}

	public void setNumeroDoContrato(int numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}
	public void getAssineOContrato() {
		System.out.println("assine o contrato para adotar");
	}
}
