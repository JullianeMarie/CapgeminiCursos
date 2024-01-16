package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 * 4. Crie uma classe denominada Elevador para armazenar as informações de um
		 * 		elevador dentro de um prédio. 
		 * A classe deve armazenar o andar atual (térreo =0), total de andares no prédio 
		 * 		(desconsiderando o térreo) Capacidade do elevador e quantas pessoas estão presentes nele. 
		 * A classe deve também disponibilizar os seguintes métodos: 
		 * a- Inicializa: que deve receber como parâmetros a capacidade do elevador 
		 * 		e o total de andares no prédio os elevadores sempre começam no térreo e vazio); 
		 * b- Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço); 
		 * c- Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele); 
		 * d- Sobe: para subir um andar (não deve subir se já estiver no último andar); 
		 * e- Desce: para descer um andar (não deve descer se já estiver no térreo);
		 */

		System.out.println("ELEVEDOR");
		System.out.println("CAPACIDADE TOTAL 450KG / 5 PESSOAS");
		Elevador elevor = new Elevador(5, 0, 450.0, 90.0);

		int qtdePessoasEntrando, qtdePessoasSaindo;
		elevor.inicializa();
		elevor.sobeElevador();
		System.out.println("TERREO");

		do {
			System.out.print("Quantas pessoas entram? ");
			qtdePessoasEntrando = sc.nextInt();
			if (qtdePessoasEntrando > 5) {
				System.out.println("CAPACIDADE EXCEDIDA");
			}
		} while (qtdePessoasEntrando > 5);

		elevor.entraPessoas(qtdePessoasEntrando);
		System.out.println("Capacidade: " + elevor.getCapacidadeTotal());

		for (int i = 1; i <= 5; i++) {
			String numeroAndar = Integer.toString(i);
			System.out.println();
			System.out.println("↑ Subindo");
			elevor.converteParaAndar(numeroAndar);

			if (i < 5) {
				do {
					System.out.print("Quantas pessoas saem? ");
					qtdePessoasSaindo = sc.nextInt();
					if (qtdePessoasSaindo > (qtdePessoasEntrando + elevor.getPessoasPresentes())) {
						System.out.println("CAPACIDADE INEXISTENTE");
					}
				} while (qtdePessoasSaindo > (qtdePessoasEntrando + elevor.getPessoasPresentes()));

				if (qtdePessoasSaindo > 0) {
					elevor.saiPessoas(qtdePessoasSaindo);
				} else {
					elevor.saiPessoas(qtdePessoasEntrando);
				}
				System.out.println("Capacidade: " + elevor.getCapacidadeTotal());
				System.out.println();

				do {
					System.out.print("Quantas pessoas entram? ");
					qtdePessoasEntrando = sc.nextInt();
					if (qtdePessoasEntrando > 5) {
						System.out.println("CAPACIDADE EXCEDIDA");
					}
				} while (qtdePessoasEntrando > 5);
				elevor.entraPessoas(qtdePessoasEntrando);
				System.out.println("Capacidade: " + elevor.getCapacidadeTotal());
			}
		}

		elevor.desceElevador();

		do {
			System.out.print("Quantas pessoas saem? ");
			qtdePessoasSaindo = sc.nextInt();
			if (qtdePessoasSaindo > (qtdePessoasEntrando + elevor.getPessoasPresentes()))

			{
				System.out.println("CAPACIDADE INEXISTENTE");
			}
		} while (qtdePessoasSaindo > (qtdePessoasEntrando + elevor.getPessoasPresentes()));

		if (qtdePessoasSaindo > 0) {
			elevor.saiPessoas(qtdePessoasSaindo);
		} else {
			elevor.saiPessoas(qtdePessoasEntrando);
		}
		System.out.println("Capacidade: " + elevor.getCapacidadeTotal());

		for (int i = 5; i >= 0; i--) {
			String numeroAndar = Integer.toString(i);
			System.out.println();
			System.out.println("↓ Descendo");
			elevor.converteParaAndar(numeroAndar);

			if (i != 5 || i == 4) {
				do {
					System.out.print("Quantas pessoas saem? ");
					qtdePessoasSaindo = sc.nextInt();
					if (qtdePessoasSaindo > (qtdePessoasEntrando + elevor.getPessoasPresentes())) {

						System.out.println("CAPACIDADE INEXISTENTE");
					}
				} while (qtdePessoasSaindo > (qtdePessoasEntrando + elevor.getPessoasPresentes()));

				if (qtdePessoasSaindo > 0) {
					elevor.saiPessoas(qtdePessoasSaindo);
				} else {
					elevor.saiPessoas(qtdePessoasEntrando);
				}
				System.out.println("Capacidade: " + elevor.getCapacidadeTotal());
			}

			if (i <= 5) {
				do {
					System.out.print("Quantas pessoas entram? ");
					qtdePessoasEntrando = sc.nextInt();
					if (qtdePessoasEntrando > 5) {
						System.out.println("CAPACIDADE EXCEDIDA");
					}
				} while (qtdePessoasEntrando > 5);
				elevor.entraPessoas(qtdePessoasEntrando);
				System.out.println("Capacidade: " + elevor.getCapacidadeTotal());

			}

		}

		sc.close();
	}
}

