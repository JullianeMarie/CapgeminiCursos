package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 9. Escreva uma classe em que cada objeto representa um Voo que acontece 
		 em determinada data e em determinado horário. 
		 Cada vôo possui no máximo 100 passageiros, e a classe permite controlar 
		 a ocupação das vagas. 
		 
		 A classe deve ter os seguintes métodos:
		 a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data 
		(para armazenar a data utilize um objeto da classe Data, criada na questão anterior);

		b. ProximoLivre: retorna o número da próxima cadeira livre

		c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada

		d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, 
		e retorna verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) 
		e falso caso contrário

		e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo

		f. GetVoo: retorna o número do vôo
		 */

		Data dataVoo = new Data(4, 3, 2024);
		Voos voo = new Voos(123, dataVoo);

		System.out.println("Próxima cadeira livre: " + voo.proximoLivre());
		System.out.println("Verifica cadeira 5: " + voo.verifica(5));
		System.out.println("Ocupa cadeira 5: " + voo.ocupa(5));
		System.out.println("Vagas disponíveis: " + voo.vagas());
		System.out.println("Número voo: " + voo.getNumeroVoo());
		System.out.println();
		
		System.out.println("Próxima cadeira livre: " + voo.proximoLivre());
		System.out.println("Verifica cadeira 10: " + voo.verifica(10));
		System.out.println("Ocupa cadeira 10: " + voo.ocupa(10));
		System.out.println("Vagas disponíveis: " + voo.vagas());
		System.out.println("Número voo: " + voo.getNumeroVoo());
		System.out.println();
		
		System.out.println("Próxima cadeira livre: " + voo.proximoLivre());
		System.out.println("Verifica cadeira 1: " + voo.verifica(1));
		System.out.println("Ocupa cadeira 1: " + voo.ocupa(1));
		System.out.println("Vagas disponíveis: " + voo.vagas());
		System.out.println("Número voo: " + voo.getNumeroVoo());
		System.out.println();
		
		System.out.println("Próxima cadeira livre: " + voo.proximoLivre());
		System.out.println("Verifica cadeira 2: " + voo.verifica(2));
		System.out.println("Ocupa cadeira 2: " + voo.ocupa(2));
		System.out.println("Vagas disponíveis: " + voo.vagas());
		System.out.println("Número voo: " + voo.getNumeroVoo());
		System.out.println(                                                                                   );
		
		
		
		sc.close();

	}
}

__________________________________________________________________________________________________

package capgeminiProjeto;

public class Voos {
	private int numeroVoo;
    private Data data;
    private boolean[] ocupacao;
    private static final int NUMERO_MAX_CADEIRAS = 100;

    public Voos(int numeroVoo, Data data) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.ocupacao = new boolean[NUMERO_MAX_CADEIRAS];
    }

    public int proximoLivre() {
        for (int i = 0; i < NUMERO_MAX_CADEIRAS; i++) {
            if (!ocupacao[i]) {
                return i + 1; 
            }
        }
        return -1;
    }

    public boolean verifica(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > NUMERO_MAX_CADEIRAS) {
            return false; 
        }
        return ocupacao[numeroCadeira - 1];
    }

    public boolean ocupa(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > NUMERO_MAX_CADEIRAS) {
            return false; 
        }

        if (!ocupacao[numeroCadeira - 1]) { 
            ocupacao[numeroCadeira - 1] = true;
            return true; 
        } else {
            return false;
        }
    }

    public int vagas() {
        int count = 0;
        for (boolean ocupada : ocupacao) {  
            if (!ocupada) {
                count++;
            }
        }
        return count;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

}




/*
Próxima cadeira livre: 1
Verifica cadeira 5: false
Ocupa cadeira 5: true
Vagas disponíveis: 99
Número voo: 123

Próxima cadeira livre: 1
Verifica cadeira 10: false
Ocupa cadeira 10: true
Vagas disponíveis: 98
Número voo: 123

Próxima cadeira livre: 1
Verifica cadeira 1: false
Ocupa cadeira 1: true
Vagas disponíveis: 97
Número voo: 123

Próxima cadeira livre: 2
Verifica cadeira 2: false
Ocupa cadeira 2: true
Vagas disponíveis: 96
Número voo: 123
 */