package System.out;

import java.util.Scanner;

import entites.Precodolar;

public class Dolar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o preço do dolar?");
		System.out.println(Precodolar.DOLAR); 
		System.out.println("O valor em dolar em R$ é: ");
		System.out.println("20 dolar é R$ " +Precodolar.conversor(20));
		
		
	}

}
