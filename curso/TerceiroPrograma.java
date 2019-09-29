package curso;

public class TerceiroPrograma {

	public static void main(String[] args) {
		double a;
		float b;
		a = 5.0;
		b = (int)a;
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a-b);
		System.out.println(a - (b * 2));
		System.out.println((int)a*b/3 + "  sua média do curso");
	 //compativeis ou não
		int c, d;
		double result;
		c = 5;
		d = 2;
	String s = "3";
		result =  c/d;
		System.out.println(result);
		result = Double.parseDouble(s);
		System.out.println(s);
		result = (c+d)*5;
		System.out.println(result);
	}

}
