package contrato;

import java.util.Scanner;

public class Vetores {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	double media;
	int acumulador =0;
	double mediaanualdaturma;
	int contador = 0;
	while(contador<10) {
	media = teclado.nextDouble();
	acumulador +=  media;
	contador++;
	}
	media = acumulador/10;
	System.out.println("A media anual da turma é: "+ media);
	
	
	
}
}
