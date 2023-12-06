package capgeminiProjeto;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		1. Crie uma classe para representar uma Pessoa com os atributos privados 
		De: nome, data de nascimento e altura. 
		Crie os métodos públicos necessários para getters e setters 
		E também um método para imprimir todos dados de uma pessoa. 
		Crie um método para calcular a idade da pessoa.
		 */
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(null);
		pessoa.setDataNascimento();
		pessoa.CalcularIdade();
		pessoa.setAltura(0);
		
		System.out.println("_____________________________________________________");
		
		System.out.println(pessoa.toString());
		
		
		
		sc.close();

	}
}
__________________________________________________________________________________________
CLASSE

package capgeminiProjeto;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Pessoa {

	private String nome;
	private double altura;
	private LocalDate dataNascimento;
	private int idade;
	private Scanner sc;

	public Pessoa() {
		sc = new Scanner(System.in);
		System.out.println("Cadastro Pessoa, nome, data nascimento e altura");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.print("Digite o nome completo: ");
		this.nome = sc.nextLine();
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento() {

		System.out.print("Informe o ano do nascimento:(AAAA) ");
		int ano = sc.nextInt();

		System.out.print("Informe o mês do nascimento:(MM) ");
		int mes = sc.nextInt();

		System.out.print("Informe o dia do nascimento:(DD) ");
		int dia = sc.nextInt();
		this.dataNascimento = LocalDate.of(ano, mes, dia);
	}

	public int CalcularIdade() {
		if (dataNascimento != null) {
			LocalDate hoje = LocalDate.now();
			Period periodo = Period.between(dataNascimento, hoje);
			this.idade = periodo.getYears();
			System.out.println("Idade: " + idade + " anos");
			return idade;
		} else {
			System.out.println("Data de nascimento não definida");
			return 0;
		}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
		System.out.print("Digite a altura: ");
		this.altura = sc.nextDouble();
	}
	
	public String toString() {
	return "Nome: " + nome + "\n" +
			"Data Nascimento: " + dataNascimento + "\n" + 
			"Idade: " + idade + " anos\n" +  
			String.format("Altura: %.2f", altura);  	
	}
	
}


/*
Console:
Cadastro Pessoa, nome, data nascimento e altura
Digite o nome completo: Julliane Marie
Informe o ano do nascimento:(AAAA) 1983
Informe o mês do nascimento:(MM) 01
Informe o dia do nascimento:(DD) 18
Idade: 40 anos
Digite a altura: 1.60
_____________________________________________________
Nome: Julliane Marie
Data Nascimento: 1983-01-18
Idade: 40 anos
Altura: 1.60
 */