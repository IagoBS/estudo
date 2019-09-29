package entites;

public class ViagemNaPousada {
private String nome;
private String email;
private int  numero;
public ViagemNaPousada(String nome, String email, int numero) {
	this.nome = nome;
	this.email = email;
	this.numero = numero;
}
public ViagemNaPousada(String nome, String email) {
	this.nome = nome;
	this.email = email;
}



public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String toString() {
	return nome+","+email;
}



}
