package capgeminiProjeto;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		if (dataEhValida(dia, mes, ano)) {

			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			System.out.println("Data inválida - 01/01/0001");
			this.dia = 1;
			this.mes = 1;
			this.ano = 1;
		}
	}

	public boolean dataEhValida(int dia, int mes, int ano) {
		if (ano < 1 || mes < 1 || mes > 12) {
			return false;
		}

		int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			diasPorMes[2] = 29;
		}

		return dia >= 1 && dia <= diasPorMes[mes];
	}

	public int comparar(Data outraData) {
		if (this.dia == outraData.dia && this.mes == outraData.mes && this.ano == outraData.ano) {
			return 0;
		} else if (this.ano > outraData.ano || (this.ano == outraData.ano && this.mes > outraData.mes)
				|| (this.ano == outraData.ano && this.mes == outraData.mes && this.dia > outraData.dia)) {
			return 1;

		} else {
			return -1;
		}
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}
	
	public String mesExtenso() { //array strings. 
		String[] mesesExtenso = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };
		return mesesExtenso[this.mes - 1]; //indices array começam em 0.

	}

	public int getAno() {
		return ano;
	}
	
	public boolean anoBissexto() {
		return (this.ano % 4 == 0 && (this.ano % 100 != 0 || this.ano % 400 == 0));
	}

	public Data clone() {
		return new Data (this.dia, this.mes, this.ano);
	}
	
	@Override
	public String toString() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}
}

____________________________________________________________________________________________

package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		 
		/*   
		 8. Escreva uma classe Data cuja instância (objeto) represente uma data. 
			Esta classe deverá dispor dos seguintes métodos:

			a. Construtor: define a data que determinado objeto (através de parâmetro), 
			este método verifica se a data está correta, 
			caso não esteja a data é configurada como 01/01/0001
			b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e retorne:
			i. 0 se as datas forem iguais;
			ii. 1 se a data corrente for maior que a do parâmetro;
			iii. -1 se a data do parâmetro for maior que a corrente.
			c. GetDia: retorna o dia da data
			d. GetMes: retorna o mês da data
			e. GetMesExtenso: retorna o mês da data corrente por extenso
			f. GetAno: retorna o ano da data
			g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
			h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data 
			com os mesmos valores de atributos e retorna sua referência pelo método
		  */
		
		
		Data data1 = new Data(29, 02, 2024);
		Data data2 = new Data(30, 02, 2024);
		
		System.out.println("Data 1: " + data1.toString());
		
		System.out.println("Data 2: " + data2.toString());
		
		
		System.out.println("Comparação: " + data1.comparar(data2));
		System.out.println("Dia: " + data1.getDia());
		System.out.println("Mes: " + data1.getMes());
		System.out.println("Mês extenso: " + data1.mesExtenso());
		System.out.println("Ano: " + data1.getAno());
		System.out.println("É Bissexto? " + data1.anoBissexto());
		
		Data clone = data1.clone();
		System.out.println("Clone: " + clone.toString());
		
		
	sc.close();
	
	}
}

/*

Data inválida - 01/01/0001
Data 1: 29/02/2024
Data 2: 01/01/0001
Comparação: 1
Dia: 29
Mes: 2
Mês extenso: Fevereiro
Ano: 2024
É Bissexto? true
Clone: 29/02/2024

 */



















