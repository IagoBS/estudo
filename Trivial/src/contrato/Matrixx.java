package contrato;

import java.util.Scanner;

public class Matrixx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String[][] mat = new String[14][3];
		mat[1][2] = "x";
		int marlin;
		int maismar=0;
		int njogo =0;
		System.out.println(mat[1][2]);
		for(int i=0; i<14; i++) {
			marlin =0;
			for(int j=0; j<3; j++) {
				if(mat[i][j] == "x") {
					marlin++;
				}
			}
			if(marlin>maismar) {
				maismar= marlin;
				njogo = i;
			}
			
			
		}
		System.out.println("O jogo mais marcado " + njogo);
		System.out.println("A quantidade de marcações foi de: " + maismar);
	}

}
