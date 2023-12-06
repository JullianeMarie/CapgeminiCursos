package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);
		
		/*
		18.Faça um algoritmo que receba a idade de 5 pessoas e mostre mensagem informando 
		“maior de idade” e “menor de idade” para cada pessoa. 
		 Considere a idade a partir de 18 anos como maior de idade;
		*/
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe a idade da pessoa: ");
			int pessoa = sc.nextInt(); 
			if (pessoa < 18) {
				System.out.println("MENOR DE IDADE");
			}
			else {
				System.out.println("MAIOR IDADE");
			}
		
		}	
			 
	sc.close();
	
	
	
		}
	}

/*
CONSOLE:
Informe a idade da pessoa: 
12
MENOR DE IDADE
Informe a idade da pessoa: 
32
MAIOR IDADE
Informe a idade da pessoa: 
8
MENOR DE IDADE
Informe a idade da pessoa: 
40
MAIOR IDADE
Informe a idade da pessoa: 
22
MAIOR IDADE
*/