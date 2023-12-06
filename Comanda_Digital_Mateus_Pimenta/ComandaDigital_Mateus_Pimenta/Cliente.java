package ComandaDigital_Mateus_Pimenta;

public class Cliente extends Pessoa{
	private String nome;
	private int numeroMesa;
	private double telefone;
	private double cpf;

public Cliente() {
	
}
public Cliente(String nome, int numeroMesa, double telefone, double cpf) {
	super();
	this.nome = nome;
	this.numeroMesa = numeroMesa;
	this.telefone = telefone;
	this.cpf = cpf;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getNumeroMesa() {
	return numeroMesa;
}
public void setNumeroMesa(int numeroMesa) {
	this.numeroMesa = numeroMesa;
}
public double getTelefone() {
	return telefone;
}
public void setTelefone(double telefone) {
	this.telefone = telefone;
}
public double getCpf() {
	return cpf;
}
public void setCpf(double cpf) {
	this.cpf = cpf;
}
public void getExibirInfo() {
	System.out.println("nome: " + this.nome);
	System.out.println("numero da mesa: " + this.numeroMesa);
	System.out.println("telefone: " + this.telefone);
	System.out.println("cpf: " + this.cpf);
}










}