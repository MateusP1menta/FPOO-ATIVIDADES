package Atividade_Pimenta;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class TesteBanda {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		MembroBanda m1 = new Vocalista();
		MembroBanda m2 = new Baixista("m2");
		MembroBanda m3 = new Baterista("m3");
		MembroBanda m4 = new Guitarrista("m4");
		
		System.out.println("digite o nome do vocalista");
		m1.setNome(entrada.next());
		System.out.println("digite o nome do baixista");
		m2.setNome(entrada.next());
		System.out.println("digite o nome do baterista");
		m3.setNome(entrada.next());
		System.out.println("digite o nome do guitarrista");
		m4.setNome(entrada.next());
		
		List<MembroBanda> lista_membro = new ArrayList<MembroBanda>();
		lista_membro.add(m1);
		lista_membro.add(m2);
		lista_membro.add(m3);
		lista_membro.add(m4);
		for(MembroBanda olho : lista_membro) {
			System.out.println("membros: " + olho.getNome());
		}
		
		Banda b1 = new Banda("Rosa", lista_membro);
		System.out.println("digite o nome da banda: ");
		b1.setNome(entrada.next());
		List<MembroBanda> ro = b1.getAdicionarMembro();
		for(MembroBanda meb : ro) {
			System.out.println("adicionou o membro: " + meb.getNome() + " para a banda: " + b1.getNome());
		}
		b1.realizarShow();
		m1.tocar();
		m2.tocar();
		m3.tocar();
		m4.tocar();
		
		
	}

}
