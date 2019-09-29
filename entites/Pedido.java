package entites;

import java.util.Date;

public class Pedido {
private Date date;
private  CaracteristicasProduto product;
public Pedido(Date date, CaracteristicasProduto product) {
	this.date = date;
	this.product = product;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public CaracteristicasProduto getProduct() {
	return product;
}
public void setProduct(CaracteristicasProduto product) {
	this.product = product;
}

}
