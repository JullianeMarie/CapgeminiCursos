package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);// Vírgula informa erro.
		Scanner sc = new Scanner(System.in);

		/*
		 * 35.Faça um algoritmo que calcule o valor da conta de luz de uma pessoa.
		 * Sabe-se que o cálculo da conta de luz segue a tabela abaixo: Tipo de Cliente
		 * Valor do KW/h a. (Residência) 0,60; b. (Comércio) 0,48; Curso de Lógica para
		 * Programação III Instrutor: Marcio Michelluzzi c. (Indústria) 1,29.
		 */
		System.out.println("Informe o tipo de cliente");
		System.out.println("1- Residência");
		System.out.println("2- Comércio");
		System.out.println("3- Indústria");
		int tipoCliente = sc.nextInt();

		switch (tipoCliente) {

		case 1:
			System.out.println("Residência");
			break;
		case 2:
			System.out.println("Comércio");
			break;
		case 3:
			System.out.println("Indústria");
		default:
			System.out.println("Tipo inválido");
			break;

		}

		System.out.println("Informe as horas totais ");
		int horasMensais = sc.nextInt();

		if (tipoCliente == 1) {
			double valorConsumo = horasMensais * 0.60;
			System.out.println("Valor Consumo: R$ " + String.format("%.2f", valorConsumo));
		} else 
			if (tipoCliente == 2) {
			double valorConsumo = horasMensais * 0.48;
			System.out.println("Valor Consumo: R$ " + String.format("%.2f", valorConsumo));
		} else 
			if (tipoCliente == 3) {
			double valorConsumo = horasMensais * 1.29;
			System.out.println("Valor Consumo: R$ " + String.format("%.2f", valorConsumo));
		}

		sc.close();

	}

}

/*
 * CONSOLE: 
 * Informe o tipo de cliente 
 * 1- Residência 
 * 2- Comércio 
 * 3- Indústria 
 * 1
 * Residência 
 * Informe as horas totais 
 * 400 
 * Valor Consumo: R$ 240.00
 * 
 */