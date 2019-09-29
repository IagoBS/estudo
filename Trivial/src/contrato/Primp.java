package contrato;

import java.util.Scanner;

public class Primp {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Numero primo");
		int n = teclado.nextInt();
		if(n/n==1 && n%1 ==0) {
			System.out.println("Esse numero é primo");
		} else  {
			System.out.println("Esse numero não é primo");
		}

	}

}
