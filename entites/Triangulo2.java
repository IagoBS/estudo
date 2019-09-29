package entites;

import java.util.Scanner;

public class Triangulo2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.print("Informe o angulo do triangulo1: ");
		double xA = teclado.nextDouble();
		System.out.print("Informe o angulo do triangulo1: ");
		double xB = teclado.nextDouble();
		System.out.print("Informe o angulo do triangulo1: ");
		double xC = teclado.nextDouble();
		System.out.println("-----------------------------------------------");
		System.out.print("Informe o angulo do triangulo2: ");
		double yA = teclado.nextDouble();
		System.out.print("Informe o angulo do triangulo2: ");
		double yB = teclado.nextDouble();
		System.out.print("Informe o angulo do triangulo2: ");
		double yC = teclado.nextDouble();
		System.out.println("-----------------------------------------------");
		
		double p = (xA + xB + xC)/2;
		double p2 = (yA + yB + yC)/2;
		
				System.out.println("O valor de p do triangulo é igual a:" + p);
				System.out.println("O valor de p2 do triangulo é igual a: " + p2);
		double area1 = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		double area2 = Math.sqrt(p2*(p2-yA)*(p2-yB)*(p2-yC));
		System.out.println("A area do tringulo 1 é igual a:" + area1);
		System.out.println("A area do triangulo 2 é igual a: " + area2);
		if (area1 >= area2 ) {
			System.out.println("A area 1 é maior do que a área 2");
		} else {
			System.out.println("A area 2 é maior do que a area 1");
		}
		teclado.close();

	}

}
