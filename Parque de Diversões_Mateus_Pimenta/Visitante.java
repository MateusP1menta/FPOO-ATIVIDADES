package Atividade_Pimenta;

public class Visitante {

		private String nome;
		private int idade;
		private double altura;
		
		public int getIdade() {
			return idade;
		}
		public double getAltura() {
			return altura;
		}
		public String getNome() {
			return nome;
		}
		public boolean podeAndarNoBrinquedo() {
			if(altura > 1.45 && idade > 12) {
			System.out.println("pode entrar");
			return true;
		}else {
			System.out.println("nao pode");
			return false;
		}
		}
		
		
		public void setAltura(double a) {
			this.altura = a;
		}
		public void setIdade(int i) {
			this.idade = i;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}

		
		
		
		
		
		
		
		
	

}
