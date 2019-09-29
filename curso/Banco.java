package curso;

import java.util.Scanner;

import entites.Obanco;

public class Banco {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
			System.out.println("Informe o seu nome:");
			String nome = teclado.next();
			System.out.println("Informe o número da sua conta");
			int numero = teclado.nextInt();
			System.out.println("Informe seu balanco:");
			double balanco = teclado.nextDouble();
			Obanco banco = new Obanco(nome,numero,balanco);
			System.out.print(banco);
			
			
			teclado.close();
		
 
	}

}
