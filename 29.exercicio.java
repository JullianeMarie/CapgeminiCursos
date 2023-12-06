package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 * 29. Faça um algoritmo que receba o número do mês e mostre o mês
		 * correspondente. Valide mês inválido;
		 */

		System.out.println("Digite um número do mês:");
		int mes = sc.nextInt();
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Mês Inválido");
			break;
		}
		System.out.println("Deseja continuar? (s)SIM | (n)NÃO");
		char continuar = sc.next().charAt(0);

		while (continuar == 's' || continuar == 'S') {
			System.out.println("Digite o número do mês");
			mes = sc.nextInt();

			switch (mes) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Março");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Setembro");
				break;
			case 10:
				System.out.println("Outubro");
				break;
			case 11:
				System.out.println("Novembro");
				break;
			case 12:
				System.out.println("Dezembro");
				break;
			default:
				System.out.println("Mês Inválido");
				break;
			}
			System.out.println();

			System.out.println("Deseja continuar? (s)SIM | (n)NÃO");
			continuar = sc.next().charAt(0);
		}

		System.out.println("FIM");

		sc.close();

	}
}

/*
Digite um número do mês:
1
Janeiro
Deseja continuar? (s)SIM | (n)NÃO
s
Digite o número do mês
30
Mês Inválido

Deseja continuar? (s)SIM | (n)NÃO
s
Digite o número do mês
5
Maio

Deseja continuar? (s)SIM | (n)NÃO
n
FIM
 */