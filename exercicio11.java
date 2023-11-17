import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
		System.out.println("11- Faça um algoritmo que receba o preço de custo de um produto"); 
		System.out.println("E mostre o valor de venda."); 
		System.out.println("Sabe-se que o preço de custo receberá um acréscimo"); 
		System.out.println("De acordo com um percentual informado pelo usuário");

		double produto11, custo11, venda11;
		System.out.print("Digite o custo do produto:");
		produto11 = sc.nextDouble();
		System.out.println("Qual a porcetagem de custo no produto?");
		custo11 = sc.nextDouble();
		venda11 = (produto11 * custo11)/100;
		venda11 += produto11;
		System.out.printf("Valor venda: R$ %.2f", venda11);
	   

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
11- Faça um algoritmo que receba o preço de custo de um produto
E mostre o valor de venda.
Sabe-se que o preço de custo receberá um acréscimo
De acordo com um percentual informado pelo usuário
Digite o custo do produto:325.60
Qual a porcetagem de custo no produto?
30
Valor venda: R$ 423.28



 



