package AdocaoPet;

public class Tutor {

	private String nome;
	private int idade;
	private double telefone;
	private double CPF;
	private String email;
	private String endereco;
	
	public Tutor() {
		
	}
	public Tutor(String nome, int idade, double telefone, double CPF, String email, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.CPF = CPF;
		this.email = email;
		this.endereco = endereco;
	}
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public double getCPF() {
		return CPF;
	}
	public void setCPF(double cPF) {
		CPF = cPF;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void getAssinarContrato() {
		System.out.println(this.nome + " assinou o contrato!!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
