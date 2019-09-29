package entites;

public class Obanco {
	private String nome;
	private int numero;
	private double balanco;

	public Obanco(String nome, int numero, double balanco) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.balanco = balanco;
	}

	public Obanco(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public double getBalanco() {
		return balanco;
	}

	public void setBalanco(double balanco) {
		this.balanco = balanco;
	}

	public void deposito(double montante) {
		balanco += montante;

	}

	public void tirar(double montante) {
		balanco -= montante + 5;
	}

public String ToString() {
	return ("Nome "+nome+",numero:"+numero+"montante:"+String.format("%.2f", balanco));
}

}
