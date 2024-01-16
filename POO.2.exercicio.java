package capgeminiProjeto;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		2. Crie uma classe para implementar uma ContaCorrente. 
		A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. 
		Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional,
		com valor default zero e os demais atributos são obrigatórios.
		 */
		
						
		ContaCorrente contaCorrente = new ContaCorrente(0, null);
		contaCorrente.setNumeroConta(0);
		contaCorrente.setNomeCorrentista(null);
		System.out.println();
		System.out.println("Número conta: " + contaCorrente.getNumeroConta() + " | " 
		+ "Nome correntista: " + contaCorrente.getNomeCorrentista());
		
		System.out.println("__________________________________________________________________");
		System.out.println();
		System.out.println("MENU");
		System.out.println("___________________________________________________________________");
		contaCorrente.tabelaMenu(null);
		System.out.println("Deseja efetuar outra operação?");
		System.out.println(" 1- SIM | 2- SAIR");
		
		
		int escolha2 = sc.nextInt();
		
		while (escolha2 == 1) {
			System.out.println();
			System.out.println("___________________________________________________________________");
			System.out.println("Número conta: " + contaCorrente.getNumeroConta() + " | " 
			+ "Nome correntista: " + contaCorrente.getNomeCorrentista());
			
			System.out.println("__________________________________________________________________");
			System.out.println();
			System.out.println("MENU");
			contaCorrente.tabelaMenu(null);System.out.println("Deseja efetuar outra operação?");
			System.out.println(" 1- SIM | 2- SAIR");
			escolha2 = sc.nextInt();
		}
		System.out.println("FIM");
		
		
		
		sc.close();

	}


}

_____________________________________________________________________________________________________________________
CLASSE

package capgeminiProjeto;

import java.util.Scanner;

public class ContaCorrente {

	private int numeroConta;
	private String nomeCorrentista;
	private double saldo = 0;
	private double saque;
	private double deposito;
	private Scanner sc;

	public ContaCorrente(int numeroConta, String nomeCorrentista) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.sc = new Scanner(System.in);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
		System.out.println("Digite o número da conta com 6 digitos: ");
		this.numeroConta = this.sc.nextInt();
		this.sc.nextLine();
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
		System.out.println("Digite o nome correntista: ");
		this.nomeCorrentista = this.sc.nextLine();
		System.out.println("Nome correntista: " + this.nomeCorrentista);
		System.out.println("Deseja fazer alteração no nome? 1-Sim|2-Não");
		int escolha = this.sc.nextInt();
		this.sc.nextLine();

		switch (escolha) {
		case 1:
			System.out.print("Digite o nome completo: ");
			this.nomeCorrentista = this.sc.nextLine();
			System.out.println("Nome correntista:" + this.nomeCorrentista);
			System.out.println("Dados corretos? 1-Sim | 2-Não");
			int opcao = 0;
			opcao = this.sc.nextInt();
			this.sc.nextLine();

			while (opcao == 2) {
				System.out.print("Digite o nome completo: ");
				this.nomeCorrentista = this.sc.nextLine();
				System.out.println("Nome correntista: " + this.nomeCorrentista);
				System.out.println("Dados corretos? 1-Sim | 2-Não");
				opcao = this.sc.nextInt();
				this.sc.nextLine();
			}
		case 2:
			System.out.println("Quais operações deseja fazer?");
			System.out.println("____________________________________________________________");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
		System.out.print("Digite o valor para saque: ");
		this.saque = this.sc.nextDouble();
		this.saldo -= this.saque;
		System.out.println("Atualização Saldo: R$" + getSaldo());
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
		System.out.print("Digite o valor para deposito: ");
		this.deposito = sc.nextDouble();
		this.saldo += this.deposito;
		System.out.println("Atualização Saldo: R$ " + getSaldo());
	}

	public void tabelaMenu(String menu) {
		System.out.println("Digite a opção desejada:");
		System.out.println("1- Saldo");
		System.out.println("2- Saque");
		System.out.println("3- Deposito");
		int escolha1 = sc.nextInt();

		// while (escolha1 != 1 || escolha1 != 2 || escolha1 != 3) {
		switch (escolha1) {
		case 1:
			System.out.println("Saldo: R$ " + getSaldo());
			break;
		case 2:
			System.out.println("Saque: ");
			setSaque(0);
			break;
		case 3:
			System.out.println("Deposito: ");
			setDeposito(0);
			break;
		default:
			while (escolha1 < 1 || escolha1 > 3) {
				System.out.println("Número inválido digite novamente.");
				escolha1 = sc.nextInt();
			}

		}

	}
}







/*
Digite o número da conta com 6 digitos: 
123456
Digite o nome correntista: 
Julliane Marie
Nome correntista: Julliane Marie
Deseja fazer alteração no nome? 1-Sim|2-Não
1
Digite o nome completo: Julliane Marie Almeida
Nome correntista:Julliane Marie Almeida
Dados corretos? 1-Sim | 2-Não
1
Quais operações deseja fazer?
____________________________________________________________

Número conta: 123456 | Nome correntista: Julliane Marie Almeida
__________________________________________________________________

MENU
___________________________________________________________________
Digite a opção desejada:
1- Saldo
2- Saque
3- Deposito
3
Deposito: 
Digite o valor para deposito: 200.00
Atualização Saldo: R$ 200.0
Deseja efetuar outra operação?
 1- SIM | 2- SAIR
1

___________________________________________________________________
Número conta: 123456 | Nome correntista: Julliane Marie Almeida
__________________________________________________________________

MENU
Digite a opção desejada:
1- Saldo
2- Saque
3- Deposito
2
Saque: 
Digite o valor para saque: 50.00
Atualização Saldo: R$150.0
Deseja efetuar outra operação?
 1- SIM | 2- SAIR
1

___________________________________________________________________
Número conta: 123456 | Nome correntista: Julliane Marie Almeida
__________________________________________________________________

MENU
Digite a opção desejada:
1- Saldo
2- Saque
3- Deposito
1
Saldo: R$ 150.0
Deseja efetuar outra operação?
 1- SIM | 2- SAIR

 */