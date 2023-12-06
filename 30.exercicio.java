package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		30.Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
		 */

		int n1, n2, n3;
		System.out.println("Digite 3 números");
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.println(n1 + "|" +  n2 + "|" + n3);
		}
		else if (n1 > n2 && n1 > n3 && n3 > n2) {
			System.out.println(n1 + "|" +  n3 + "|" + n2);
		}
			else if (n2 > n1 && n2 > n3 && n1 > n3) {
			System.out.println(n2 + "|" +  n1 + "|" + n3);
			}
			else if (n2 > n1 && n2 > n3 && n3 > n1) {
				System.out.println(n2 + "|" +  n3 + "|" + n1);
		}
		else if (n3 > n1 && n3 > n2 && n1 > n2) {
			System.out.println(n3 + "|" +  n1 + "|" + n2);
		}
		else if (n3 > n1 && n3 > n2 && n2 > n1) {
			System.out.println(n3 + "|" +  n2 + "|" + n1);
		}
		
		sc.close();

	}
}

/*
Digite 3 números
121
901
452
901|452|121
 */