
public class Lutador {
private String nome;
private String nacionalidade;
private int idade;
private double altura;
private double peso;
private String categoria;
private int vitoria;
private int derrotas; 
private int empates;
public Lutador() {
	
}
public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, String categoria, int vitoria,
		int derrotas, int empates) {
	this.nome = nome;
	this.nacionalidade = nacionalidade;
	this.idade = idade;
	this.altura = altura;
	this.setPeso(peso);
	this.categoria = categoria;
	this.vitoria = vitoria;
	this.derrotas = derrotas;
	this.empates = empates;
}




public String getNome() {
	return nome;
}




public void setNome(String nome) {
	this.nome = nome;
}




public String getNacionalidade() {
	return nacionalidade;
}




public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;
}




public int getIdade() {
	return idade;
}




public void setIdade(int idade) {
	this.idade = idade;
}




public double getAltura() {
	return altura;
}




public void setAltura(double altura) {
	this.altura = altura;
}




public double getPeso() {
	return peso;
	
}




public void setPeso(double peso) {
	this.peso = peso;
	this.setCategoria();
}




public String getCategoria() {
	return categoria;
}




public void setCategoria() {
	while(!(this.peso== 0)) {
		if(this.peso <= 50) {
			this.categoria  ="peso leve";
		} else if(this.peso <= 70) {
			this.categoria  ="peso medio";
		} else if(this.peso <= 120.2) {
			this.categoria  ="peso pesado";
		} else {
			this.categoria  ="ERRO 404 not foud";
		}
	}
	
}




public int getVitoria() {
	return vitoria;
}




public void setVitoria(int vitoria) {
	this.vitoria = vitoria;
}




public int getDerrotas() {
	return derrotas;
}




public void setDerrotas(int derrotas) {
	this.derrotas = derrotas;
}




public int getEmpates() {
	return empates;
}




public void setEmpates(int empates) {
	this.empates = empates;
}




public void apresentar() {
	System.out.print("Nome: " + this.nome+ 
			         " idade: " + this.idade +
			         	"altura:" + this.altura +
			         	"peso: " + this.peso);
}
public void status() {
	System.out.print("vitorias: " + this.vitoria +
					"derrotas: " + derrotas +
						"empates: " + this.empates);
}
public void empatarluta() {
	setEmpates(getEmpates() + 1);
}
public void perderluta() {
	setDerrotas(getDerrotas() + 1);
}
public void ganharluta() {
	setVitoria(getVitoria() + 1); 
}




@Override
public String toString() {
	return "Lutador [nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", altura=" + altura
			+ ", peso=" + peso + ", categoria=" + categoria + ", vitoria=" + vitoria + ", derrotas=" + derrotas
			+ ", empates=" + empates + "]";
}






}
