import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
								
		System.out.println("22- . Faça um algoritmo que receba o preço de custo e venda de 3 produtos. ");	
		System.out.println("Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. ");
		System.out.println("Informe o valor de custo de cada produto e valor de venda de cada produto.");
		System.out.println ("E a média de preço de custo e do preço de venda.");
			
		String nomeproduto = null;
	 	float custo = 0, venda = 0, mediacusto = 0, mediavenda = 0;
		int i = 0;

		for (i = 0; i < 3; i++) {
		System.out.print("Cadastre o produto: ");
		nomeproduto = sc.next();
		System.out.print("Cadastre o preço de custo: R$ ");
		custo = sc.nextFloat();
		System.out.print("Cadastre o preço de venda: R$ ");
		venda = sc.nextFloat();

		mediacusto += custo;
		mediavenda += venda;

		if (custo < venda) {
		System.out.println("LUCRO");
		} else 
			if (custo > venda) {
		System.out.println("PREJUIZO");
		} 
			else {
			System.out.println("BREAK EVEN");
		}
		System.out.print(nomeproduto + " Preço custo = " + custo + "/ Preço venda = " + venda);

		System.out.println("");
		}

		System.out.println("");
		System.out.printf("Média venda: %.2f%n ", (mediavenda / i));
		System.out.printf("Média custo: %.2f%n ", (mediacusto / i));
	   

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
22- . Faça um algoritmo que receba o preço de custo e venda de 3 produtos. 
Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
Informe o valor de custo de cada produto e valor de venda de cada produto.
E a média de preço de custo e do preço de venda.
Cadastre o produto: Banana
Cadastre o preço de custo: R$ 5.65
Cadastre o preço de venda: R$ 4.56
PREJUIZO
Banana Preço custo = 5.65/ Preço venda = 4.56
Cadastre o produto: Mamão
Cadastre o preço de custo: R$ 7.50
Cadastre o preço de venda: R$ 8.99
LUCRO
Mamão Preço custo = 7.5/ Preço venda = 8.99
Cadastre o produto: Limão
Cadastre o preço de custo: R$ 5.95
Cadastre o preço de venda: R$ 7.00
LUCRO
Limão Preço custo = 5.95/ Preço venda = 7.0

Média venda: 6.85
Média custo: 6.37
 



 



