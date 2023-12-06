package Atividade_Pimenta;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TesteVoo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Cliente c1 = new Cliente();
		
		
		System.out.println("nome:");
		c1.setNome(entrada.next());
		System.out.println("sobrenome:");
		c1.setSobreNome(entrada.next());
		System.out.println("email:");
		c1.setEmail(entrada.next());
		
	
		
		System.out.println("numero voo1: ");
		String var_num1 = entrada.next();
		System.out.println("origem: ");
		String var_ori1 = entrada.next();
		System.out.println("destino: ");
		String var_des1 = entrada.next();
		System.out.println("preco: ");
		double var_pre1 = entrada.nextDouble();
		
		System.out.println("numero voo2: ");
		String var_num2 = entrada.next();
		System.out.println("origem: ");
		String var_ori2 = entrada.next();
		System.out.println("destino: ");
		String var_des2 = entrada.next();
		System.out.println("preco: ");
		double var_pre2 = entrada.nextDouble();
		
		System.out.println("numero voo3: ");
		String var_num3 = entrada.next();
		System.out.println("origem: ");
		String var_ori3 = entrada.next();
		System.out.println("destino: ");
		String var_des3 = entrada.next();
		System.out.println("preco: ");
		double var_pre3 = entrada.nextDouble();
		
		
		entrada.nextLine();
		
		LocalDate dataIda = null;
		System.out.println("digite a data de ida (dd-MM-yyyy): ");
		String dataV = entrada.nextLine();
	
		dataIda = LocalDate.parse(dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	
		
		LocalDate dataVolta = null;
		System.out.println("digite a data de volta (dd-MM-yyyy): ");
		String dataV1 = entrada.nextLine();
		
		dataVolta = LocalDate.parse(dataV1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		
		
		Voo v1 = new Voo(var_num1, var_ori1, var_des1, var_pre1, dataIda, dataVolta);
		Voo v2 = new Voo(var_num2, var_ori2, var_des2, var_pre2, dataIda, dataVolta);
		Voo v3 = new Voo(var_num3, var_ori3, var_des3, var_pre3, dataIda, dataVolta);
		
		v1.mostrarDetalhes();
		v2.mostrarDetalhes();
		v3.mostrarDetalhes();
		
		
		System.out.println("o cliente escolheu o voo1!!!");
		Passagem p1 = new Passagem(v1,c1);
		System.out.println(p1.toString());
		
		
		
		
		
	}

}
