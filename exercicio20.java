20 - A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. 
Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. 
O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. 
O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”
Informar total de carros com ano até 2000 e total geral;
______________________________________________________________________________________________________________

package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro();
		char continuar;
		
		System.out.println("Concessionária Carros Antigos");
		System.out.print("Digite o modelo do carro: ");
		carro.setModelo(sc.next());
		System.out.print("Digite o ano do carro: ");
		carro.setAno(sc.nextInt());
		System.out.print("Digite o valor de tabela do carro: ");
		carro.setValorTabela(sc.nextFloat());
		
		System.out.printf("Valor desconto: R$ %.2f%n", carro.calcularDesconto());
		System.out.printf("Valor total cliente: R$ %.2f%n", carro.calcularTotalVeiculo());
		
		System.out.println("Deseja continuar? S - sim / N - não");
		continuar = sc.next().charAt(0);
		
		while (continuar == 's' || continuar == 'S') {
			System.out.println("**Concessionária Carros Antigos**");
			System.out.print("Digite o modelo do carro: ");
			carro.setModelo(sc.next());
			System.out.print("Digite o ano do carro: ");
			carro.setAno(sc.nextInt());
			System.out.print("Digite o valor de tabela do carro: ");
			carro.setValorTabela(sc.nextFloat());
			
			System.out.printf("Valor desconto: R$ %.2f%n", carro.calcularDesconto());
			System.out.printf("Valor total cliente: R$ %.2f%n", carro.calcularTotalVeiculo());
			
			System.out.println("Deseja continuar? S - sim / N - não");	
			continuar  = sc.next().charAt(0);
		}
		
		if (continuar == 'n' || continuar == 'N') 
		System.out.println("** Operação Finalizada **");
		System.out.println("Total de veicúlos Clássicos: " + carro.carrosClassicos());
		System.out.println("Total de veicúlos: " + carro.carrosTotal());
			
		
		
		
	sc.close();
	
		}
	}
________________________________________________________________________________________________
package capgeminiProjeto;

public class Carro {
	
	private String modelo;
	private int ano;
	private float valorTabela;
	private float desconto;
	private float totalVeiculoValor;
	private int classicos;
	private int totalveiculos;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getValorTabela() {
		return valorTabela;
	}
	public void setValorTabela(float valorTabela) {
		this.valorTabela = valorTabela;
	}
	
	public float calcularDesconto() {
		
		if (this.ano <= 2000) {
			this.desconto = this.valorTabela * 12 / 100;
			this.classicos++;
		} 	else if (this.ano > 2000) {
			this.desconto = this.valorTabela * 7 / 100;	
		}
		this.totalveiculos++;
		return this.desconto;		
		}
	
	public float calcularTotalVeiculo() {
		this.totalVeiculoValor = this.valorTabela - this.desconto;
		return this.totalVeiculoValor;	
		}	
	
	public int carrosClassicos() {
		return this.classicos++;
	}
	
	public int carrosTotal() {
		return this.totalveiculos;
	}
	
	}
	
_________________________________________________________________________
CONSOLE
Concessionária Carros Antigos
Digite o modelo do carro: Palio
Digite o ano do carro: 2007
Digite o valor de tabela do carro: 25000
Valor desconto: R$ 1750.00
Valor total cliente: R$ 23250.00
Deseja continuar? S - sim / N - não
s
**Concessionária Carros Antigos**
Digite o modelo do carro: Gurgel
Digite o ano do carro: 1983
Digite o valor de tabela do carro: 45000
Valor desconto: R$ 5400.00
Valor total cliente: R$ 39600.00
Deseja continuar? S - sim / N - não
s
**Concessionária Carros Antigos**
Digite o modelo do carro: Fusca
Digite o ano do carro: 1983
Digite o valor de tabela do carro: 60000
Valor desconto: R$ 7200.00
Valor total cliente: R$ 52800.00
Deseja continuar? S - sim / N - não
s
**Concessionária Carros Antigos**
Digite o modelo do carro: Kombi
Digite o ano do carro: 1995
Digite o valor de tabela do carro: 65000
Valor desconto: R$ 7800.00
Valor total cliente: R$ 57200.00
Deseja continuar? S - sim / N - não
n
** Operação Finalizada **
Total de veicúlos Clássicos: 3
Total de veicúlos: 4
	
	
	
	
	
