package System.out;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	int a = teclado.nextInt();
	int	b = teclado.nextInt();
	int	c = teclado.nextInt();
		int heigher = max(a, b, c);
		showresult(heigher);
		
		teclado.close();
	}
	public static int max(int x, int y, int z) {
		int aux;
	 if (x>y && x>z) {
		 aux = x;
	 } else if (y > z) {
		 aux = y;
	 } else {
		 aux = z;
	 }
	 return aux;
	}
	public static void showresult(int value) {
		System.out.println("O maior valor entre esses três numeros é " +value);
		
	}
	

}
