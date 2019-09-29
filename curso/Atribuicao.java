package curso;

public class Atribuicao {

	public static void main(String[] args) {
		double n1 = 10, n2 = 30;
		String s = "ABC";
		System.out.println("----------------");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		 
		
		System.out.println("----------------");
		n1 += 2;
	    n2 += 2;
	    System.out.println(n1);
		System.out.println(n2);
		System.out.println("----------------");
		n1 *= 2;
	    n2 *= 2;
	    System.out.println(n1);
		System.out.println(n2);
		System.out.println("----------------");
	   s += " Supermercado";
	   System.out.println(s);
	   System.out.println("----------------");
	   int a = 10;
	   int b = ++a;
	   
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(b);
	   
	}

}
