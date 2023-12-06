import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
	System.out.println("6- Leia dois valores para as variáveis A e B");
	System.out.println("Efetuar as trocas dos valores de forma que a variável A");
	System.out.println("Passe a possuir o valor da variável B");
	System.out.println("E a variável B passe a possuir o valor da variável A");
	System.out.println("Apresentar os valores trocados;");
        
  	int A, B, Atroca, Btroca;
  	System.out.print("Digite valor de A: ");
  	A= sc.nextInt();
  	System.out.print("Digite valor de B: ");
  	B= sc.nextInt();
        
  	Atroca = B;
  	Btroca = A;
  	System.out.println("Valor de A: " + Atroca);
  	System.out.println("Valor de B: " + Btroca); 

		sc.close();

	}

}
___________________________________________________________________________________________________________
CONSOLE
6- Leia dois valores para as variáveis A e B
Efetuar as trocas dos valores de forma que a variável A
Passe a possuir o valor da variável B
E a variável B passe a possuir o valor da variável A
Apresentar os valores trocados;
Digite valor de A: 32
Digite valor de B: 63
Valor de A: 63
Valor de B: 32


 



