package curso;

import java.util.Locale;

public class SaidadeDados {

	public static void main(String[] args) {
		char gender = 'F';
		int age = 32;
		double balance = 10.14;
		String nome = "Maria";
		System.out.println("Bom dia");
		System.out.println("Boa tarde");
		System.out.println("Boa noite");
		System.out.printf("%.4f%n", balance);
		System.out.printf("%.2f%n", balance);
		Locale.setDefault(Locale.US);
		System.out.println("------------------------------------------");
		System.out.print(nome +" tem 32 anos "+ "e tem no banco R$ " + balance);
		System.out.printf("%n%s tem 32 anos e tem no banco  R$ %.2f %n", nome, balance);

	}

}
