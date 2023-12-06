import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5- Escreva um algoritmo que leia o nome de um aluno"); 
		System.out.println("E as notas das três provas que ele obteve no semestre.");
		System.out.println("No final informar o nome do aluno e a sua média (aritmética)");
		
		String nomeAluno;
		double nota1, nota2, nota3, mediaAluno;
		
		System.out.println("Digite o nome do aluno: ");
		nomeAluno = sc.nextLine();
		System.out.println("Informe a nota prova 1: ");
		nota1 = sc.nextDouble();
		System.out.println("Informe a nota prova 2: ");
		nota2 = sc.nextDouble();
		System.out.println("Informe a nota prova 3: ");
		nota3 = sc.nextDouble();
		
		mediaAluno = (nota1 + nota2 + nota3)/ 3;
		System.out.printf(nomeAluno + " - Média do Semestre: %.2f", mediaAluno);

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
5- Escreva um algoritmo que leia o nome de um aluno
E as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua média (aritmética)
Digite o nome do aluno: 
Pitanga Maria
Informe a nota prova 1: 
8.5
Informe a nota prova 2: 
7.8
Informe a nota prova 3: 
9.0
Pitanga Maria - Média do Semestre: 8.43

 



