package contrato;

import java.util.Scanner;

public class HDescobrir {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double n = teclado.nextDouble();
	for(int i=1; i<10; i++) {
		System.out.println(1/i + 1/n);
	}
}
}
