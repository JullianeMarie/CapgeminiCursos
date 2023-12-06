package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 * 33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula.
		 * Faça um algoritmo que calcule e exiba o salário de um professor. 
		 * Sabe-se que o valor da hora/aula segue a tabela abaixo: 
		 * a. Professor Nível 1 R$12,00 por hora/aula; 
		 * b. Professor Nível 2 R$17,00 por hora/aula; 
		 * c. Professor Nível 3 R$25,00 por hora/aula.
		 */

		double qtdeHora = 0;
		double horaAula = 0;
		System.out.println("Digite o NÍVEL do professor (1 | 2 | 3)");
		int professores = sc.nextInt();

		switch (professores) {
		case 1:
			horaAula = 12.00;
			break;
		case 2:
			horaAula = 17.00;
			break;
		case 3:
			horaAula = 25.00;
			break;
		default:
			System.out.println("Nível inválido");
			break;
		}

		System.out.println("Quantas horas trabalhadas para nível selecionado? ");
		qtdeHora = sc.nextDouble();

		double totalSalario = qtdeHora * horaAula;
		System.out.println("Valor para pagamento: R$ " + String.format("%.2f", totalSalario));

		sc.close();

	}

}

/*
 * Digite o NÍVEL do professor (1 | 2 | 3) 
 * 3 
 * Quantas horas trabalhadas para nível selecionado? 
 * 15 
 * Valor para pagamento: R$ 375.00
 */