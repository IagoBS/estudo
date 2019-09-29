package entites;

import java.util.Date;

public class Pedidos {
private Integer id;
private Date momento;
private OrdemStatus status;
public Pedidos() {
}
@Override
public String toString() {
	return "Pedidos [id=" + id + ", momento=" + momento + ", status=" + status + "]";
}
public Pedidos(Integer id, Date momento, OrdemStatus status) {
	this.id = id;
	this.momento = momento;
	this.status = status;
}
public Pedidos(Integer id, OrdemStatus status) {
	this.id = id;
	this.status = status;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Date getMomento() {
	return momento;
}
public void setMomento(Date momento) {
	this.momento = momento;
}
public OrdemStatus getStatus() {
	return status;
}
public void setStatus(OrdemStatus status) {
	this.status = status;
}


}

