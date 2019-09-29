package curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entites.Pagamento;
import entites.PagamentoTerceirizado;

public class ProgramaDePagamentos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	System.out.println("Escreva o número de funcionarios");
	int n = teclado.nextInt();
	List<Pagamento> lista = new ArrayList<>();
	for(int i=0; i<n; i++) {
		System.out.println("O funcionario #" + n + "é terceirizado y/n");
		char ch = teclado.next().charAt(0);
		System.out.println("Escreva o nome");
		teclado.nextLine();
		String nome = teclado.nextLine();
		System.out.println("Horas"); 
		int  horas = teclado.nextInt();
		System.out.println("Valor por hora");
		double valorporhora = teclado.nextDouble();
		if(ch == 'y') {
		 System.out.println("Ele  recebe um valor adicional");
		 double adicional = teclado.nextDouble();
		 PagamentoTerceirizado pagamento = new PagamentoTerceirizado(nome, horas, valorporhora, adicional);
		 lista.add(pagamento);
		} else if(ch == 'n') {
			System.out.println("Ele não recebe um valor adicional");
			Pagamento pagamento = new Pagamento(nome, horas, valorporhora);
			lista.add(pagamento);
			System.out.println(pagamento);
		} else if( ch != 'n' && ch!= 'y') {
		System.out.println("esse funcionario não existe");
		}
		
		
	}
	for(Pagamento c: lista) {
		System.out.println("Nome " +c.getNome() + " pagamento "+ c.pagamento());
	}

	}

}
