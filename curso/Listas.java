package curso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Iago"); // 1
		list.add("Sophie");// 2
		list.add("Igor");// 3
		list.add("Vóeliza");// 4
		list.add("Jorda");// 5
		list.add("Célio");// 6
		list.add(6, "Eliza");
		// ------------------------------------------------------------------------
		System.out.println("-----------------------------------------------------------------------");
		for (String x : list) {
			System.out.println(x);

		}
		System.out.println("Como faço para ver o tamanho da lista?");
		System.out.println(list.size());
		System.out.println("Como que eu faço para remover um elemento da lista?");
		list.remove("Sophie");

		for (String y : list) {
			System.out.println(y);
		}
//------------------------------------------------------------------------
		System.out.println("-----------------------------------------------------------------------");

		System.out.println("Remover todo mundo que começa com a letra I");
		list.removeIf(x -> x.charAt(0) == 'I');
		for (String y : list) {
			System.out.println(y);
		}
//------------------------------------------------------------------------
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("O índice da lista é:");
		System.out.println("O índice de Celio é: " + list.indexOf("Célio"));
		System.out.println("O índice de VóEliza é: " + list.indexOf("Vóeliza"));
		System.out.println("O índice de Jorda é: " + list.indexOf("Jorda"));
		System.out.println("O índice de Eliza é: " + list.indexOf("Eliza"));
		
		//------------------------------------------------------------------------
		
		System.out.println("Se eu quisesse imprimir os nomes apenas com as letras iniciadas com C");
		System.out.println("-----------------------------------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		
		for (String y : result) {
			System.out.println(y);
		}
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Quando eu quiser imprimir uma String com a primeira letra que aparecer");
		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
		
	}

}