_______________________________________________________________________________________
CLASSE

package capgeminiProjeto;

public class Elevador {

	private int totalAndares = 5;
	private int andarAtual = 0;
	private double capacidadeTotal = 450.0;
	private double pessoa = 90.0;

	public Elevador(int totalAndares, int andarAtual, double capacidadeTotal, double pessoa) {
		this.totalAndares = totalAndares;
		this.andarAtual = andarAtual;
		this.capacidadeTotal = capacidadeTotal;
		this.pessoa = pessoa;

	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public double getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(double capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public void inicializa() {
		this.andarAtual = 0;
		this.totalAndares = 5;
		this.capacidadeTotal = 450.0;
	}

	public double entraPessoas(int qtdePessoasEntrando) {
		this.capacidadeTotal -= (qtdePessoasEntrando * this.pessoa);
		return this.capacidadeTotal;
	}

	public double saiPessoas(int qtdePessoasSaindo) {
		this.capacidadeTotal += (qtdePessoasSaindo * this.pessoa);
		return this.capacidadeTotal;
	}
	
	public int getPessoasPresentes() {
		return (int) ((this.capacidadeTotal / this.pessoa) - 0.5);
	}
	

	public enum Andares {
		TERREO, PRIMEIRO_ANDAR, SEGUNDO_ANDAR, TERCEIRO_ANDAR, QUARTO_ANDAR, QUINTO_ANDAR
	}

	public void converteParaAndar(String andar) {
		switch (andar) {
		case "0":
			System.out.println(Andares.TERREO);
			break;
		case "1":
			System.out.println(Andares.PRIMEIRO_ANDAR);
			break;
		case "2":
			System.out.println(Andares.SEGUNDO_ANDAR);
			break;
		case "3":
			System.out.println(Andares.TERCEIRO_ANDAR);
			break;
		case "4":
			System.out.println(Andares.QUARTO_ANDAR);
			break;
		case "5":
			System.out.println(Andares.QUINTO_ANDAR);
			break;
		default:
			System.out.println("Inexistente");
			break;
		}
	}

	public void sobeElevador() {
		this.andarAtual = +andarAtual;
	}

	public void desceElevador() {
		this.andarAtual = -andarAtual;
	}	
}
/*

CONSOLE:

ELEVEDOR
CAPACIDADE TOTAL 450KG / 5 PESSOAS
TERREO
Quantas pessoas entram? 6
CAPACIDADE EXCEDIDA
Quantas pessoas entram? 5
Capacidade: 0.0

↑ Subindo
PRIMEIRO_ANDAR
Quantas pessoas saem? 5
Capacidade: 450.0

Quantas pessoas entram? 2
Capacidade: 270.0

↑ Subindo
SEGUNDO_ANDAR
Quantas pessoas saem? 2
Capacidade: 450.0

Quantas pessoas entram? 3
Capacidade: 180.0

↑ Subindo
TERCEIRO_ANDAR
Quantas pessoas saem? 2
Capacidade: 360.0

Quantas pessoas entram? 1
Capacidade: 270.0

↑ Subindo
QUARTO_ANDAR
Quantas pessoas saem? 2
Capacidade: 450.0

Quantas pessoas entram? 1
Capacidade: 360.0

↑ Subindo
QUINTO_ANDAR
Quantas pessoas saem? 1
Capacidade: 450.0

↓ Descendo
QUINTO_ANDAR
Quantas pessoas entram? 2
Capacidade: 270.0

↓ Descendo
QUARTO_ANDAR
Quantas pessoas saem? 1
Capacidade: 360.0
Quantas pessoas entram? 1
Capacidade: 270.0

↓ Descendo
TERCEIRO_ANDAR
Quantas pessoas saem? 2
Capacidade: 450.0
Quantas pessoas entram? 1
Capacidade: 360.0

↓ Descendo
SEGUNDO_ANDAR
Quantas pessoas saem? 1
Capacidade: 450.0
Quantas pessoas entram? 1
Capacidade: 360.0

↓ Descendo
PRIMEIRO_ANDAR
Quantas pessoas saem? 1
Capacidade: 450.0
Quantas pessoas entram? 2
Capacidade: 270.0

↓ Descendo
TERREO
Quantas pessoas saem? 2
Capacidade: 450.0
Quantas pessoas entram? 1
Capacidade: 360.0

 */