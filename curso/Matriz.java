package curso;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			int n = teclado.nextInt();
			int[][] matriz = new int [n][n];
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matriz[i][j] = teclado.nextInt();
			
			}
		}
		System.out.println("A diagonal principal");
		for(int i=0; i<n; i++) {
			System.out.println(matriz[i][i]);
		}
		System.out.println("Como faço para ver os números negativos");
		int contarnegativos = 0;
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(matriz[i][j] < 0 ) {
					contarnegativos++;
				}
			}
		}
		System.out.println("Os números negativos são " + contarnegativos);
		int contarpositivos = 0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz.length;j++) {
				if(matriz[i][j]>0) {
					contarpositivos++;
				}
			}
		}
		System.out.println("Os números positivos são " + contarpositivos);
		System.out.println("-----------------------------------");
		System.out.println("Informar o número de colunas");
		int quantidade_de_colunas_na_matriz = 0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz[i].length;j++) {
				quantidade_de_colunas_na_matriz++;
			}
		}
		System.out.println("A quantidade de colunas na matriz é: " + quantidade_de_colunas_na_matriz);
		
		teclado.close();
	}
}
