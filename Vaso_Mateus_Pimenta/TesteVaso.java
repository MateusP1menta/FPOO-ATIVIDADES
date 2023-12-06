package Aula_2308;
import java.util.Scanner;
public class TesteVaso {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*
		Pessoa bebe = new Pessoa(String n); //bebe é obj da classe Pessoa e precisa de um construtor Pessoa() dessa classe p/ ser instanciado
		
		this.nome = n;
		--------------------------
		Pessoa bebe = new Pessoa();
		bebe.nome="joelho";
		bebe.chorar();
		
		public void chorar() {
			syso("chorando")
		}
		
		bebe.mamar();
		bebe.dormir();
		bebe.acordar();
		bebe.mamar();
		bebe.idade=1;
		bebe.cabelo=0.5;
		
		
		
		//os metodos tem parenteses
		*/
		
		System.out.println("entre com os dados do Vaso:");
		System.out.println("Digite a cor do Vaso:");
		String cor = entrada.next();
		System.out.println("Digite o tamanho do vaso:");
		double tamanho = entrada.nextDouble();
		System.out.println("Digite o material do vaso:");
		String material = entrada.next();
		Vaso vs1 = new Vaso(cor, tamanho, material);
		
		System.out.println("info do Vaso:");
		vs1.exibir();
		
		VasoDecorado vs2 = new VasoDecorado();
		System.out.println("entre com os dados do Vaso Decorado:");
		System.out.println("Digite a cor do Vaso:");
		vs2.setCor(entrada.next());
		System.out.println("Digite o tamanho do vaso:");
		vs2.setTamanho(entrada.nextDouble());
		System.out.println("Digite o material do vaso:");
		vs2.setMaterial(entrada.next());
		System.out.println("Digite a decoracao do vaso:");
		vs2.setDecoracao(entrada.next());
		
		
		System.out.println("info do VasoDecorado:");
		vs2.exibir();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
