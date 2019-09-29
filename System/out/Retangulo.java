package System.out;

import java.util.Scanner;

import entites.Retengulo;

public class Retangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Retengulo retiangulo = new Retengulo();
		System.out.print("Informe a altura do retangulo: ");
		retiangulo.altura = teclado.nextDouble();
		System.out.print("Informe a largura do retangulo");
		retiangulo.largura = teclado.nextDouble();
		System.out.println("=========================================");
		System.out.println("A área desse retangulo é: " + retiangulo.Area());
		System.out.println("O perimetro desse retangulo é: " + retiangulo.perimetro());
		System.out.println("As diagonais desse retangulo é: " + retiangulo.diagonal());
		
		
		
		
teclado.close();
	}

}
