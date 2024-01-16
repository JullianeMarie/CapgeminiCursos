package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 * 3. Crie uma classe para representar uma BombaCombustivel. A classe
		 * BombaCombustivel deve conter os seguintes atributos: tipo de combustível,
		 * valor por litro e quantidade de combustível. Além desses atributos a classes
		 * deve conter os seguintes métodos. a. abastecerPorValor; //método onde é
		 * informado o valor a ser abastecido e mostra a quantidade de litros que foi
		 * colocada no veículo b. abastecerPorLitro; // método onde é informado a
		 * quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
		 * c. alterarValor; //altera o valor do litro do combustível. d.
		 * alterarCombustivel; //altera o tipo do combustível. e.
		 * alterarQuantidadeCombustivel; //altera a quantidade de combustível. Crie uma
		 * classe que contenha um método main para testar sua classe BombaCombustível
		 */
		BombaCombustivel bombComb = new BombaCombustivel(0, 0, 0, 0, 0);
		double valorPagar;
		
		System.out.println("Bomba Combustível - Selecione o tipo de combustível");
		System.out.println("TIPO COMBUSTÍVEL: 1- GASOLINA | 2- ALCOOL | 3- DIESEL");
		int tipoCombustivel = sc.nextInt();
		if (tipoCombustivel == 1) {
			System.out.println("GASOLINA");
		} else if (tipoCombustivel == 2) {
			System.out.println("ALCOOL");
		} else if (tipoCombustivel == 3) {
			System.out.println("DIESEL");
		}
		while (tipoCombustivel <= 0 || tipoCombustivel > 3) {
			System.out.println("OPÇAO INVÁLIDA DIGITE NOVAMENTE");
			tipoCombustivel = sc.nextInt();
		}
		bombComb.setTipoCombustivel(tipoCombustivel);
		System.out.println("Digite o valor do combustivel/Litro: ");
		double valorCombustivel = sc.nextDouble();
		System.out.println("ABASTECER: 1- POR VALOR | 2-POR LITRO");
		int escolha = sc.nextInt();
		if (escolha == 1) {
			System.out.print("Digite o valor a pagar: R$ ");//REFERENCIA
			valorPagar = sc.nextDouble();
			bombComb.setValorPagar(valorPagar);
			bombComb.setValorPorLitro(valorCombustivel);
			double qtdeCombustivel = bombComb.abastecerPorValor();
			System.out.println(String.format("%.2f litros", qtdeCombustivel));
			System.out.println("______________________________________________________");
			System.out.println("RESUMO");
			System.out.println(bombComb.toStringAbastecerPorValor());
			System.out.println("______________________________________________________");
		} else if (escolha == 2) {
			System.out.print("Digite quantos litros: ");
			double qtdeCombustivel = sc.nextDouble();
			bombComb.setQtdeCombustivel(qtdeCombustivel);
			bombComb.setValorPorLitro(valorCombustivel);
			valorPagar = bombComb.abastecerPorLitro();
			System.out.println(String.format("%.2f reais", valorPagar));
			System.out.println("______________________________________________________");
			System.out.println("RESUMO");
			System.out.println(bombComb.toString());
			System.out.println("______________________________________________________");
		}
		//COMEÇA O LOOPING
		System.out.println("Deseja fazer alguma alteração?");
		System.out.println("1- Tipo Combustivel \n2- Valor Litro Combustivel \n3- Quantidade Combustivel \n4- Sair");
		int escolha1 = sc.nextInt();
	
		while (escolha1 != 4) {
			if (escolha1 == 1) { // ALTERAR TIPO COMBUSTIVEL
				System.out.println("TIPO COMBUSTÍVEL: 1- GASOLINA | 2- ALCOOL | 3- DIESEL");
				tipoCombustivel = sc.nextInt();
				bombComb.setTipoCombustivel(tipoCombustivel);
				if (tipoCombustivel == 1) {
					System.out.println("GASOLINA");
				} else if (tipoCombustivel == 2) {
					System.out.println("ALCOOL");
				} else if (tipoCombustivel == 3) {
					System.out.println("DIESEL");
				}
				while (tipoCombustivel <= 0 || tipoCombustivel > 3) {
					System.out.println("OPÇAO INVÁLIDA DIGITE NOVAMENTE");
					tipoCombustivel = sc.nextInt();
				}
				bombComb.setTipoCombustivel(tipoCombustivel);
				System.out.println("Digite o valor do combustivel/Litro: ");
				valorCombustivel = sc.nextDouble();
				System.out.println("ABASTECER: 1- POR VALOR | 2-POR LITRO");
				escolha = sc.nextInt();
				if (escolha == 1) {
					System.out.print("Digite o valor a pagar: R$ ");
					valorPagar = sc.nextDouble();
					bombComb.setValorPagar(valorPagar);
					bombComb.setValorPorLitro(valorCombustivel);
					double qtdeCombustivel = bombComb.abastecerPorValor();
					System.out.println(String.format("%.2f litros", qtdeCombustivel));
					System.out.println("______________________________________________________");
					System.out.println("RESUMO");
					System.out.println(bombComb.toStringAbastecerPorValor());
					System.out.println("______________________________________________________");
				} else if (escolha == 2) {
					System.out.print("Digite quantos litros: ");
					double qtdeCombustivel = sc.nextDouble();
					bombComb.setQtdeCombustivel(qtdeCombustivel);
					bombComb.setValorPorLitro(valorCombustivel);
					valorPagar = bombComb.abastecerPorLitro();
					System.out.println(String.format("%.2f reais", valorPagar));
					System.out.println("______________________________________________________");
					System.out.println("RESUMO");
					System.out.println(bombComb.toString());
					System.out.println("______________________________________________________");
				}

			} else if (escolha1 == 2) { // ALTERAR VALOR POR LITRO
				
				bombComb.setTipoCombustivel(tipoCombustivel);
				System.out.println("Digite o valor do combustivel/Litro: ");
				valorCombustivel = sc.nextDouble();
				System.out.println("ABASTECER: 1- POR VALOR | 2-POR LITRO");
				escolha = sc.nextInt();
				if (escolha == 1) {
					System.out.print("Digite o valor a pagar: R$ ");
					valorPagar = sc.nextDouble();
					bombComb.setValorPagar(valorPagar);
					bombComb.setValorPorLitro(valorCombustivel);		
					double qtdeCombustivel = bombComb.abastecerPorValor();
					System.out.println(String.format("%.2f litros", qtdeCombustivel));
					System.out.println("______________________________________________________");
					System.out.println("RESUMO");
					System.out.println(bombComb.toStringAbastecerPorValor());
					System.out.println("______________________________________________________");
			
				} else if (escolha == 2) {
					System.out.print("Digite quantos litros: ");
					double qtdeCombustivel = sc.nextDouble();
					bombComb.setQtdeCombustivel(qtdeCombustivel);
					bombComb.setValorPorLitro(valorCombustivel);
					valorPagar = bombComb.abastecerPorLitro();
					System.out.println(String.format("%.2f reais", valorPagar));
					System.out.println("______________________________________________________");
					System.out.println("RESUMO");
					System.out.println(bombComb.toString());
					System.out.println("______________________________________________________");
				}

			} else if (escolha1 == 3) { // ALTERAR QUANTIDADE COMBUSTIVEL
				bombComb.alterarQtdeCombustivel();
				System.out.print("Digite quantos litros: ");
				double qtdeCombustivel = sc.nextDouble();
				bombComb.setQtdeCombustivel(qtdeCombustivel);
				valorPagar = bombComb.abastecerPorLitro();
				System.out.println(String.format("%.2f reais", valorPagar));
				System.out.println("______________________________________________________");
				System.out.println("RESUMO");
				System.out.println(bombComb.toString());
				System.out.println("______________________________________________________");	
			}
			System.out.println("Deseja fazer alguma alteração?");
			System.out.println("1- Tipo Combustivel \n2- Valor Litro Combustivel \n3- Quantidade Combustivel \n4- Sair");
			escolha1 = sc.nextInt();
		}
		
		System.out.println("FIM");
		sc.close();

	}
}

