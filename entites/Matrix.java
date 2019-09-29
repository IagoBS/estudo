package entites;

public class Matrix {

	public static void main(String[] args) {
		int[][] mat = new int[3][3];
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				a[i][j] = i; 
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				b[i][j] = 1; 
			}
		}
		//laço para calcular a multiplicação de a por b
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				c[i][j] = 1;
				for(int k=0; k<4; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j]; 
				}
			}
			
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
			System.out.println(c[i][j]);
		}
		}
	}

}
