package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);
		System.out.println("Encapsulamento e Herança");

		Vendedor venda1 = new Vendedor();
		System.out.print("Nome funcionário:");
		venda1.setNome(sc.nextLine());
		System.out.print("CPF:");
		venda1.setCpf(sc.nextLine());
		System.out.print("Data Nascimento: (dd/MM/yyyy): ");
		venda1.setDataNascimento(converterData(sc.nextLine()));
		System.out.println("Cargo: Vendedor");
		System.out.print("Salário Fixo:");
		System.out.printf(" R$ %.2f%n", venda1.getSalarioVendedor());

		try {
			System.out.print("Itens vendidos mensal: ");
			int itensVendidos = sc.nextInt();
			venda1.setItensVendidos(itensVendidos);
		} catch (InputMismatchException e) {
			System.out.println("Entrada errada, certifique-se de inserir número inteiro.");
		}

		System.out.printf("Valor da comissão: R$ %.2f%n", venda1.calcularComissao());
		System.out.printf("Total Bruto: R$ %.2f%n", venda1.calcularTotalSalarioV());
		System.out.println();

		Vendedor venda2 = new Vendedor();
		System.out.print("Nome funcionário:");
		venda2.setNome(sc.nextLine());
		venda2.setNome(sc.nextLine());
		System.out.print("CPF:");
		venda2.setCpf(sc.nextLine());
		System.out.print("Data Nascimento: (dd/MM/yyyy): ");
		venda2.setDataNascimento(converterData(sc.nextLine()));
		System.out.println("Cargo: Vendedor");
		System.out.print("Salário Fixo:");
		System.out.printf(" R$ %.2f%n", venda2.getSalarioVendedor());

		try {
			System.out.print("Itens vendidos mensal: ");
			int itensVendidos = sc.nextInt();
			venda2.setItensVendidos(itensVendidos);
		} catch (InputMismatchException e) {
			System.out.println("Entrada errada, certifique-se de inserir número inteiro.");
		}

		System.out.printf("Valor da comissão: R$ %.2f%n", venda2.calcularComissao());
		System.out.printf("Total Bruto: R$ %.2f%n", venda2.calcularTotalSalarioV());

		Motorista moto1 = new Motorista();
		System.out.println();
		System.out.print("Nome funcionário:");
		moto1.setNome(sc.nextLine());
		moto1.setNome(sc.nextLine());
		System.out.print("CPF: ");
		moto1.setCpf(sc.nextLine());
		System.out.print("Data Nascimento: (dd/MM/yyyy): ");
		moto1.setDataNascimento(converterData(sc.nextLine()));
		System.out.println("Cargo: Motorista");
		System.out.print("Salário Fixo:");
		System.out.printf(" R$ %.2f%n", moto1.getSalario());

		try {
			System.out.print("Informe quantidade de entregas realizados no mês: ");
			int qtdeEntregas = sc.nextInt();
			moto1.setQtdeEntregas(qtdeEntregas);
		} catch (InputMismatchException e) {
			System.out.println("Entrada errada, certifique-se de inserir número inteiro.");
		}

		System.out.println("Valor total das entregas realizadas R$ " + moto1.getQtdeEntregas());
		System.out.printf("Salário Bruto: R$ %.2f%n", moto1.calcularTotalSalarioM());

		Motorista moto2 = new Motorista();
		System.out.println();
		System.out.print("Nome funcionário:");
		moto2.setNome(sc.nextLine());
		moto2.setNome(sc.nextLine());
		System.out.print("CPF: ");
		moto2.setCpf(sc.nextLine());
		System.out.print("Data Nascimento: (dd/MM/yyyy): ");
		moto2.setDataNascimento(converterData(sc.nextLine()));
		System.out.println("Cargo: Motorista");
		System.out.print("Salário Fixo:");
		System.out.printf(" R$ %.2f%n", moto2.getSalario());

		try {
			System.out.print("Informe quantidade de entregas realizados no mês: ");
			int qtdeEntregas = sc.nextInt();
			moto2.setQtdeEntregas(qtdeEntregas);
		} catch (InputMismatchException e) {
			System.out.println("Entrada errada, certifique-se de inserir número inteiro.");
		}

		System.out.println("Valor total das entregas realizadas R$ " + moto2.getQtdeEntregas());
		System.out.printf("Salário Bruto: R$ %.2f%n", moto2.calcularTotalSalarioM());
		}
	
		public static Date converterData(String dataString) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.parse(dataString);

		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

}

