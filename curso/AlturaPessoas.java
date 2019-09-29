package curso;

import java.util.Scanner;

public class AlturaPessoas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		double[] vect = new double[n];
		for(int i = 0; i<n; i++) {
		vect[i] = teclado.nextDouble();
		}
	double soma = 0.0;
	for(int i = 0; i<n; i++) {
		soma += vect[i];
	}
	double media = soma /n;
	System.out.println("A media de todo mundo é:  " + media);
	
		
		
		
		
		
		
		
		
		
		
				teclado.close();
	}

}
