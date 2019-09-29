package curso;

public class TiposString {
public static void main(String[] args) {
	String escrita = "         ABC SUPERMERCADO abcd BH SUPERMERCADO abc efg        ";
	String tolowercase = escrita.toLowerCase();
//	o .toLowerCase(), que foi representado pela variavel tolowercase
//	imprime todas as letras da variavel String para letras minusculas;
	String toupcase = escrita.toUpperCase();
//	O .toUpperCase, que foi representado pela variavel toupcase
//	imprime todas as letras da variavel String para letras minusculas
	String trim = escrita.trim();
	// o trim, que foi representado pela variavel trim, imprime todas as letras
//	da String sem espaço em branco no final
	String stringsub = escrita.substring(10);
//	A subString que foi representado pela variavel stringsub, imprime as letras
// 	que tiverem no seu argumento 
	String subsling = escrita.substring(10, 16);
//	Recorta as letras da String de acordo com os parametros
	String replaca = escrita.replace('S', 'X');
	int i  = escrita.indexOf("bc");
	int a  = escrita.lastIndexOf("bc");
	System.out.println(escrita);
	System.out.println(tolowercase);
	System.out.println(toupcase);
	System.out.println(trim);
	System.out.println(stringsub);
	System.out.println(subsling);
	System.out.println(replaca);
	System.out.println(i);
	System.out.println(a);
	
}
}
