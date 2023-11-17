import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - Faça um algoritmo que receba dois números e exiba o resultado da sua soma");
		int n1, n2, total;
		System.out.print("Digite numero 1: ");
		n1 = sc.nextInt();
		System.out.print("Digite numero 2: ");
		n2 = sc.nextInt();
		total= n1 +n2;
		System.out.println("O valor da soma é: " + total);

		sc.close();
		}

	}

___________________________________________________________________________________________________________________
CONSOLE
1 - Faça um algoritmo que receba dois números e exiba o resultado da sua soma
Digite numero 1: 10
Digite numero 2: 35
O valor da soma é: 45
