package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);
		
		/*
		  16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. 
		  Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7). 
		  Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
		*/
		
		System.out.print("Informe o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		System.out.print("Informe a nota Prova 1: ");
		double prova1 = sc.nextDouble();
		System.out.print("Informe a nota Prova 2: ");
		double prova2 = sc.nextDouble();
		System.out.print("Informe a nota Prova 3: ");
		double prova3 = sc.nextDouble();
		
		double mediaAluno = (prova1 + prova2 + prova3) / 3;
		
		System.out.println("Média semestral do aluno: " + nomeAluno);
		System.out.printf("Média semestral: %.2f%n", mediaAluno );
		
		if (mediaAluno >= 7) {
			System.out.println("APROVADO");
		}
		else if (mediaAluno >= 5.1 && mediaAluno <= 6.9) {
			System.out.println("RECUPERAÇÃO");
		}
		else {
			System.out.println("REPROVADO");
		}
		
			 
	sc.close();
	
	
	
		}
	}
/*
CONSOLE:
Informe o nome do aluno: Theodoro Fonseca
Informe a nota Prova 1: 5.5
Informe a nota Prova 2: 6.5
Informe a nota Prova 3: 4.5
Média semestral do aluno: Theodoro Fonseca
Média semestral: 5.50
RECUPERAÇÃO
*/