______________________________________________________________________________________
package capgeminiProjeto;

import java.util.Date;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private float salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
	return cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public float getSalario() {
		salario = 1500;
		return salario;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}

______________________________________________________________________________________
package capgeminiProjeto;

public class Vendedor extends Funcionario {

	private int itensVendidos;
	private float comissao;
	private float totalSalarioV;

	public Vendedor() {
		super();
	}

	public int getItensVendidos() {
		return itensVendidos;
	}

	public void setItensVendidos(int itensVendidos) {
		this.itensVendidos = itensVendidos * 100;	
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float calcularComissao() {
		this.comissao = (this.itensVendidos * 30) / 100;
		return comissao;
	}

	public float getSalarioVendedor() {
		float salarioFixo = getSalario();
		float salarioVendedor = salarioFixo + 300;
		return salarioVendedor;
	}

	public void setTotalSalarioV(float totalSalarioV) {
		this.totalSalarioV = totalSalarioV;
	}

	public void setSalarioVendedor(float salarioVendedor) {
	}

	public float calcularTotalSalarioV() {
		this.totalSalarioV = this.comissao + this.getSalarioVendedor();
		return totalSalarioV;
	}

}

_____________________________________________________________________________________
package capgeminiProjeto;

public class Motorista extends Funcionario {
	
	private int qtdeEntregas;
	private float totalSalarioM; 
	
	
	public Motorista() {
		super();
	}
	public int getQtdeEntregas() {
		return this.qtdeEntregas * 20;
	}
	public void setQtdeEntregas(int qtdeEntregas) {
		this.qtdeEntregas = qtdeEntregas;
	}
	public float calcularTotalSalarioM() {
		this.totalSalarioM = this.qtdeEntregas * 20 + this.getSalario();
		return totalSalarioM;
	}
	
	
}
______________________________________________________________________________________
Console:

Encapsulamento e Herança 
Nome funcionário:Angelo Franzon
CPF:999.999.999.99
Data Nascimento: (dd/MM/yyyy): 29/10/1983
Cargo: Vendedor
Salário Fixo: R$ 1800.00
Itens vendidos mensal: 65
Valor da comissão: R$ 1950.00
Total Bruto: R$ 3750.00

Nome funcionário:Julliane Marie
CPF:888.888.888.88
Data Nascimento: (dd/MM/yyyy): 18/01/1983
Cargo: Vendedor
Salário Fixo: R$ 1800.00
Itens vendidos mensal: 90
Valor da comissão: R$ 2700.00
Total Bruto: R$ 4500.00

Nome funcionário:Theodoro Fonseca
CPF: 777.777.777.77
Data Nascimento: (dd/MM/yyyy): 15/03/2022
Cargo: Motorista
Salário Fixo: R$ 1500.00
Informe quantidade de entregas realizados no mês: 45
Valor total das entregas realizadas R$ 900
Salário Bruto: R$ 2400.00

Nome funcionário:Afonso Fonseca
CPF: 666.666.666.66
Data Nascimento: (dd/MM/yyyy): 05/05/1995
Cargo: Motorista
Salário Fixo: R$ 1500.00
Informe quantidade de entregas realizados no mês: 62
Valor total das entregas realizadas R$ 1240
Salário Bruto: R$ 2740.00