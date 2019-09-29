package entites;

public class Produto2 {
	public String produto;
	public double preco;
	public int quantidade;
	public double totaldevaloresnoestoque() {
		return  preco * quantidade;

		
	}
	public void adicionarprodutos(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerproduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return produto +", "+"$"+preco+", "+quantidade+", "+ totaldevaloresnoestoque();
		
	}

}
