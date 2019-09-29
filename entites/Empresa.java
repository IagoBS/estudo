package entites;

public class Empresa {
@Override
	public String toString() {
		return "Empresa [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
private Integer id;
private String nome;
private Double salario;
public Empresa(Integer id, String nome, Double salario) {
this.id = id;
this.nome = nome;
this.salario = salario;
}
public Integer getId() {
	return id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Double getSalario() {
	return salario;
}
public void aumentarsalario(double porcetagem ) {
	salario += salario * porcetagem/100;
}
public void diminuirsalario(double porcetagem) {
	salario -= salario * porcetagem/100;
}



}
