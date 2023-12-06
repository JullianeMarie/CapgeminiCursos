import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
	System.out.println("8- Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$)"); 
        System.out.println("De um valor lido em dólar (US$)"); 
        System.out.println("O algoritmo deverá solicitar o valor da cotação do dólar"); 
        System.out.println("E também a quantidade de dólares disponíveis com o usuário.");
        
        System.out.println("Digite a taxa de cambio do dolar: US$:");
        double taxaCambio = sc.nextDouble();
        System.out.println("Digite o valor de dinheito em dolar: US$:");
        double dolar = sc.nextDouble();
        
        double real = dolar * taxaCambio;
        
        System.out.printf("Valor em Real Brasileiro R$: %.2f", real);
	   

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
8- Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$)
De um valor lido em dólar (US$)
O algoritmo deverá solicitar o valor da cotação do dólar
E também a quantidade de dólares disponíveis com o usuário.
Digite a taxa de cambio do dolar: US$:
4.90
Digite o valor de dinheito em dolar: US$:
350.00
Valor em Real Brasileiro R$: 1715.00


 



