package ComandaDigital_Mateus_Pimenta;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
public class TesteComanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("digite o nome do cliente:");
		String var_nome = entrada.next();
		System.out.println("digite o numero da mesa do cliente");
		int var_numm = entrada.nextInt();
		System.out.println("telefone:");
		double var_tele = entrada.nextDouble();
		System.out.println("cpf:");
		double var_cp = entrada.nextDouble();
		
		
		Cliente c1 = new Cliente(var_nome, var_numm, var_tele, var_cp);
		
		System.out.println("                                                                                        ");

		System.out.println("INFORMACOES DO CLIENTE 1:");
		c1.getExibirInfo();
		
		System.out.println("digite o nome do cliente:");
		String var_nome2 = entrada.next();
		System.out.println("digite o numero da mesa do cliente");
		int var_numm2 = entrada.nextInt();
		System.out.println("telefone:");
		double var_tele2 = entrada.nextDouble();
		System.out.println("cpf:");
		double var_cp2 = entrada.nextDouble();
		
		
		Cliente c2 = new Cliente(var_nome2, var_numm2, var_tele2, var_cp2);
		
		System.out.println("                                                                                        ");

		System.out.println("INFORMACOES DO CLIENTE 2:");
		c2.getExibirInfo();
		
		System.out.println("digite o nome do cliente:");
		String var_nome3 = entrada.next();
		System.out.println("digite o numero da mesa do cliente");
		int var_numm3 = entrada.nextInt();
		System.out.println("telefone:");
		double var_tele3 = entrada.nextDouble();
		System.out.println("cpf:");
		double var_cp3 = entrada.nextDouble();
		
		
		Cliente c3 = new Cliente(var_nome3, var_numm3, var_tele3, var_cp3);
		
		System.out.println("                                                                                        ");

		System.out.println("INFORMACOES DO CLIENTE 1:");
		c3.getExibirInfo();
		
		
		
		
		
		System.out.println("                                                                                        ");
		
		System.out.println("nome do item1 desejado:");
		String var_nom = entrada.next();
		System.out.println("preco:");
		Double var_pre = entrada.nextDouble();
		System.out.println("categoria:");
		String var_cat = entrada.next();
		
			
		
		System.out.println("                                                                                        ");
		
		System.out.println("nome do item2 desejado:");
		String var_nom2 = entrada.next();
		System.out.println("preco:");
		Double var_pre2 = entrada.nextDouble();
		System.out.println("categoria:");
		String var_cat2 = entrada.next();
		
		System.out.println("                                                                                        ");

		
		System.out.println("                                                                                        ");
		
		System.out.println("nome do item3 desejado:");
		String var_nom3 = entrada.next();
		System.out.println("preco:");
		Double var_pre3 = entrada.nextDouble();
		System.out.println("categoria:");
		String var_cat3 = entrada.next();
		
		System.out.println("                                                                                        ");
		
		
		System.out.println("                                                                                        ");
		
		System.out.println("nome do item4 desejado:");
		String var_nom4 = entrada.next();
		System.out.println("preco:");
		Double var_pre4 = entrada.nextDouble();
		System.out.println("categoria:");
		String var_cat4 = entrada.next();
		
		System.out.println("                                                                                        ");
		
		
		System.out.println("nome do item5 desejado:");
		String var_nom5 = entrada.next();
		System.out.println("preco:");
		Double var_pre5 = entrada.nextDouble();
		System.out.println("categoria:");
		String var_cat5 = entrada.next();
		
		System.out.println("                                                                                        ");
		
		Produto p1 = new Produto(var_nom, var_pre, var_cat);
		Produto p2 = new Produto(var_nom2, var_pre2, var_cat2);
		Produto p3 = new Produto(var_nom3, var_pre3, var_cat3);
		Produto p4 = new Produto(var_nom4, var_pre4, var_cat4);
		Produto p5 = new Produto(var_nom5, var_pre5, var_cat5);
		

				
		System.out.println("                                                                                        ");
	
		List<Produto> lista_itens = new ArrayList<Produto>();
		lista_itens.add(p1);
		lista_itens.add(p2);
		lista_itens.add(p3);
		lista_itens.add(p4);
		lista_itens.add(p5);
		for(Produto olho : lista_itens) {
			System.out.println("itens na comanda:" + olho.getNome());
			}
		/*
		Comanda co1 = new Comanda();
		List<Produto> iT = co1.getItensComprados();
		for(Produto item : iT) {
			System.out.println("Nome: " + item.getNome() + " Preco: " + item.getPreco());
			
		}
		
		
		
		/*
		Comanda co = new Comanda();
		System.out.println("total de itens na comanda " );
		*/
		
		
		
		
		
		
		System.out.println("                                                                                        ");
		
		
		Comanda co1 = new Comanda();
		System.out.println("escolha qual vai ser o metodo de pagamento(cartao ou dinheiro): ");
		co1.setPagamento(entrada.next());															
		
		
		
		
		
		
		
		
		
		
		
	}

}
