package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 * 23.Faça um algoritmo que receba um número e mostre uma mensagem caso este
		 * número seja maior que 80, menor que 25 ou igual a 40;
		 */
		
		for (int i = 0; i < 5; i++) {
		System.out.println("Digite o número: ");
		int numero = sc.nextInt();
			if (numero > 80) {
				System.out.println("Maior que 80");
			} else if (numero < 25) {
				System.out.println("Menor que 25");
			} else if (numero == 40) {
				System.out.println("Igual a 40");
			}
		}

		sc.close();

	}
}

/*
Digite o número: 
90
Maior que 80
Digite o número: 
24
Menor que 25
Digite o número: 
40
Igual a 40
Digite o número: 
30
Digite o número: 
12
Menor que 25

 */