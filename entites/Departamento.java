package entites;

public class Departamento {
@Override
	public String toString() {
		return "Departamento [nome=" + nome + "]";
	}

private String nome;

public Departamento(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}


}
