package entites;

public class Triangle {
public double a;
public double b;
public double c;
public double area() {
	double p = (a+b+c)/2;
    return Math.sqrt(p*(p-a) * (p-b) * (p-c));
	
}
public double perimetro() {
	double perimetro = (a+b+c);
	return perimetro;
}
public boolean equilatero() {
	boolean equilatero = false;
	if(a==b && b ==c && c==a) {
		equilatero = true;
	}
	return equilatero;
	
}
public boolean isoseceles() {
	boolean isoseceles = false;
	if(a==b && c!= b) {
		isoseceles = true;
	}
	return isoseceles;
}
public boolean escaleto() {
	boolean escaleno = false;
	if(a!=b && b!=c && a!=c) {
	 escaleno = true;
	}
	return escaleno;
}
}
