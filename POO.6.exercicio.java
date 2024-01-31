package capgeminiProjeto;

public class Invoice {
	private int numeroItemFaturado;
	private String descricaoItem;
	private int qtdeComprada;
	private double precoUnitario;

	public Invoice(int numeroItemFaturado, String descricaoItem, int qtdeComprada, double precoUnitario) {
		this.numeroItemFaturado = numeroItemFaturado;
		this.descricaoItem = descricaoItem;
		setQtdeComprada(qtdeComprada);
		setPrecoUnitario(precoUnitario);
	}

	public int getNumeroItemFaturado() {
		return numeroItemFaturado;
	}

	public void setNumeroItemFaturado(int numeroItemFaturado) {
		this.numeroItemFaturado = numeroItemFaturado;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public int getQtdeComprada() {
		return qtdeComprada;
	}

	public void setQtdeComprada(int qtdeComprada) {
		if (qtdeComprada > 0) {
			this.qtdeComprada = qtdeComprada;
		} else {
			this.qtdeComprada = 0;
		}
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		if (precoUnitario > 0.0) {
			this.precoUnitario = precoUnitario;
		} else {
			this.precoUnitario = 0.0;
		}
	}

	public double getInvoiceAmount() {
		return qtdeComprada * precoUnitario;
	}

	@Override
	public String toString() {
		return "\nNúmero item: " + this.numeroItemFaturado + "\nDescrição do item: " + this.descricaoItem
				+ "\nQuantidade comprada: " + this.qtdeComprada + "\nPreço unitário: " + this.precoUnitario;
	}

}

_____________________________________________________________________________________________________________________
package capgeminiProjeto;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		 
		/*6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática 
		 * para representar uma fatura de um item vendido na loja. 
		 * Uma fatura deve incluir as seguintes informações como atributos:
			a. o número do item faturado,
			b. a descrição do item,
			c. a quantidade comprada do item e
			d. o preço unitário do item.
			Sua classe deve ter um construtor que inicialize os quatro atributos. 
			Se a quantidade não for positiva, ela deve ser configurada como 0.
			Se o preço por item não for positivo ele deve ser configurado como 0.0. 
			Forneça os métodos getters e setters para cada variável de instância. 
			Além disso, forneça um método chamado getInvoiceAmount que calcula o valor da fatura 
			(isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um double. 
			Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.
			*/
		
		Invoice fatura = new Invoice(15, "SmartTv", 30, 2500.00);
		System.out.println("***Fatura Item***");
		System.out.println();
		System.out.println(fatura.toString());
		
		System.out.printf("Valor Fatura: %.2f%n", fatura.getInvoiceAmount());
		
		fatura.setQtdeComprada(0);
		fatura.setPrecoUnitario(900.00);
		System.out.println();
		System.out.println("***Fatura Atualizada***");
		System.out.println(fatura.toString());
		System.out.printf("Valor Fatura: %.2f%n", fatura.getInvoiceAmount());
		
		fatura.setQtdeComprada(35);
		fatura.setPrecoUnitario(2100.00);
		System.out.println();
		System.out.println("***Fatura Atualizada***");
		System.out.println(fatura.toString());
		System.out.printf("Valor Fatura: %.2f%n", fatura.getInvoiceAmount());
	
	sc.close();
	
	}
}

/*

***Fatura Item***


Número item: 15
Descrição do item: SmartTv
Quantidade comprada: 30
Preço unitário: 2500.0
Valor Fatura: 75000.00

***Fatura Atualizada***

Número item: 15
Descrição do item: SmartTv
Quantidade comprada: 0
Preço unitário: 900.0
Valor Fatura: 0.00

***Fatura Atualizada***

Número item: 15
Descrição do item: SmartTv
Quantidade comprada: 35
Preço unitário: 2100.0
Valor Fatura: 73500.00


 */