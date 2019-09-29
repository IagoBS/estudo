package contrato;

import java.util.Scanner;

public class Vetores2 {
public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	int[] vetor = new int[100];
	
	for(int i=0; i<100; i++) {
	if(i%2==0) {
		vetor[i] = 1;

	} else if(i%2==1) {
		vetor[i] = 0;
		
		
	}
	int numero = vetor[i];
	System.out.println(numero);
	
	}

	
	}
}
