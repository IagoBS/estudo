package curso;

import java.util.Scanner;

import entites.ArrayClass;

public class Veto2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quantos produtos que são?");
		int n = teclado.nextInt();
		ArrayClass[] vect = new ArrayClass[n];
		for(int i =0;i<vect.length; i++) {
			teclado.nextLine();
			String nome = teclado.next();
			double preco = teclado.nextDouble();
			vect[i] = new ArrayClass(nome, preco);
		}
		double soma = 0.0;
		for(int i = 0; i<vect.length; i++) {
			soma += vect[i].getPreco();
		}
		double media = soma/vect.length;
		System.out.println(media);
	
		
		
		
		
		
		
		teclado.close();

	}

}
