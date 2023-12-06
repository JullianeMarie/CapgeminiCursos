package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		  27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. 
		  Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. 
		  O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível 
		  (álcool – 25%, gasolina – 21% ou diesel –14%). 
		  Com valor do veículo zero encerra entrada de dados. Informe total de desconto 
		  E total pago pelos clientes;
		*/
		
		
		double desconto;
		double totalCarro;
		System.out.print("Digite o valor do carro: R$ ");
		double carro = sc.nextDouble();
		System.out.println("Qual combustivel ultilizado?");
		System.out.println("1 - ALCOOL");
		System.out.println("2 - GASOLINA");
		System.out.println("3 - DIESEL");
		
		System.out.print("Digite a opção: ");
		int opcao = sc.nextInt();
		if (opcao == 1) {
		    desconto = carro * 0.25;
			System.out.printf("Valor desconto: R$ %.2f%n", desconto );
			totalCarro = carro - desconto;
			System.out.printf("Valor total para cliente: R$ %.2f%n", totalCarro);	
		}
		
		else if (opcao == 2) {
			desconto = carro * 0.21;
			System.out.printf("Valor desconto: R$ %.2f%n", desconto );
			totalCarro = carro - desconto;
			System.out.printf("Valor total para cliente: R$ %.2f%n", totalCarro);
		}
		
		else if (opcao == 3) {
			desconto = carro * 0.14;
			System.out.printf("Valor desconto: R$ %.2f%n", desconto );
			totalCarro = carro - desconto;
			System.out.printf("Valor total para cliente: R$ %.2f%n", totalCarro);
		}
		
		else if (opcao > 3) {
			System.out.println("Número inválido");
		}
		System.out.println();
		System.out.print("Deseja continuar? S(sim)/N(não): ");
		char continuar = sc.next().charAt(0);
		
		while (continuar == 's' || continuar == 'S') {
			System.out.print("Digite o valor do carro: R$ ");
			carro = sc.nextDouble();
			System.out.println("Qual combustivel ultilizado?");
			System.out.println("1 - ALCOOL");
			System.out.println("2 - GASOLINA");
			System.out.println("3 - DIESEL");
			
			
			System.out.print("Digite a opção: ");
				opcao = sc.nextInt();
			if (opcao == 1) {
				 desconto = carro * 0.25;
				System.out.printf("Valor desconto: R$ %.2f%n", desconto );
				totalCarro = carro - desconto;
				System.out.printf("Valor total para cliente: R$ %.2f%n", totalCarro);	
			}
			
			else if (opcao == 2) {
				desconto = carro * 0.21;
				System.out.printf("Valor desconto: R$ %.2f%n", desconto );
				totalCarro = carro - desconto;
				System.out.printf("Valor total para cliente: R$ %.2f%n", totalCarro);
			}
			
			else if (opcao == 3) {
				desconto = carro * 0.14;
				System.out.printf("Valor desconto: R$ %.2f%n", desconto );
				totalCarro = carro - desconto;
				System.out.printf("Valor total para cliente: R$ %.2f%n", totalCarro);
			}
	
			else if (opcao > 3) {
				System.out.println("Número inválido");
			}
			System.out.println();
			System.out.print("Deseja continuar? S(sim)/N(não): ");
			continuar = sc.next().charAt(0);
			
			if (continuar == 'n'|| continuar == 'N') {
		 		System.out.println("Operação Finalizada");
		 	}
		}
		 	
		
		sc.close();

	}
}

/*
Digite o valor do carro: R$ 25000
Qual combustivel ultilizado?
1 - ALCOOL
2 - GASOLINA
3 - DIESEL
Digite a opção: 1
Valor desconto: R$ 6250.00
Valor total para cliente: R$ 18750.00

Deseja continuar? S(sim)/N(não): s
Digite o valor do carro: R$ 30000
Qual combustivel ultilizado?
1 - ALCOOL
2 - GASOLINA
3 - DIESEL
Digite a opção: 2
Valor desconto: R$ 6300.00
Valor total para cliente: R$ 23700.00

Deseja continuar? S(sim)/N(não): s
Digite o valor do carro: R$ 62000
Qual combustivel ultilizado?
1 - ALCOOL
2 - GASOLINA
3 - DIESEL
Digite a opção: 3
Valor desconto: R$ 8680.00
Valor total para cliente: R$ 53320.00

Deseja continuar? S(sim)/N(não): n
Operação Finalizada
 */