package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		  26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
		  Caso o usuário digite um número que não esteja neste intervalo. 
		  Exibir a seguinte mensagem: número inválido;
		 */

		int numero;
		
		for ( int i =0; i < 3; i++) {
			System.out.println("Digite número:");
			numero = sc.nextInt();
			if ( numero <= 5) {
			System.out.println("DENTRO DO INTERVALO");
		}
			else {
				System.out.println("NÚMERO INVALIDO");
			}
		}
				
			
		sc.close();

	}
}

/*
Digite número:
5
DENTRO DO INTERVALO
Digite número:
6
NÚMERO INVALIDO
Digite número:
1
DENTRO DO INTERVALO

 */