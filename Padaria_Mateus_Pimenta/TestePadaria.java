package Atividade_Pimenta;
import java.util.Scanner;
public class TestePadaria {

	public static void main(String[] args) {
		
		Scanner  entrada = new Scanner(System.in);
		
		Pao pao1 = new Pao();
		Pao pao2 = new Pao();
		Bolo bolo1 = new Bolo();
		Bolo bolo2 = new Bolo();
		Doce doce1 = new Doce();
		Doce doce2 = new Doce();
		
		System.out.println("digite as informacoes do pao1: ");
		System.out.println("o nome do pao1 e: ");
		pao1.setNome(entrada.next());
		System.out.println("o preco do pao1 e: ");
		pao1.setPreco(entrada.nextDouble());
		pao1.exibir();
		
		
		System.out.println("digite as informacoes do pao2: ");
		System.out.println("o nome do pao2 e: ");
		pao2.setNome(entrada.next());
		System.out.println("o preco do pao2 e: ");
		pao2.setPreco(entrada.nextDouble());
		pao2.exibir();
		
		
		System.out.println("digite as informacoes do bolo1: ");
		System.out.println("o nome do bolo1 e: ");
		bolo1.setNome(entrada.next());
		System.out.println("o preco do bolo1 e: ");
		bolo1.setPreco(entrada.nextDouble());
		bolo1.exibir();
		
		
		System.out.println("digite as informacoes do bolo2: ");
		System.out.println("o nome do bolo2 e: ");
		bolo2.setNome(entrada.next());
		System.out.println("o preco do bolo2 e: ");
		bolo2.setPreco(entrada.nextDouble());
		bolo2.exibir();
		
		
		System.out.println("digite as informacoes do doce1: ");
		System.out.println("o nome do doce1 e: ");
		doce1.setNome(entrada.next());
		System.out.println("o preco do doce1 e: ");
		doce1.setPreco(entrada.nextDouble());
		doce1.exibir();
		
		
		System.out.println("digite as informacoes do doce2: ");
		System.out.println("o nome do doce2 e: ");
		doce2.setNome(entrada.next());
		System.out.println("o preco do doce2 e: ");
		doce2.setPreco(entrada.nextDouble());
		doce2.exibir();
		
		
		
		Pessoa p1 = new Pessoa();
		System.out.println("o nome da pessoa e: ");
		p1.setNome(entrada.next());
		System.out.println("a pessoa: " + p1.getNome() + " comeu o pao: " 
							+ pao1.nome + "  o bolo: " + bolo1.nome + " o doce: " + doce1.nome +
							" e tambem o doce: " + doce2.nome);
		
		
		
		
		
		
		
		
		
		

	}

}
