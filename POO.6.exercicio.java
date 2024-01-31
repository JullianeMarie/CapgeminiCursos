package capgeminiProjeto;

public class Invoice {

	private int numeroItemFaturado;
	private String descricaoItem;
	private int qtdeComprada;
	private double precoUnitario;
	
	public Invoice(int numeroItemFaturado, String descricaoItem, int qtdeComprada, double precoUnitario) {
		this.numeroItemFaturado = numeroItemFaturado;
		this.descricaoItem = descricaoItem;
		this.qtdeComprada = qtdeComprada;
		this.precoUnitario = precoUnitario;
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
		this.qtdeComprada = qtdeComprada;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public String toString() {
		return "\nNúmero item: " + this.numeroItemFaturado + 
		           "\nDescrição do item: " + this.descricaoItem + 
		           "\nQuantidade comprada: " + this.qtdeComprada + 
		           "\nPreço unitário: " + this.precoUnitario;
	}
	
}

__________________________________________________________________________________________

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
			*/
		
		Invoice fatura = new Invoice(15, "SmartTv", 30, 2500.00);
		System.out.println("***Fatura Item***");
		System.out.println();
		System.out.println(fatura.toString());
	
	sc.close();

	}

}

/*
***Fatura Item***


Número item: 15
Descrição do item: SmartTv
Quantidade comprada: 30
Preço unitário: 2500.0


 */