____________________________________________________________________________________________________________________________________
CLASSE
package capgeminiProjeto;

import java.text.DecimalFormat;

public class BombaCombustivel {

	private int tipoCombustivel;// Gasolina,Alcool,Diesel
	private double valorPorLitro;// Entrada scanner
	private double qtdeCombustivel;// Compro por $
	private double precoCombustivel;// Compro por litro
	private double valorPagar;

	public BombaCombustivel(int tipoCombustivel, double valorPorLitro, double qtdeCombustivel, double precoCombustivel,
			double valorPagar) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorPorLitro = valorPorLitro;
		this.qtdeCombustivel = qtdeCombustivel;
		this.precoCombustivel = precoCombustivel;
		this.valorPagar = valorPagar;
	}

	public int getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(int tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getValorPorLitro() {
		return valorPorLitro;
	}

	public void setValorPorLitro(double valorPorLitro) {
		this.valorPorLitro = valorPorLitro;
	}

	public double getQtdeCombustivel() {
		return qtdeCombustivel;
	}

	public void setQtdeCombustivel(double qtdeCombustivel) {
		this.qtdeCombustivel = qtdeCombustivel;
	}

	public double getPrecoCombustivel() {
		return precoCombustivel;
	}

	public void setPrecoCombustivel(double precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public int tipoCombustivel() {
		if (this.tipoCombustivel == 1) {
		} else if (tipoCombustivel == 2) {
		} else if (tipoCombustivel == 3) {
		}
		return this.tipoCombustivel;
	}

	public double abastecerPorValor() {
		this.qtdeCombustivel = this.valorPagar / this.valorPorLitro;
		return this.qtdeCombustivel;
	}

	public double abastecerPorLitro() {
		this.valorPagar = this.qtdeCombustivel * this.valorPorLitro;
		return this.valorPagar;
	}

	public double alterarValor(double valorPorLitro) { 
		return this.valorPorLitro;
	}

	public int alterarCombustivel() {
		return this.tipoCombustivel();
	}

	public double alterarQtdeCombustivel() {
		return abastecerPorLitro();
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return "Tipo Combustível: " + tipoCombustivel + "\nValor Combustível: " + valorPorLitro + "\nValor a Pagar: "
				+ df.format(valorPagar) + " reais";
	}

	public String toStringAbastecerPorValor() {
		DecimalFormat df = new DecimalFormat("#.##");
		return "Tipo Combustível: " + tipoCombustivel + "\nValor Combustível: " + valorPorLitro
				+ "\nQuantidade a Abastecer: " + df.format(qtdeCombustivel) + " litros";

	}
}



/*
CONSOLE
Bomba Combustível - Selecione o tipo de combustível
TIPO COMBUSTÍVEL: 1- GASOLINA | 2- ALCOOL | 3- DIESEL
3
DIESEL
Digite o valor do combustivel/Litro: 
6.5
ABASTECER: 1- POR VALOR | 2-POR LITRO
2
Digite quantos litros: 100
650.00 reais
______________________________________________________
RESUMO
Tipo Combustível: 3
Valor Combustível: 6.5
Valor a Pagar: 650 reais
______________________________________________________
Deseja fazer alguma alteração?
1- Tipo Combustivel 
2- Valor Litro Combustivel 
3- Quantidade Combustivel 
4- Sair
2
Digite o valor do combustivel/Litro: 
7.9
ABASTECER: 1- POR VALOR | 2-POR LITRO
2
Digite quantos litros: 100
790.00 reais
______________________________________________________
RESUMO
Tipo Combustível: 3
Valor Combustível: 7.9
Valor a Pagar: 790 reais
______________________________________________________
Deseja fazer alguma alteração?
1- Tipo Combustivel 
2- Valor Litro Combustivel 
3- Quantidade Combustivel 
4- Sair
3
Digite quantos litros: 200
1580.00 reais
______________________________________________________
RESUMO
Tipo Combustível: 3
Valor Combustível: 7.9
Valor a Pagar: 1580 reais
______________________________________________________
Deseja fazer alguma alteração?
1- Tipo Combustivel 
2- Valor Litro Combustivel 
3- Quantidade Combustivel 
4- Sair
4
FIM
 */