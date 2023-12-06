package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);
		
		
		/*14. Escreva um algoritmo que leia dois valores inteiro distintos 
		  e informe qual é o maior;
		  */
		
		System.out.print("Digite número: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite número: ");
		int numero2 = sc.nextInt();
		if (numero1 > numero2 ) {
			System.out.println("Número 1 MAIOR que Número 2 ");
		}
		else {
			System.out.println("Número 2 MAIOR que Número 1");
		}
			 
	sc.close();
	
	
	
		}
	}
/*
CONSOLE
Digite número: 24
Digite número: 65
Número 2 MAIOR que Número 1
*/