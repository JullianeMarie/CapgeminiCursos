package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);
		
		/*
		19.Escreva um algoritmo que leia o nome e o sexo de 5 pessoas 
		E informe o nome e se ela é homem ou mulher. 
		No final informe total de homens e de mulheres;
		*/
		
		int feminino = 0, masculino = 0;
		for (int i = 0; i < 6; i++) {
			System.out.print("Informe o nome da pessoa: " );
			String nome = sc.next();
			System.out.print("Informe o genêro: (F) / (M): ");
			char genero = sc.next().charAt(0);
			System.out.println("Nome: " + nome + "|" + "Genero: " + genero);
			
			if ( genero == 'f' || genero == 'F') {
				feminino++;
			}
			else 
				if (genero == 'm' || genero == 'M' ) {
					masculino++;
				}
		System.out.println();	
		}	
		System.out.println("Total cadastros femininos: " + feminino++);	 
		System.out.println("Total cadastros masculinos " + masculino++);
		
		
	sc.close();
	
	
		}
	}

/*
CONSOLE:
IInforme o nome da pessoa: Maria
Informe o genêro: (F) / (M): f
Nome: Maria|Genero: f

Informe o nome da pessoa: Beatriz
Informe o genêro: (F) / (M): f
Nome: Beatriz|Genero: f

Informe o nome da pessoa: Angelo
Informe o genêro: (F) / (M): m
Nome: Angelo|Genero: m

Informe o nome da pessoa: Theodoro
Informe o genêro: (F) / (M): m
Nome: Theodoro|Genero: m

Informe o nome da pessoa: Pitanga
Informe o genêro: (F) / (M): f
Nome: Pitanga|Genero: f

Informe o nome da pessoa: Orion
Informe o genêro: (F) / (M): m
Nome: Orion|Genero: m

Total cadastros femininos: 3
Total cadastros masculinos 3
*/