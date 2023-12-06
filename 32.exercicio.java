package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 * 32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
		 * Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isósceles ou escaleno. 
		 * Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
			a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
			b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
			c. Triângulo equilátero é também isósceles;
			d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
		 */

		int ladoA, ladoB, ladoC = 0;
		
		for (int i = 0; i < 3; i++ ) {
		System.err.print("Digite lado A: ");
		ladoA = sc.nextInt();
		System.err.print("Digite lado B: ");
		ladoB = sc.nextInt();
		System.err.print("Digite lado C: ");
		ladoC = sc.nextInt();
		
		
		if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println("Triangulo Equilátero");
		}
		else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
			System.out.println("Triangulo Isóceles");
		}
		else if (ladoA != ladoB && ladoB != ladoC) {
			System.out.println("Triangulo Escaleno");
		}
		
		}
		
		

		sc.close();

	}
}

/*
Console:
Digite lado A: 6
Digite lado B: 6
Digite lado C: 6
Triangulo Equilátero
Digite lado A: 12
Digite lado B: 6
Digite lado C: 6
Triangulo Isóceles
Digite lado A: 12
Digite lado B: 6
Digite lado C: 9
Triangulo Escaleno
 */