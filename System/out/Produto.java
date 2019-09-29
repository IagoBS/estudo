package System.out;

import java.util.Scanner;

import entites.Produto2;

public class Produto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto2 product = new Produto2();
		System.out.println("-------------------------------------");
		System.out.println("Name");
		product.produto = teclado.nextLine();
		System.out.println("Informe o preço");
		product.preco = teclado.nextDouble();
		System.out.println("Informe a quantidade de produtos");
		product.quantidade = teclado.nextInt();
		product.totaldevaloresnoestoque();
		System.out.printf("nome do produto: "+product.produto+ "%n"+"valor do produto: " +"R$"+product.quantidade+"%n"+ "Total de produtos: " + product.totaldevaloresnoestoque()+"%n" );
		System.out.println("=================================================================");
		product.adicionarprodutos(20);
		System.out.println("Como a crise está muita, não se venderam nenhum produto e o estoque só está aumentando ");
		System.out.printf("nome do produto: "+product.produto+ "%n"+"valor do produto: " +"R$"+product.quantidade+"%n"+ "Total de produtos: " + product.totaldevaloresnoestoque()+"%n" );
		System.out.println("------------------------------------------------------------------------");
		System.out.println("As vendas começaram a ficar otimas!!! ");
		product.removerproduto(10);
		System.out.printf("nome do produto: "+product.produto+ "%n"+"valor do produto: " +"R$"+product.quantidade+"%n"+ "Total de produtos: " + product.totaldevaloresnoestoque()+"%n" );
		
		System.out.println(product);
//
		
		
		
		teclado.close();
	}

}
