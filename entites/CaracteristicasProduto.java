package entites;

public class CaracteristicasProduto {
private String produto;

private double preco;

private int quantidade;

public CaracteristicasProduto(String produto, double preco, int quantidade) {
	this.produto = produto;
	this.preco = preco;
	this.quantidade = quantidade;
}
public CaracteristicasProduto(String produto, double preco) {
	this.produto = produto;
	this.preco = preco;
	
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
public String getProduto() {
	return produto;
}
public void setProduto(String produto) {
	this.produto = produto;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public int getQuantidade() {
	return quantidade;
}
public void getAdicionarquantidade(int quantidade) {
	this.quantidade += quantidade;
}
public void getRemoverQuantidade(int quantidade) {
	this.quantidade -= quantidade;
}

}
