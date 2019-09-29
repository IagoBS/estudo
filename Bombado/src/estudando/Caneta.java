package estudando;

public class Caneta {
 public String modelo;
 public String cor;
 private double ponta;
 protected int carga;
 private boolean tampada;
public Caneta(String modelo, String cor, double ponta) {
	this.modelo = modelo;
	this.cor = cor;
	this.ponta = ponta;
	this.tampar();
	
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public double getPonta() {
	return ponta;
}

public void setPonta(double ponta) {
	this.ponta = ponta;
}

protected void rabiscar() {
	if(tampada == true) {
		System.out.println("erro");
	} else {
		System.out.println("rabisco");
		
	}
}
protected void tampar() {
	if(tampada == false) {
		tampada = true;
	}  
		
}
protected void destampar() {
	if(tampada == true) {
		tampada = false;
	}
}

public void status() {
	System.out.println("Sobre a caneta: ");
	System.out.println("Modelo: " + this.getModelo());
	System.out.println("Pornta: " + this.getPonta());
	System.out.println("Cor: "  + this.cor);
	System.out.println("Essa caneta está tampada? " + this.tampada);
}


}
