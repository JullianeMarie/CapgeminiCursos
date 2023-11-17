import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3- Escreva um algoritmo para determinar o consumo médio de um automóvel ");
		System.out.println("- Sendo fornecida a distância");
		System.out.println("- Total percorrida pelo automóvel");
		System.out.println("- Total de combustível gasto");
		
		System.out.print("Digite a distância percorrida: ");
		double distancia = sc.nextDouble();
		System.out.print("Digite a kilometragem por litro: ");
		double km = sc.nextDouble();
		double litro = 1;
		double consumo = litro*distancia/km;
       	        System.out.printf("O total de gasto do combustível é de: %.2f%n ", consumo);

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
3- Escreva um algoritmo para determinar o consumo médio de um automóvel 
- Sendo fornecida a distância
- Total percorrida pelo automóvel
- Total de combustível gasto
Digite a distância percorrida: 150
Digite a kilometragem por litro: 15
O total de gasto do combustível é de: 10.00
 



