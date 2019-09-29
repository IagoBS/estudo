package contrato;

public class Matrix2 {
public static void main(String[] args) {
	String[][] mat = new String[14][3];
	int maismar =0;
	int ncoluna=0;
	int marcol=0;
	mat[1][2] = "x";
	mat[1][1] = "x";
	mat[3][2] = "x";
	mat[4][2] = "x";
	
	for(int j=0; j<3; j++) {
		marcol =0;
		for(int i=0; i<14; i++) {
			if(mat[i][j] == "x") {
				marcol++;
			}
		}
		if(marcol>maismar) {
			maismar=marcol;
			ncoluna = j;
			
		}
	}
	System.out.println("Coluna mais marcada é: " + ncoluna);
	System.out.println("Quantidade de marcações: " + maismar);
	
	
}
}
