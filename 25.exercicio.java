package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		  25.Faça um algoritmo que leia dois números e identifique se são iguais ou
		  diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são
		  iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem
		  que são diferentes;
		 */

		
		int numero1, numero2;
		
		for (int i =0; i < 3; i++) {
		System.out.println("Digite dois números inteiros:");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();

		if (numero1 == numero2) {
			System.out.println("Números iguais");
		} else if (numero1 != numero2) {
			if (numero1 > numero2) {
				System.out.println("Número 1 é maior que Número 2");
			} else {
				System.out.println("Numero 2 é maior que Número 1");
			}
			System.out.println("Números diferentes");
			}
		}
		sc.close();

	}
}

/*
Digite dois números inteiros:
32
32
Números iguais
Digite dois números inteiros:
23
32
Numero 2 é maior que Número 1
Números diferentes
Digite dois números inteiros:
32
23
Número 1 é maior que Número 2
Números diferentes 
 */