package entites;

public class PagamentoTerceirizado extends Pagamento {
private Double adicionar;
public PagamentoTerceirizado() {
	super();
}
public PagamentoTerceirizado(String nome, Integer horas, Double valorDehoras, Double adicionar) {
	super(nome, horas, valorDehoras);
	this.adicionar = adicionar;
}
public Double getAdicionar() {
	return adicionar;
}
public void setAdicionar(Double adicionar) {
	this.adicionar = adicionar;
}
	@Override
	public double pagamento() {
		return horas * valorDehoras * 1.1;
	}



}
