package System.out;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Enter number");
		double n = teclado.nextDouble();
		while(n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.println(sr);
			System.out.println("Enter another number ");
			n = teclado.nextDouble();
			
		}
			
		
		System.out.println("Negative number");

	}

}
