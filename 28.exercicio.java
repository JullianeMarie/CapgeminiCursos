package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 28.Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 6 funcionários
		    de acordo com os seguintes critérios:
		a. 50% para aqueles que ganham menos do que três salários mínimos;
		b. 20% para aqueles que ganham entre três até dez salários mínimos;
		c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
		d. 10% para os demais funcionários.
		Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
		Calcule o seu novo salário reajustado. Escrever o nome do funcionário, 
		o reajuste e seu novo salário. 
		Calcule quanto à empresa vai aumentar sua folha de pagamento;
		*/


		double salarioMin = 1320.00;
		String nome;
		
		
		for (int i = 1; i < 10; i++) {
			System.out.print("Digite o nome do funcionário: ");
			nome = sc.nextLine();
			System.out.printf("Digite o salário atual do funcionário: ");
			double salarioAtual = sc.nextDouble();
			sc.nextLine();
			
			if (salarioAtual < 3 * salarioMin) {
				double salarioAjuste = salarioAtual * 0.50;
				double salarioTotal = salarioAjuste + salarioAtual;
				System.out.println("Funcionario:" + nome +"| Salario Atual: R$ " + String.format("%.2f", salarioAtual));
				System.out.println("Ajuste para 50%: R$ " + String.format("%.2f", salarioAjuste));
				System.out.printf("Valor total ajuste folha pagamento: R$ %.2f%n", salarioTotal);
			}
			else if (salarioAtual >= 3 * salarioMin && salarioAtual < 10 * salarioMin) {
				double salarioAjuste = salarioAtual * 0.20;
				double salarioTotal = salarioAjuste + salarioAtual;
				System.out.println("Funcionario:" + nome + "| Salario Atual: R$ " + String.format("%.2f", salarioAtual));
				System.out.println("Ajuste para 20%: R$ " + String.format("%.2f", salarioAjuste));
				System.out.printf("Valor total com ajuste - folha pagamento: R$ %.2f%n", salarioTotal);	
			}
			else if (salarioAtual >= 11 * salarioMin && salarioAtual < 20 * salarioMin) {
				double salarioAjuste = salarioAtual * 0.15;
				double salarioTotal = salarioAjuste + salarioAtual;
				System.out.println("Funcionario:" + nome +"| Salario Atual: R$ " + String.format("%.2f", salarioAtual));
				System.out.println("Ajuste para 15%: R$ " + String.format("%.2f", salarioAjuste));
				System.out.printf("Valor total com ajuste - folha pagamento: R$ %.2f%n", salarioTotal);	
			}
			else {
				double salarioAjuste = salarioAtual * 0.10;
				double salarioTotal = salarioAjuste + salarioAtual;
				System.out.println("Funcionario:" + nome +"| Salario Atual: R$ " + String.format("%.2f", salarioAtual));
				System.out.println("Ajuste para 10%: R$ " + String.format("%.2f", salarioAjuste));
				System.out.printf("Valor total com ajuste - folha pagamento: R$ %.2f%n", salarioTotal);	
			}
			
			System.out.println();
			
		}
								 	
		
		sc.close();

	}
}

/*
Digite o nome do funcionário: Julliane Marie
Digite o salário atual do funcionário: 3000.00
Funcionario:Julliane Marie| Salario Atual: R$ 3000.00
Ajuste para 50%: R$ 1500.00
Valor total ajuste folha pagamento: R$ 4500.00

Digite o nome do funcionário: Angelo Franzon
Digite o salário atual do funcionário: 10000.00
Funcionario:Angelo Franzon| Salario Atual: R$ 10000.00
Ajuste para 20%: R$ 2000.00
Valor total com ajuste - folha pagamento: R$ 12000.00

Digite o nome do funcionário: Pitanga Maria
Digite o salário atual do funcionário: 24000.00
Funcionario:Pitanga Maria| Salario Atual: R$ 24000.00
Ajuste para 15%: R$ 3600.00
Valor total com ajuste - folha pagamento: R$ 27600.00

Digite o nome do funcionário: Theodoro Fonseca
Digite o salário atual do funcionário: 30000.00
Funcionario:Theodoro Fonseca| Salario Atual: R$ 30000.00
Ajuste para 10%: R$ 3000.00
Valor total com ajuste - folha pagamento: R$ 33000.00

Digite o nome do funcionário: Orion Onion
Digite o salário atual do funcionário: 2500.00
Funcionario:Orion Onion| Salario Atual: R$ 2500.00
Ajuste para 50%: R$ 1250.00
Valor total ajuste folha pagamento: R$ 3750.00

Digite o nome do funcionário: Bianca Maria
Digite o salário atual do funcionário: 6000.00
Funcionario:Bianca Maria| Salario Atual: R$ 6000.00
Ajuste para 20%: R$ 1200.00
Valor total com ajuste - folha pagamento: R$ 7200.00
 */