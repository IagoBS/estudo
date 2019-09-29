package contrato;

import java.util.Scanner;

public class Matriz3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
		int[][] mat = new int[5][5];
		int[][] mat2 = new int[5][5];
		int[][] mat3 = new int[5][5];
		int[][] mat4 = new int[5][5];
		
		int i = 1;
		int j = 0;
		
		while (i <= 5) {
j=1;
while(j<=5) {
	mat[i][j] = 1;
	mat2[i][j] = 1;
	mat3[i][j] = mat[1][1]+mat2[1][1];
	j++;
	
}
i++;
		}
		j=1;
		while (j<=5) {
			i=1;
			while (i<=5) {
				System.out.println(mat3[i][j]);
				i++;
			}
			j++;
 		}
	}

}
