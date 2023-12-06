package Aula_1408;
import java.util.Scanner;
public class TesteCliente {

	public static void main(String[] args) {
		Cliente1 c1 = new Cliente1();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com seus dados");
		System.out.println("cpf");
		float cpf = entrada.nextFloat();
		System.out.println("idade");
		float idade = entrada.nextFloat();
		System.out.println("telefone");
		float telefone = entrada.nextFloat();
		System.out.println("peso");
		float peso = entrada.nextFloat();
		System.out.println("altura");
		float altura = entrada.nextFloat();
	}
      
}
