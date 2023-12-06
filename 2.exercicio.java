import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2- Faça um algoritmo que receba dois números e ao final mostre a:"); 
		System.out.println("Soma, Subtração, Multiplicação, Divisão dos dois números lidos");		
				
		int n3, n4, soma, subtracao, divisao, multiplicacao;
		System.out.print("Digite numero 3: ");
		n3 = sc.nextInt();
		System.out.print("Digite numero 4: ");
		n4 = sc.nextInt();	
		
		soma = n3 + n4;
		System.out.println("A soma dos números é: " + soma);
		subtracao = n3 - n4;
		System.out.println("A subtração dos números é: " + subtracao);
		divisao = n3/n4;
		System.out.println("A divisão dos números é: " + divisao);
		multiplicacao = n3*n4;
		System.out.println("A multiplicação dos números é: " + multiplicacao);

	sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
2- Faça um algoritmo que receba dois números e ao final mostre a:
Soma, Subtração, Multiplicação, Divisão dos dois números lidos
Digite numero 3: 32
Digite numero 4: 23
A soma dos números é: 55
A subtração dos números é: 9
A divisão dos números é: 1
A multiplicação dos números é: 736


