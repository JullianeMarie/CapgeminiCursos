package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 * 34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em
		 * uma das seguintes categorias: a. Infantil A = 5 - 7 anos; b. Infantil B = 8 -
		 * 10 anos; c. Juvenil A = 11- 13 anos; d. Juvenil B = 14 - 17 anos; e. Sênior =
		 * 18 - 25 anos. Apresentar mensagem “idade fora da faixa etária” quando for
		 * outro ano não contemplado;
		 */

		

			for (int i = 0; i < 7; i++) {
			
			System.out.print("Digite a idade do nadador: ");
			int idade = sc.nextInt();
			
			if (idade >= 5 && idade <= 7) {
				System.out.println("CLASSIFICAÇÃO: INFANTIL A");
			} else 
				if (idade >= 8 && idade <= 10) {
				System.out.println("CLASSIFICAÇÃO: INFANTIL B");
			} else 
				if (idade >= 11 && idade <= 13) {
				System.out.println("CLASSIFICAÇÃO: JUVENIL A");
			} else 
				if (idade >= 14 && idade <= 17) {
				System.out.println("CLASSIFICAÇÃO: JUVENIL B");
			} else 
				if (idade >= 18 && idade <= 25) {
				System.out.println("CLASSIFICAÇÃO: SÊNIOR");
			} else 
				if (idade <= 4 || idade >= 26) {
				System.out.println("CLASSIFICAÇÃO: IDADE FORA DA FAIXA");
			}
		}
		
		sc.close();

	}

}

/*
Digite a idade do nadador: 6
CLASSIFICAÇÃO: INFANTIL A
Digite a idade do nadador: 9
CLASSIFICAÇÃO: INFANTIL B
Digite a idade do nadador: 12
CLASSIFICAÇÃO: JUVENIL A
Digite a idade do nadador: 16
CLASSIFICAÇÃO: JUVENIL B
Digite a idade do nadador: 24
CLASSIFICAÇÃO: SÊNIOR
Digite a idade do nadador: 3
CLASSIFICAÇÃO: IDADE FORA DA FAIXA
Digite a idade do nadador: 28
CLASSIFICAÇÃO: IDADE FORA DA FAIXA
 */