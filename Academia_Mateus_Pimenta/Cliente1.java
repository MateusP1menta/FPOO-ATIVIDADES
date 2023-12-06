package Aula_1408;

public class Cliente1 {
		
		public double cpf;
		public String nome;
		public double telefone;
		public int idade;
		public double altura;
		public float peso;
		
		
		public double getCpf() {
			return cpf;
		}
		public double setCpf(double c) {
			return cpf = c;
		}
		public String getNome() {
			return nome;
		}
		public void setModelo(String n) {
			nome = n;
		}
		public double getTelefone() {
			return telefone;
		}
		public double setTelefone(double t) {
			return telefone = t;
		}
		public float setAltura(double a) {
			return (float) altura;
		}
		public float getAltura(double a) {
			return (float) (altura = a);
		}
		public float setPeso(double p) {
			return peso;
		}
		public float getPeso(double p) {
			return peso = (float) p;
		}
		
		
		public void calcularIMC(float peso, float altura) {
			float resultado = 0f;
			resultado = peso / (altura * altura);
			if (resultado < 185) {
				System.out.println("magreza");
			}else if (resultado > 18.5 && resultado < 28.9) {
				System.out.println("normal");
			}else if (resultado > 21 && resultado < 29.9) {
				System.out.println("sobrepeso");
			}
		}

}
