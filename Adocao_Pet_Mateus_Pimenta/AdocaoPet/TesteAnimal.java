package AdocaoPet;
import java.util.Scanner;
 class TesteAnimal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o nome do cao: ");
		String nome1 = entrada.next();
		System.out.println("digite o nome do gato: ");
		String nome2 = entrada.next();
		System.out.println("digite o nome do coelho: ");
		String nome3 = entrada.next();
		System.out.println("digite o nome do peixe: ");
		String nome4 = entrada.next();
		
		Cao c1 = new Cao("boxer", 3, 2, nome1, 'f');
		
		Gato g1 = new Gato("persa", 8, 1, nome2, 'f');
		Coelho co1 = new Coelho("australiano", 5, 1, nome3, 'm');
		Peixe p1 = new Peixe("dourado", 3, 5, nome4, 'm');

		System.out.println("                                            ");
		System.out.println("ANIMAIS NA ADOCAO: ");
		
		c1.getExibirInfo();
		g1.getExibirInfo();
		co1.getExibirInfo();
		p1.getExibirInfo();
		
		System.out.println("entre com os dados do tutor");
		System.out.println("nome");
		String nomet = entrada.next();
		System.out.println("idade");
		int i1 = entrada.nextInt();
		System.out.println("telefone");
		double tele = entrada.nextDouble();
		System.out.println("cpf");
		double cpf = entrada.nextDouble();
		System.out.println("email");
		String ema = entrada.next();
		System.out.println("endereco");
		String ende = entrada.next();
		
		Tutor t1 = new Tutor(nomet, i1, tele, cpf, ema, ende);
		Contrato con = new Contrato(1);
		System.out.println("numero do contrato: " + con.getNumeroDoContrato());
		con.getAssineOContrato();
		t1.getAssinarContrato();
		System.out.println(t1.getNome() + " adotou o(a) " + c1.getNome());
	}

}
