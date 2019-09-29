package curso;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioJavaBasico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);
	int  largura = teclado.nextInt();
	int altura = teclado.nextInt();
	int area = largura * altura;
	System.out.println("Escreva a largura do terreno:");
	System.out.println("Escreva a largura do terrreno " +largura);
	System.out.println("Escreva a altura do terreno "+altura);
	System.out.println("A área  do terreno é: "+ area);
teclado.close();
	}

}
