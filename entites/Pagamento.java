package entites;

public class Pagamento {
private String nome;
protected Integer horas;
protected Double valorDehoras;
public Pagamento() {
	
}
public Pagamento(String nome, Integer horas, Double valorDehoras) {
	this.nome = nome;
	this.horas = horas;
	this.valorDehoras = valorDehoras;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Integer getHoras() {
	return horas;
}
public void setHoras(Integer horas) {
	this.horas = horas;
}
public Double getValorDehoras() {
	return valorDehoras;
}
public void setValorDehoras(Double valorDehoras) {
	this.valorDehoras = valorDehoras;
}
public double pagamento() {
	return horas * valorDehoras;
}
@Override
public String toString() {
	return "Pagamento [nome=" + nome + ", horas=" + horas + ", valorDehoras=" + valorDehoras + "]";
}







}
