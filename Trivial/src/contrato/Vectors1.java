package contrato;

import java.util.Scanner;

public class Vectors1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
int[] vetor = new int[10];
double soma=0, media =0;
int notaacima =0;

for(int i=0; i<10; i++) {
 vetor[i] = teclado.nextInt();
 soma += vetor[i];
 media = soma/10; 
 if (vetor[i] > media) {
	 notaacima++;
 }
}

System.out.println("A media da turma foi " + media + " e os alunos que ficaram"
		+ " acima da media foram: " + (notaacima + 1) );

	}
}

