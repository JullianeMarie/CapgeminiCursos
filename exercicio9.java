import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
		System.out.println("9- Faça um algoritmo que receba um valor que foi depositado"); 
		System.out.println("E exiba o valor com rendimento após um mês.");
		System.out.println("Considere fixo o juro da poupança em 0,07% a. m.");
		
		System.out.print("Digite o valor do deposito:");
		double depositopp = sc.nextDouble();
		 
		double valorrd = (depositopp * 0.07) /100;
		double valortt = depositopp + valorrd;
		System.out.printf("O valor de rendimento mensal é de R$: %.2f%n", valorrd);
		System.out.printf("Saldo Poupança:R$ %.2f", valortt);
	   

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
9- Faça um algoritmo que receba um valor que foi depositado
E exiba o valor com rendimento após um mês.
Considere fixo o juro da poupança em 0,07% a. m.
Digite o valor do deposito:5500.
O valor de rendimento mensal é de R$: 3.85
Saldo Poupança:R$ 5503.85



 



