package curso;

import java.util.Scanner;

public class LerNotas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero de um a dez");
		int nota1  = teclado.nextInt();
		System.out.println("Digite um numero de um a dez");
		int nota2 = teclado.nextInt();
		System.out.println("A  média que esse aluno tirou foi " +(nota1+nota2)/2 +" pontos");
		
teclado.close();
	}

}
