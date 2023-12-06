package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 * 31.Dados três valores A, B e C, em que A e B são números reais e C é um
		 * caractere, pede-se para imprimir o resultado da operação de A por B se C for
		 * um símbolo de operador aritmético; caso contrário deve ser impressa uma
		 * mensagem de operador não definido. Tratar erro de divisão por zero;
		 */

		int A, B, resultado = 0;
		char C = 0;

		for (int i = 0; i < 6; i++) {

			System.out.print("Digite um número para A:");
			A = sc.nextInt();
			System.out.print("Digite um número para B:");
			B = sc.nextInt();
			System.out.print("Digite um caracter para C:");
			C = sc.next().charAt(0);

			while (C != '+' && C != '-' && C != '*' && C != '/') {
				System.out.println("Operador Não Definido");
				System.out.println("Digite novavente um valor para C (/,*,+,-)");
				C = sc.next().charAt(0);

			}

			// if (C == '+' || C == '-' || C == '*' || C == '/') {

			if (C == '+') {
				resultado = (A + B);
				System.out.println("A+B =" + resultado);
			}
			if (C == '-') {
				resultado = (A - B);
				System.out.println("A-B =" + resultado);
			}
			if (C == '*') {
				resultado = (A * B);
				System.out.println("A*B =" + resultado);
			}
			if (C == '/') {
				while (A == 0 || B == 0) {
					if (A == 0) {
						System.out.println("A precisa ser diferente de 0, digite novamente:");
						A = sc.nextInt();
					} else if (B == 0) {
						System.out.println("B precisa ser diferente de 0, digite novamente:");
						B = sc.nextInt();
					}
				}
				if (A != 0 || B != 0) {
					resultado = (A / B);
					System.out.print("A/B =" + resultado);
					System.out.println();
				}
			}

		}

		sc.close();

	}
}

/*
 Digite um número para A:0
Digite um número para B:20
Digite um caracter para C:/
A precisa ser diferente de 0, digite novamente:
20
A/B =1
Digite um número para A:20
Digite um número para B:
0
Digite um caracter para C:/
B precisa ser diferente de 0, digite novamente:
20
A/B =1
Digite um número para A:20
Digite um número para B:30
Digite um caracter para C:.
Operador Não Definido
Digite novavente um valor para C (/,*,+,-)
.
Operador Não Definido
Digite novavente um valor para C (/,*,+,-)
+
A+B =50
Digite um número para A:30
Digite um número para B:20
Digite um caracter para C:-
A-B =10
Digite um número para A:5
Digite um número para B:3
Digite um caracter para C:*
A*B =15
Digite um número para A:
 */
