package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);
		
		/*
		  17. Leia 5 números. 
		  E ao final informar quantos números 
		  estão no intervalo entre 10 (inclusive) e 150 (inclusive);
		*/
		
		System.out.println("Digite 5 números aleatórios:");
		
		for ( int i = 1; i <= 5; i++) {
			int numero = sc.nextInt();
		
			if (numero >= 10 && numero <= 150) {
				System.out.println("DENTRO INTERVALO");
			}
			else {
				System.out.println("FORA INTERVALO");
			}
		}
		
			 
	sc.close();
	
	
	
		}
	}

/*
CONSOLE:
Digite 5 números aleatórios:
149
DENTRO INTERVALO
151
FORA INTERVALO
150
DENTRO INTERVALO
8
FORA INTERVALO
10
DENTRO INTERVALO
*/