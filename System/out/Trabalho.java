package System.out;

import java.util.Scanner;

import entites.Funcionario;

public class Trabalho {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
System.out.println("Escreva o nome do funcionario");
funcionario.nome = teclado.next();
System.out.println("Escreva seu salario bruto");
funcionario.salariobruto = teclado.nextDouble();
System.out.println("O imposto pago pelo empresario: ");
funcionario.imposto = teclado.nextDouble();
System.out.println("Salario liquido" + funcionario.salarioliquido());
funcionario.aumentodesalario(50); 
System.out.println("O salario do funcionario aumentou!!! agora é: " + funcionario.salariobruto);
System.out.println("O salario liquido do funcionario é " +funcionario.salarioliquido());




teclado.close();
}
}