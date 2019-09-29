package entites.servicos;

import entites.Algueldocarro;
import entites.Fatura;

public class servicorentavel {
private Double precopordia;
private Double precoporhora;
private ServicoDeTaxaNoBrasil servicodetaxanobrazil;
private double pagamentobasico;
public servicorentavel(Double precopordia, Double precoporhora, ServicoDeTaxaNoBrasil servicodetaxanobrazil) {

	this.precopordia = precopordia;
	this.precoporhora = precoporhora;
	this.servicodetaxanobrazil = servicodetaxanobrazil;
}

public void precessinginvoic(Algueldocarro carRental) {
	long t1 = carRental.getStart().getTime();
	long t2 =  carRental.getStart().getTime();
	
	double horas = (double)(t2-t1) /1000 /60 /60;
	
	
	double basicPayment;
	if(horas<= 12) {
		basicPayment = precoporhora * Math.ceil(horas);
	}
	else {
		pagamentobasico = Math.ceil(horas /24) * precopordia;
	}
	double tax = servicodetaxanobrazil.taxa(basicPayment);
	carRental.setFatura(new Fatura(pagamentobasico, tax);
	
}
}
