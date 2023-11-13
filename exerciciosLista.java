import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - Faça um algoritmo que receba dois números e exiba o resultado da sua soma");
		int n1, n2, total;
		System.out.print("Digite numero 1: ");
		n1 = sc.nextInt();
		System.out.print("Digite numero 2: ");
		n2 = sc.nextInt();
		total= n1 +n2;
		System.out.println("O valor da soma é: " + total);
		
		
		System.out.println("_______________________________________________________________________");	
		System.out.println("2- Faça um algoritmo que receba dois números e ao final mostre a:"); 
		System.out.println("Soma, Subtração, Multiplicação, Divisão dos dois números lidos");		
				
		int n3, n4, soma, subtracao, divisao, multiplicacao;
		System.out.print("Digite numero 3: ");
		n3 = sc.nextInt();
		System.out.print("Digite numero 4: ");
		n4 = sc.nextInt();	
		
		soma = n3 + n4;
		System.out.println("A soma dos números é: " + soma);
		subtracao = n3 - n4;
		System.out.println("A subtração dos números é: " + subtracao);
		divisao = n3/n4;
		System.out.println("A divisão dos números é: " + divisao);
		multiplicacao = n3*n4;
		System.out.println("A multiplicação dos números é: " + multiplicacao);
		
		
		System.out.println("_______________________________________________________________________");
		System.out.println("3- Escreva um algoritmo para determinar o consumo médio de um automóvel ");
		System.out.println("- Sendo fornecida a distância");
		System.out.println("- Total percorrida pelo automóvel");
		System.out.println("- Total de combustível gasto");
		
		System.out.print("Digite a distância percorrida: ");
		double distancia = sc.nextDouble();
		System.out.print("Digite a kilometragem por litro: ");
		double km = sc.nextDouble();
		double litro = 1;
		double consumo = litro*distancia/km;
        System.out.printf("O total de gasto do combustível é de: %.2f%n ", consumo);	
        
        
		System.out.println("___________________________________________________________________________");
		System.out.println ("4 - Escreva um algoritmo que leia o nome de um vendedor, "
				+ "salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). "
				+ "Sabendo que o vendedor ganha 15% de comissão sobre suas vendas efetuadas "
				+ "Informar o seu nome, o salário fixo e salário no final do mês");
        System.out.println("Informe o nome do vendedor cadastrado: ");
        String nomeVendedor = sc.next();
        System.out.println("Salário fixo: R$ 1500.00");
		double salariofx = 1500.00;
		System.out.print("Total do valor das vendas mensal: R$: ");
		double totalVendas = sc.nextDouble();
		double comissao = totalVendas * 15 /100;
		double totalSalario = salariofx + comissao;
		System.out.printf("Nome vendedor: %s / Salário Fixo: R$ %.3f%n", nomeVendedor, salariofx);
		System.out.printf("Salário final do mês: R$ %.2f%n", totalSalario);
		
		System.out.println("________________________________________________________________________");
		System.out.println("5- Escreva um algoritmo que leia o nome de um aluno"); 
		System.out.println("E as notas das três provas que ele obteve no semestre.");
		System.out.println("No final informar o nome do aluno e a sua média (aritmética)");
		
		String nomeAluno;
		double nota1, nota2, nota3, mediaAluno;
		
		System.out.println("Digite o nome do aluno: ");
		nomeAluno = sc.next();
		System.out.println("Informe a nota prova 1: ");
		nota1 = sc.nextDouble();
		System.out.println("Informe a nota prova 2: ");
		nota2 = sc.nextDouble();
		System.out.println("Informe a nota prova 3: ");
		nota3 = sc.nextDouble();
		
		mediaAluno = (nota1 + nota2 + nota3)/ 3;
		System.out.println("Média do semestre: " + nomeAluno + " " + mediaAluno);
		
		
		System.out.println("________________________________________________________________________");
		System.out.println("6- Leia dois valores para as variáveis A e B");
        System.out.println("Efetuar as trocas dos valores de forma que a variável A");
        System.out.println("Passe a possuir o valor da variável B");
        System.out.println("E a variável B passe a possuir o valor da variável A");
        System.out.println("Apresentar os valores trocados;");
        
        int A, B, Atroca, Btroca;
        System.out.print("Digite valor de A: ");
        A= sc.nextInt();
        System.out.print("Digite valor de B: ");
        B= sc.nextInt();
        
        Atroca = B;
        Btroca = A;
        System.out.println("Valor de A: " + Atroca);
        System.out.println("Valor de B: " + Btroca); 
		
		System.out.println("______________________________________________________________________________________");
		System.out.println("7- Leia uma temperatura em graus Celsius");
	    System.out.println("E apresentá-la convertida em graus Fahrenheit");
	    System.out.println("A fórmula de conversão é:F=(9*C+160) / 5");
	    System.out.println("Sendo F a temperatura em Fahrenheit e C a temperatura em Celsius");
	        
	    double cº;
	    double fahrenheit;
	        
	    System.out.println("Digite temperatura em Celsius:");
	    cº = sc.nextDouble();
	    fahrenheit = (9*cº+160)/5;
	    System.out.println("Tempatura em Fahrenheit:" + fahrenheit);
	        
	    System.out.println("______________________________________________________________________________________");    
	    System.out.println("8- Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$)"); 
        System.out.println("De um valor lido em dólar (US$)"); 
        System.out.println("O algoritmo deverá solicitar o valor da cotação do dólar"); 
        System.out.println("E também a quantidade de dólares disponíveis com o usuário.");
        
        System.out.println("Digite a taxa de cambio do dolar: US$:");
        double taxaCambio = sc.nextDouble();
        System.out.println("Digite o valor de dinheito em dolar: US$:");
        double dolar = sc.nextDouble();
        
        double real = dolar * taxaCambio;
        
        System.out.printf("Valor em Real Brasileiro R$: %.2f", real);  
        
        System.out.println("______________________________________________________________________________________");
        System.out.println("9- Faça um algoritmo que receba um valor que foi depositado"); 
		System.out.println("E exiba o valor com rendimento após um mês.");
		System.out.println("Considere fixo o juro da poupança em 0,07% a. m.");
		
		System.out.print("Digite o valor do deposito:");
		double depositopp = sc.nextDouble();
		 
		double valorrd = (depositopp * 0.07) /100;
		double valortt = depositopp + valorrd;
		System.out.printf("O valor de rendimento mensal é de R$: %.2f%n", valorrd);
		System.out.printf("Saldo Poupança:R$ %.2f", valortt);
		
	    System.out.println("______________________________________________________________________________________");
		System.out.println("10- A Loja Mamão com Açúcar está vendendo seus produtos");
		System.out.println("Em 5(cinco)prestações sem juros.");
        System.out.println("Faça um algoritmo que receba um valor de uma compra.");
		System.out.println("E mostre o valor das prestações.");
		
		System.out.println("Digite o valor do produto:");
		double produtoLM = sc.nextDouble();
		System.out.println("Deseja parcelar? S/N");
		char desejaparcelar = 's';
		desejaparcelar = sc.next().charAt(0);
		
		
		if (desejaparcelar == 's' || desejaparcelar == 'S') {
		
			double prestacoes = produtoLM/5; 
		System.out.println("Valor da parcela: R$" + prestacoes + "  5x sem juros.");
		}
		
		else {
			System.out.println("Valor da compra: R$" + produtoLM);
		}
        
		
		System.out.println("______________________________________________________________________________________");
        System.out.println("11- Faça um algoritmo que receba o preço de custo de um produto"); 
		System.out.println("E mostre o valor de venda."); 
		System.out.println("Sabe-se que o preço de custo receberá um acréscimo"); 
		System.out.println("De acordo com um percentual informado pelo usuário");

		double produto11, custo11, venda11;
		System.out.print("Digite o custo do produto:");
		produto11 = sc.nextDouble();
		System.out.println("Qual a porcetagem de custo no produto?");
		custo11 = sc.nextDouble();
		venda11 = (produto11 * custo11)/100;
		venda11 += produto11;
		System.out.printf("Valor venda: R$ %.2f", venda11);
		
		
		System.out.println("______________________________________________________________________________________");
		System.out.println("15- Faça um algoritmo que receba um número ");
		System.out.println("E diga se este número está no intervalo entre 100 e 200");
		
		
		System.out.print("Digite o número:");
		int n5 = sc.nextInt();
		
		if (n5 >= 100){
			System.out.println("*DENTRO DO INTERVALO*");			
		}
		else if (n5 <= 200) {
				System.out.println("*DENTRO DO INTERVALO*");	
				}
			else {
				System.out.println("*FORA DO INTERVALO*");
			}
		
		System.out.println("Exercício com Operador Lógico: ");
		
		System.out.print("Digite o número:");
		int n6 = sc.nextInt();
		
		if (n6 <= 200 && n6 >= 100) {
			System.out.println("*DENTRO DO INTERVALO*");
		}
		else {
			System.out.println("*FORA INTERVALO*");
		}
		
		System.out.println("_________________________________________________________________________");
 		System.out.println("22- . Faça um algoritmo que receba o preço de custo e venda de 40 produtos. ");	
		System.out.println("Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. ");
		System.out.println("Informe o valor de custo de cada produto e valor de venda de cada produto.");
		System.out.println ("E a média de preço de custo e do preço de venda.");
			
		String nomeproduto = null;
	 	float custo = 0, venda = 0, mediacusto = 0, mediavenda = 0;
		int i = 0;

		for (i = 0; i < 3; i++) {
		System.out.print("Cadastre o produto: ");
		nomeproduto = sc.next();
		System.out.print("Cadastre o preço de custo: R$ ");
		custo = sc.nextFloat();
		System.out.print("Cadastre o preço de venda: R$ ");
		venda = sc.nextFloat();

		mediacusto += custo;
		mediavenda += venda;

		if (custo < venda) {
		System.out.println("LUCRO");
		} else 
			if (custo > venda) {
		System.out.println("PREJUIZO");
		} 
			else {
			System.out.println("BREAK EVEN");
		}
		System.out.print(nomeproduto + " Preço custo = " + custo + "/ Preço venda = " + venda);

		System.out.println("");
		}

		System.out.println("");
		System.out.printf("Média venda %.2f: ", (mediavenda / i));
		System.out.printf("Média custo %.2f%n: ", (mediacusto / i));
	
	
	    System.out.println("________________________________________________________________________");
		System.out.println("24- Faça um algoritmo que receba “N” números e mostre:" 
				+  "positivo negativo ou zero para cada número");	
		
			char desejacontinuar = 'S';
			
			while (desejacontinuar == 's' || desejacontinuar == 'S') {
			System.out.println("Digite um número");
			int n7 = sc.nextInt();
			
			if (n7 == 0) {
				System.out.println("Zero");
			}else 
				if ( n7 > 0) {
					System.out.println("Positivo");
				}
				else {
					System.out.println("Negativo");
				}
			System.out.println("Deseja continuar? S - sim / N - não");
			desejacontinuar = sc.next().charAt(0);
			}
			
		
		System.out.println("_____________________________________________________________________________________");
		
		
		
		
		
		
		
		
		
		
		
		
			

			sc.close();
		}

	}
