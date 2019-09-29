package curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entites.Empresa;

public class FazendoEmpresa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		List<Empresa> empresa = new ArrayList<>();
		System.out.print("Quantos funcionarios tem nessa empresa: ");
		int n = teclado.nextInt();
		for(int i = 0; i< n; i++ ) {
			teclado.nextLine();
			System.out.print("Escreva o id: ");
			int id = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Escreva o nome: ");
			String nome = teclado.next();
			teclado.nextLine();
			System.out.print("Escreva o salario do funcionario: ");
			double salario = teclado.nextDouble();
			empresa.add(new Empresa(id, nome, salario)) ;
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Insira o id do funcionario que terá o salario"
				+ "aumentado: ");
		int id = teclado.nextInt();
	Empresa emp = empresa.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("Esse id não existe");
		} else {
			System.out.println("Escreva a porcetagem");
			double porcentagem = teclado.nextDouble();
			emp.aumentarsalario(porcentagem);
		}
		
	
		for (Empresa x : empresa) {
			System.out.println(empresa);
		}
	
		
		
		
		
		
		teclado.close();

	}

}
