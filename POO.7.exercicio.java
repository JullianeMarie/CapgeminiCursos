package capgeminiProjeto;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private double salarioMensal;
		
	
	public Funcionario(String nome, String sobrenome, double salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (this.salarioMensal < 0) {
			this.salarioMensal = 0.0;
		} else {
			this.salarioMensal = salarioMensal;
		}
		this.salarioMensal = salarioMensal;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public double calcularSalarioAnual() {
		return this.salarioMensal * 12; 
	}
		
	public void exibirSalarioAnual() {
		System.out.println("Funcionário: " + nome + " " + sobrenome 
				+ "\nSalário Anual: " + calcularSalarioAnual());		
	}
 	
	public double aumentoSalario() {
		this.salarioMensal = salarioMensal *  1.1;
		return this.salarioMensal;
	}
	
}


______________________________________________________________________________________

package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		 
		/*   
		 7. A fim de representar funcionários em uma empresa, 
			crie uma classe chamada Funcionario 
			que inclui as três informações a seguir como atributos:
			a. um primeiro nome,
			b. um sobrenome
			c. um salário mensal
			Sua classe deve ter um construtor que inicializa os três atributos. 
			Forneça os métodos getters e setters para cada atributo. 
			Se o salário mensal não for positivo, configure-o como 0.0. 
			Escreva um aplicativo de teste que demonstra as capacidades da classe. 
			Crie duas instâncias da classe e exiba o salário anual de cada instância. 
			Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual 
			de cada empregado.
		  */
		
		
		Funcionario funcionario1 = new Funcionario("Julliane", "Marie", 2500.00);
		Funcionario funcionario2 = new Funcionario("Angelo","Franzon", 0.0);
		
		funcionario1.calcularSalarioAnual();
		funcionario2.calcularSalarioAnual();
		funcionario1.exibirSalarioAnual();
		funcionario2.exibirSalarioAnual();
		
		funcionario1.aumentoSalario();
		funcionario2.aumentoSalario();
		funcionario1.exibirSalarioAnual();
		funcionario2.exibirSalarioAnual();	
	
	sc.close();
	
	}
}

/*
Funcionário: Julliane Marie
Salário Anual: 30000.0
Funcionário: Angelo Franzon
Salário Anual: 0.0
Funcionário: Julliane Marie
Salário Anual: 33000.0
Funcionário: Angelo Franzon
Salário Anual: 0.0
 */