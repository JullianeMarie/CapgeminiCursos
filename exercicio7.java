import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
	    System.out.println("7- Leia uma temperatura em graus Celsius");
	    System.out.println("E apresentá-la convertida em graus Fahrenheit");
	    System.out.println("A fórmula de conversão é:F=(9*C+160) / 5");
	    System.out.println("Sendo F a temperatura em Fahrenheit e C a temperatura em Celsius");
	        
	    double cº;
	    double fahrenheit;
	        
	    System.out.println("Digite temperatura em Celsius:");
	    cº = sc.nextDouble();
	    fahrenheit = (9*cº+160)/5;
	    System.out.println("Tempatura em Fahrenheit:" + fahrenheit);

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
7- Leia uma temperatura em graus Celsius
E apresentá-la convertida em graus Fahrenheit
A fórmula de conversão é:F=(9*C+160) / 5
Sendo F a temperatura em Fahrenheit e C a temperatura em Celsius
Digite temperatura em Celsius:
42.5
Tempatura em Fahrenheit:108.5


 



