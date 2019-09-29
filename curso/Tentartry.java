package curso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tentartry {

	public static void main(String[] args) {
	metodo2();
	}
	public static void metodo2() {
		System.out.println("Metodo 2 iniciar -");
	Scanner teclado = new Scanner(System.in);
		
		try {
			String[] vetor = teclado.nextLine().split(" ");
			int posicao = teclado.nextInt();
			System.out.println(vetor[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		} 
		catch(InputMismatchException a) {
			System.out.println("Input error");
		}
teclado.close();
	}

}
