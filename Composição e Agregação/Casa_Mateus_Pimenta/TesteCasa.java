package Atividade_Pimenta;
import java.util.Scanner;
public class TesteCasa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Quarto qua1 = new Quarto();
		Casa ca1 = new Casa();
		Sala sa1 = new Sala();
		
		
		
		
		
		System.out.println("digite o nome do quarto: ");
		qua1.setNome(entrada.next());
		System.out.println("digite o numero de camas que o quarto vai possuir: ");
		qua1.setNumeroCamas(entrada.nextInt());
		
		System.out.println("digite o nome da sala: ");
		sa1.setNome(entrada.next());
		System.out.println("tem tv?:");
		sa1.setTemTV(entrada.nextBoolean());
	
		
		
		System.out.println("digite o nome da casa");
		String var_nome = entrada.next();
		System.out.println("qntd preco");
		int var_preco = entrada.nextInt();
		System.out.println("digite a cor que voce deseja: ");
		String var_cor = entrada.next();
		System.out.println("qntd metragem");
		int var_met = entrada.nextInt();
		Casa casa1 = new Casa(var_cor, var_preco, var_met, qua1, qua1);
		System.out.println(var_nome + " custa " + var_preco + " e tem " + var_met + " cm quadrados " + " tem o quarto " + 
		qua1.getNome() + " e a sala " + sa1.getNome() + " que tem tv? " + sa1.getTemTV());
		
		
		/*
		ca1.mostrarDetalhes();
		*/

	}


}
