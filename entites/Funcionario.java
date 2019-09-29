package entites;

public class Funcionario {
public String nome;
public double salariobruto;
public double imposto;

public double salarioliquido() {
	return salariobruto - imposto;
}
public double porcentagem(double porcentagem) {
return (salariobruto * porcentagem) + salarioliquido();

}
public void aumentodesalario(double porcentagem) {
	salariobruto += salariobruto * (porcentagem/100);
}

}
