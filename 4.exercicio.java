import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("4 - Escreva um algoritmo que leia o nome de um vendedor, "
				+ "salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). "
				+ "Sabendo que o vendedor ganha 15% de comissão sobre suas vendas efetuadas. "
				+ "Informar o seu nome, o salário fixo e salário no final do mês.");
        	System.out.println("Informe o nome do vendedor cadastrado: ");
       		String nomeVendedor = sc.nextLine();
       		System.out.println("Salário fixo: R$ 1500.00");
		double salariofx = 1500.00;
		System.out.print("Total do valor das vendas mensal: R$: ");
		double totalVendas = sc.nextDouble();
		double comissao = totalVendas * 15 /100;
		double totalSalario = salariofx + comissao;
		System.out.printf("Nome vendedor: %s / Salário Fixo: R$ %.3f%n", nomeVendedor, salariofx);
		System.out.printf("Salário final do mês: R$ %.2f%n", totalSalario);

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
4 - Escreva um algoritmo que leia o nome de um vendedor, salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que o vendedor ganha 15% de comissão sobre suas vendas efetuadas. 
Informar o seu nome, o salário fixo e salário no final do mês.

Informe o nome do vendedor cadastrado: 
Theodoro Fonseca
Salário fixo: R$ 1500.00
Total do valor das vendas mensal: R$: 15000
Nome vendedor: Theodoro Fonseca / Salário Fixo: R$ 1500.000
Salário final do mês: R$ 3750.00

 



