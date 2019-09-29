package entites;

public  class SalvandoContas extends Account {
private Double interestRest;
public SalvandoContas() {
	super();
}
public SalvandoContas(Integer numero, String suporte, Double balanco, Double interestRest) {
	super(numero, suporte, balanco);
	this.interestRest = interestRest;
}
public Double getInterestRest() {
	return interestRest;
}
public void setInterestRest(Double interestRest) {
	this.interestRest = interestRest;
}
public void updatebalance() {
	balanco += interestRest * balanco;
}
@Override
public final void  saque(Double montante) {
	balanco -= montante;
}








}
