package curso;

import java.util.Scanner;

public class Stwithc {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		String dia;
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2: 
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6: 
			dia = "Sexta";
			break;
		case 7: 
			dia = "Sabado";
			break;
		default:
			dia = "Dia inválido, digite novamente ou tente mais tarde";
			
		}
		System.out.println(dia);
		
 
 
	}

}
