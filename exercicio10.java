import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
		System.out.println("10- A Loja Mamão com Açúcar está vendendo seus produtos");
		System.out.println("Em 5(cinco)prestações sem juros.");
      	        System.out.println("Faça um algoritmo que receba um valor de uma compra.");
		System.out.println("E mostre o valor das prestações.");
		
		System.out.println("Digite o valor do produto:");
		double produtoLM = sc.nextDouble();
		System.out.println("Deseja parcelar? S/N");
		char desejaparcelar = 's';
		desejaparcelar = sc.next().charAt(0);
		
		
		if (desejaparcelar == 's' || desejaparcelar == 'S') {
		
			double prestacoes = produtoLM/5; 
		System.out.println("Valor da parcela: R$" + prestacoes + "  5x sem juros.");
		}
		
		else {
			System.out.println("Valor da compra: R$" + produtoLM);
		}
	   

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
10- A Loja Mamão com Açúcar está vendendo seus produtos
Em 5(cinco)prestações sem juros.
Faça um algoritmo que receba um valor de uma compra.
E mostre o valor das prestações.
Digite o valor do produto:
6000.00
Deseja parcelar? S/N
S
Valor da parcela: R$1200.0  5x sem juros.



 



