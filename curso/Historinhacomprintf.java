package curso;

public class Historinhacomprintf {

	public static void main(String[] args) {
		String protuto1 = "Computador";
		String produto2 = "Tablet";
		int age = 30;
		int code = 300;
		char sexo = 'f';
		double price1 = 21.00;
		double price2 = 10.00;
		double measure = 2.0;
		System.out.printf("A muito antigamente, em um reino muito distante%n");
		System.out.printf("Um mercador passa na rua vendendo um %s", protuto1);
		System.out.printf(" e um %s", produto2);
		System.out.printf("%nO computador custava %d e o tablet custava %d", age, code);
		System.out.printf("%nQuando de repente um ladrão saltou e roubou os itens no qual vendia ");
		System.out.printf("Por isso ele teve que %n pagar  ao fornercedor pelo computador %.2f e pelo tablet %.2f reais, %n como multa pelo vacilo", price1, price2);
		

	}

}
