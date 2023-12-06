package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 * 21.Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e
		 * saúde) E informe se está apta ou não para cumprir o serviço militar
		 * obrigatório. Informe os totais; 
		 */
		
		int apto = 0;
		int naoApto = 0;
		

		System.out.println("***Triagem Alistamento Militar***");
		System.out.println();
		System.out.print("Informe o nome completo do alista: ");
		String nome = sc.nextLine();
		System.out.print("Informe o genêro do alista(F)ou(M): ");
		char genero = sc.next().charAt(0);
		System.out.print("Informe a idade do alista: ");
		int idade = sc.nextInt();
		System.out.println("Possui comorbidades crônicas?");
		System.out.print("RESPIRATÓRIA, CARDIÁCA, RENAL, HEPÁTICA / (S)SIM-(N)NÃO?: ");
		char resposta = sc.next().charAt(0);

		if (resposta == 's' || resposta == 'S') {
			System.out.println("NÃO APTO para alistamento");
			System.out.println("Nome: " + nome + " |" + genero + " |" + idade + " anos");
			naoApto++;
		} else {
			System.out.println("APTO para alistamento");
			System.out.println("Nome: " + nome + " |" + genero + " |" + idade + " anos");
			apto++;
		}
		System.out.println();
		System.out.print("Deseja continuar???: ");
		char continuar = sc.next().charAt(0);

		while (continuar == 's' || continuar == 'S') {
			System.out.println();
			System.out.println("***Triagem Alistamento Militar***");
			System.out.println();
			System.out.print("Informe o nome completo do alista: ");
			nome = sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Informe o genêro do alista(F)ou(M): ");
			genero = sc.next().charAt(0);
			System.out.print("Informe a idade do alista: ");
			idade = sc.nextInt();
			System.out.println("Possui comorbidades crônicas?");
			System.out.print("RESPIRATÓRIA, CARDIÁCA, RENAL, HEPÁTICA | (S)SIM ou (N)NÃO?: ");
			resposta = sc.next().charAt(0);

			if (resposta == 's' || resposta == 'S') {
				System.out.println("Nome: " + nome + " |" + genero + " |" + idade + " anos");
				System.out.println("NÃO APTO para alistamento");
				naoApto++;
				}
				else {
					System.out.println("APTO para alistamento");
					System.out.println("Nome: " + nome + " |" + genero + " |" + idade+ " anos");
					apto++;
				}
				
				System.out.println();
				System.out.print("Deseja continuar???: ");
				continuar = sc.next().charAt(0);

				if (continuar == 'n' || continuar == 'N') {
					System.out.println("***Lista de candidatos***");
					System.out.println("TOTAL NÃO APTOS: " + naoApto);
					System.out.println("TOTAL APTOS:" + apto);
				}

			}
		

		sc.close();

	}
}

/*
 CONSOLE:
 ***Triagem Alistamento Militar***

Informe o nome completo do alista: Julliane Marie
Informe o genêro do alista(F)ou(M): f
Informe a idade do alista: 40
Possui comorbidades crônicas?
RESPIRATÓRIA, CARDIÁCA, RENAL, HEPÁTICA / (S)SIM-(N)NÃO?: s
NÃO APTO para alistamento
Nome: Julliane Marie |f |40 anos

Deseja continuar???: s

***Triagem Alistamento Militar***

Informe o nome completo do alista: Angelo Franzon
Informe o genêro do alista(F)ou(M): m
Informe a idade do alista: 49
Possui comorbidades crônicas?
RESPIRATÓRIA, CARDIÁCA, RENAL, HEPÁTICA | (S)SIM ou (N)NÃO?: s
Nome: Angelo Franzon |m |49 anos
NÃO APTO para alistamento

Deseja continuar???: s

***Triagem Alistamento Militar***

Informe o nome completo do alista: Theodoro Fonseca
Informe o genêro do alista(F)ou(M): m
Informe a idade do alista: 18
Possui comorbidades crônicas?
RESPIRATÓRIA, CARDIÁCA, RENAL, HEPÁTICA | (S)SIM ou (N)NÃO?: n
APTO para alistamento
Nome: Theodoro Fonseca |m |18 anos

Deseja continuar???: n
***Lista de candidatos***
TOTAL NÃO APTOS: 2
TOTAL APTOS:1
 */