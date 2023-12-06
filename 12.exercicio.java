package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);
		
		/* 12- O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor. 
		 * E dos impostos aplicados: 
		 * Primeiro os impostos são aplicados sobre o custo de fábrica, 
		 * E depois o percentual do distribuidor sobre o resultado. 
		 * Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, 
		 * Escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;*/
		
		
		System.out.print("Informe o valor de tabela de Fábrica:");
		double valorFabrica = sc.nextDouble();
		double impostoFabrica = valorFabrica * 0.45;
		double totalFabrica = valorFabrica +  impostoFabrica;
		System.out.printf("Correção 45%% de impostos:  R$ %.2f%n" ,impostoFabrica);
		System.out.printf("Valor total Fábrica com correção R$ %.2f%n" ,totalFabrica);
		double impostoDistribuidor = totalFabrica * 0.28;
		double totalConsumidor = totalFabrica + impostoDistribuidor;
		System.out.printf("Correção 28%% de impostos:  R$ %.2f%n" ,impostoDistribuidor);
		System.out.printf("Valor consumidor com ajuste distribuidor: R$ %.2f%n", totalConsumidor);
		
		
		
	sc.close();
	
		}
	}
/*CONSOLE
Informe o valor de tabela de Fábrica:25000
Correção 45% de impostos:  R$ 11250.00
Valor total Fábrica com correção R$ 36250.00
Correção 28% de impostos:  R$ 10150.00
Valor consumidor com ajuste distribuidor: R$ 46400.00*/

