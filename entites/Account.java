package entites;

public class Account {
private  Integer numero;
private String suporte;
protected Double balanco;
	
	public Account() {
	super();
}
	public Account(Integer numero, String suporte, Double balanco) {
		this.numero = numero;
		this.suporte = suporte;
		this.balanco = balanco;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getSuporte() {
		return suporte;
	}
	public void setSuporte(String suporte) {
		this.suporte = suporte;
	}
	public Double getBalanco() {
		return balanco;
	}
	
	public void saque(Double montante) {
		balanco -= montante + 5.0;
	}
	public void deposito(Double montante) {
		balanco += montante;
	}
	@Override
	public String toString() {
		return "Account [numero=" + numero + ", suporte=" + suporte + ", balanco=" + balanco + "]";
	}
	
	
}

