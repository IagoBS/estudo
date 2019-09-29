package curso;

import java.util.Scanner;

public class LerMatriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int m = teclado.nextInt();
		int[][] matriz = new int[n][m];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				matriz[i][j] = teclado.nextInt();
			}
		}
		int x = teclado.nextInt();
		for(int i=0; i< matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Posição " + i + "posição " + j);
				} else if (j>0) {
					System.out.println("Left: " + matriz[i][j-1]);
				} else if (i > 0) {
					System.out.println("Up" + matriz[i-1][j]);
				} else if (j > matriz[i].length-1) {
					System.out.println("Right" + matriz[i][j+1]);
				} else if (i < matriz.length-1) {
					System.out.println("Down" + matriz[i+1][j]);
				}
				
			}
		}
		

	}

}
