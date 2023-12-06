package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);
		
		
		/*13 - Faça um algoritmo que receba um número 
		 * E mostre uma mensagem caso este número seja maior que 10*/
		
		System.out.print("Digite número: ");
		int numero = sc.nextInt();
		if (numero > 10 ) {
			System.out.println("Número MAIOR que 10");
		}
		
	sc.close();
	
	
	
		}
	}

/*
CONSOLE
Digite número: 12
Número MAIOR que 10
*/