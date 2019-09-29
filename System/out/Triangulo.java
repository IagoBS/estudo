package System.out;

import java.util.Scanner;

import entites.Triangle;

public class Triangulo {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("-----------------------------------------------");
		System.out.print("Informe o angulo do triangulo1: ");
		x.a = teclado.nextDouble();
		System.out.print("Informe o angulo do triangulo1: ");
		x.b = teclado.nextDouble();
		System.out.print("Informe o angulo do triangulo1: ");
		x.c = teclado.nextDouble();
		System.out.println("-----------------------------------------------");
		System.out.print("Informe o angulo do triangulo2: ");
		y.a = teclado.nextDouble();
		System.out.print("Informe o angulo do triangulo2: ");
		y.b = teclado.nextDouble();
		System.out.print("Informe o angulo do triangulo2: ");
		y.c = teclado.nextDouble();
		System.out.println("-----------------------------------------------");
		double p = (x.a + x.b + x.c)/2;
		double p2 = (y.a + y.b + y.c)/2;
		System.out.println("O valor de p do triangulo é igual a:" + p);
		System.out.println("O valor de p2 do triangulo é igual a: " + p2);
		double area1 = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		double area2 = Math.sqrt(p2*(p2-y.a)*(p2-y.b)*(p2-y.c));
		System.out.println("A area do tringulo 1 é igual a:" + area1);
		System.out.println("A area do triangulo 2 é igual a: " + area2);
		System.out.println("---------------------------------------------");
//		de um jeito muito mais facil de se fazer
		double areaX = x.area();
		double Areay = y.area();
		System.out.println("A area do triangulo pelo metodo "+areaX);
		System.out.println("A area do triangulo pelo metodo " + Areay);
		teclado.close();
		System.out.println("O ṕerimetro do triangulo x é: " +x.perimetro());
		System.out.println("O perimetro do triangulo y  é: " +y.perimetro());
		System.out.println("---------------------------------------------------");
		System.out.println("Esse triangulo é Equilátero? " + x.equilatero());
// Todos os lados são iguais.
		System.out.println("Esse triangulo é isoseles? " + x.isoseceles());
//		Tem dois lados iguais e um diferente. 
//	 O lado desigual é, em geral, utilizado como referência de base.
		System.out.println("Esse triangulo é escaleno? " + x.escaleto());
//		Nenhum dos lados é igual
		System.out.println("------------------------------------------------------");
		System.out.println("Esse triangulo é Equilátero? " + y.equilatero());
		// Todos os lados são iguais.
		System.out.println("Esse triangulo é isoseles? " + y.isoseceles());
//		Tem dois lados iguais e um diferente. 
//	 O lado desigual é, em geral, utilizado como referência de base
		System.out.println("Esse triangulo é escaleno? " + y.escaleto());
//		Nenhum dos lados é igual
		
		
		
	}

}
