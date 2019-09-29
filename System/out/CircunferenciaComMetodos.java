package System.out;

import java.util.Scanner;

import entites.Calculator;

public class CircunferenciaComMetodos {
	


	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			Calculator calc = new Calculator();
			
			System.out.println("Entre com o valor do raio");
			double raio = teclado.nextDouble();
			System.out.println("digite o valor do diametro");
			double diametro = teclado.nextDouble();
			double c = calc.circuferencia(raio);
			double v = calc.volume(raio);
			
			System.out.println("circuferencia " + c);
			System.out.println("Volume " + v);
			System.out.println("Pi "  + calc.PI);
			
			teclado.close();

	}
	}
	

