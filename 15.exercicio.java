import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
		System.out.println("15- Faça um algoritmo que receba um número ");
		System.out.println("E diga se este número está no intervalo entre 100 e 200");
		
		
		System.out.print("Digite o número:");
		int n5 = sc.nextInt();
		
		if (n5 >= 100){
			System.out.println("*DENTRO DO INTERVALO*");			
		}
		else if (n5 <= 200) {
				System.out.println("*DENTRO DO INTERVALO*");	
				}
			else {
				System.out.println("*FORA DO INTERVALO*");
			}
		
		System.out.println("Exercício com Operador Lógico: ");
		
		System.out.print("Digite o número:");
		int n6 = sc.nextInt();
		
		if (n6 <= 200 && n6 >= 100) {
			System.out.println("*DENTRO DO INTERVALO*");
		}
		else {
			System.out.println("*FORA INTERVALO*");
		}
	   

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
15- Faça um algoritmo que receba um número 
E diga se este número está no intervalo entre 100 e 200
Digite o número:120
*DENTRO DO INTERVALO*
Exercício com Operador Lógico: 
Digite o número:201
*FORA INTERVALO*



 



