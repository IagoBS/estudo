package curso;

import java.util.Scanner;

public class Scaneament {
public static void main(String[] args) {
 Scanner escreva = new Scanner(System.in);
String setenca = escreva.nextLine();
String x, y, z;
x = escreva.next();
y = escreva.next();
z = escreva.next();
System.out.println("escreva qualquer coisa aí");
System.out.println(setenca);
System.out.println("==========================");
System.out.println("Escreva seu nome: ");
System.out.println(x);
System.out.println("==========================");
System.out.println("Escreva a sua idade: ");
System.out.println(y);
System.out.println("==========================");
System.out.println("Yes or No:");
System.out.println(z);
 escreva.close();
}
}
