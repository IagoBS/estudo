package curso;

import java.util.Scanner;

import entites.ViagemNaPousada;

public class Pousada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantos quartos foram alugados");
		int n = teclado.nextInt();
		ViagemNaPousada[] vect = new ViagemNaPousada[n];
		for(int i=0; i<n; i++) {
			String nome = teclado.next();
			String email = teclado.next();
			int numero = teclado.nextInt();
			vect[i] = new ViagemNaPousada(nome, email, numero);
		}
		for(int i =0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
			
		}
		
		
		
		
		
		
		
		teclado.close();
		

	}

}
