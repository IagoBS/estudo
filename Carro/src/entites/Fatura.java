package entites;

public class Fatura {
	private  Double pagamentobasico;
	private  Double taxa;
	public Fatura() {
		
	}
	public Fatura(Double pagamentobasico, Double taxa) {
		super();
		this.pagamentobasico = pagamentobasico;
		this.taxa = taxa;
	}
	public Double getPagamentobasico() {
		return pagamentobasico;
	}
	public void setPagamentobasico(Double pagamentobasico) {
		this.pagamentobasico = pagamentobasico;
	}
	public Double getTaxa() {
		return taxa;
	}
	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double pagamentoTotal() {
		return getPagamentobasico() + getTaxa();
		
	}
	
}
