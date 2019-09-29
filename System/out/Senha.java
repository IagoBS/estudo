package System.out;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bem vindo Iago, digite sua  senha");
		int senha = teclado.nextInt();
		String login = "Iago";
		while(senha != 2002) {
			System.out.println("senha invalida, tente novamente: ");
			senha = teclado.nextInt();
		}
		if(senha == 2002) {
			System.out.println("Acesso permitido");
		}
		
		

	}

}
