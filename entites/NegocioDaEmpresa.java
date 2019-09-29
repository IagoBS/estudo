package entites;

public class NegocioDaEmpresa extends Account {
private Double emprestimolimite;
public NegocioDaEmpresa() {
	super();
}
public Double getEmprestimolimite() {
	return emprestimolimite;
}
public void setEmprestimolimite(Double emprestimolimite) {
	this.emprestimolimite = emprestimolimite;
}
public NegocioDaEmpresa(Integer numero, String suporte, Double balanco, Double emprestimolimite) {
	super(numero, suporte, balanco);
	this.emprestimolimite = emprestimolimite;
}
public void emprestimo (Double montante) {
  if(montante <= emprestimolimite) {
	  deposito(montante);
  }
  
  
  
  
}






	
}
