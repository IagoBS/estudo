package curso;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escreva o valor de a: ");
		int a = teclado.nextInt();
		System.out.print("Escreva o valor de b: ");
		int b = teclado.nextInt();
		System.out.print("Escreva o valor de c: ");
		int c = teclado.nextInt();
		double delta = (b*b) - (4*a*c); // calculo do valor de delta.
		System.out.println("O valor de delta é igual a " + delta);
		double x1 = (-b + Math.sqrt(delta))/2*a;
		double x2 = (-b - Math.sqrt(delta))/2*a;
		System.out.println("x' vale: "  +x1);
		System.out.println("x'' vale: "+ x2);
		teclado.close();

	}

}
