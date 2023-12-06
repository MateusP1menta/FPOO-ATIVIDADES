package Atividade_Pimenta;

import java.util.Scanner;

public class TesteBike {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		SpeedBike sb1 = new SpeedBike();
		MountainBike mb1 = new MountainBike();
		SpeedBike sb2 = new SpeedBike();
		MountainBike mb2 = new MountainBike();
		Pessoa1 p1 = new Pessoa1();
		Pessoa1 p2 = new Pessoa1();
		
		
		System.out.println("entre com os dados da speedBike: ");
		System.out.println("digite a velocidade da speedBike:" );
		sb1.setVelocidade(entrada.nextInt());
		System.out.println("digite a marcha da speedBike:" );
		sb1.setMarcha(entrada.nextInt());
		System.out.println("digite o modelo da speedBike: ");
		sb1.setModelo(entrada.next());
		System.out.println("digite a cor da speedBike: ");
		sb1.setCor(entrada.next());
		sb1.exibir();
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("entre com os dados da speedBike2: ");
		System.out.println("digite a velocidade da speedBike2:" );
		sb2.setVelocidade(entrada.nextInt());
		System.out.println("digite a marcha da speedBike2:" );
		sb2.setMarcha(entrada.nextInt());
		System.out.println("digite o modelo da speedBike2: ");
		sb2.setModelo(entrada.next());
		System.out.println("digite a cor da speedBike2: ");
		sb2.setCor(entrada.next());
		sb2.exibir();
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("entre com os dados da moutainBike: ");
		System.out.println("digite a velocidade da mountainBike:" );
		mb1.setVelocidade(entrada.nextInt());
		System.out.println("digite a marcha da mountainBike:" );
		mb1.setMarcha(entrada.nextInt());
		System.out.println("digite o modelo da moutainBike: ");
		mb1.setModelo(entrada.next());
		System.out.println("digite a cor da moutainBike: ");
		mb1.setCor(entrada.next());
		mb1.exibir();

		System.out.println("----------------------------------------------------------------");
		
		System.out.println("entre com os dados da moutainBike2: ");
		System.out.println("digite a velocidade da mountainBike2:" );
		mb2.setVelocidade(entrada.nextInt());
		System.out.println("digite a marcha da mountainBike2:" );
		mb2.setMarcha(entrada.nextInt());
		System.out.println("digite o modelo da moutainBike2: ");
		mb2.setModelo(entrada.next());
		System.out.println("digite a cor da moutainBike2: ");
		mb2.setCor(entrada.next());
		mb2.exibir();
		
		
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("entre com os dados da pessoa1: ");
		p1.setNome("Daniel");
		System.out.println(p1.nome + " subiu na bike e trocou a marcha...");
		sb1.mudarMarcha();
		sb1.acelerar(10);
		sb1.acelerar(11);
		sb1.frear(10);
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("entre com os dados da pessoa2: ");
		p2.setNome("Gabriel");
		System.out.println(p1.nome + " subiu na bike e trocou a marcha...");
		sb2.mudarMarcha();
		sb2.acelerar(11);
		sb2.acelerar(12);
		sb2.frear(11);
		
		
		
		
		
		
	}

}
