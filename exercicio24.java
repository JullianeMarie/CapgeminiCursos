import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
								
	System.out.println("24- Faça um algoritmo que receba “N” números e mostre:"
				+ "positivo negativo ou zero para cada número");

		char desejacontinuar = 'S';

		while (desejacontinuar == 's' || desejacontinuar == 'S') {
			System.out.println("Digite um número");
			int n7 = sc.nextInt();

			if (n7 == 0) {
				System.out.println("Zero");
			} else if (n7 > 0) {
				System.out.println("Positivo");
			} else {
				System.out.println("Negativo");
			}
			System.out.println("Deseja continuar? S - sim / N - não");
			desejacontinuar = sc.next().charAt(0);
		}
	   

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
24- Faça um algoritmo que receba “N” números e mostre:positivo negativo ou zero para cada número
Digite um número
-99
Negativo
Deseja continuar? S - sim / N - não
s
Digite um número
10
Positivo
Deseja continuar? S - sim / N - não
n



 



