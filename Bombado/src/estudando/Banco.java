package estudando;

public class Banco {
private int numerodaconta;
protected char tipodeconta;
private String nome;
private double saldo;
private boolean status;
public Banco() {
saldo = 0;
status = false;
}

public Banco(int numerodaconta, char tipodeconta, String nome, double saldo, boolean status) {
	this.numerodaconta = numerodaconta;
	this.tipodeconta = tipodeconta;
	this.nome = nome;
	this.saldo = saldo;
	this.status = status;
}


public int getNumerodaconta() {
	return numerodaconta;
}
public void setNumerodaconta(int numerodaconta) {
	this.numerodaconta = numerodaconta;
}
public char getTipodeconta() {
	return tipodeconta;
}
public void setTipodeconta(char tipodeconta) {
	this.tipodeconta = tipodeconta;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public void deposito(double valor) {
if(status == true) {
	setSaldo(getSaldo() + valor); 
} else {
	System.out.println("Essa conta não existe");
}
}
public void sacar(double valor ) {
	if(status == true  && saldo>valor) {
		setSaldo(getSaldo() - valor);
	}  else {
		System.out.println("saldo insuficiente");
	}
	
}
public void pagarmensal() {
 saldo += saldo*0.1;
}
public void AbrirConnta(char tipodeconta) {
	setTipodeconta(tipodeconta);
	if(tipodeconta == 'c') {
		setStatus(true);
		saldo = 50;
	} else if(tipodeconta == 'a') {
		setStatus(true);
		saldo = 150;
	
} else {
setStatus(false);	
}

}
public void Fecharcontaa() {
	if(saldo > 0) {
		System.out.println("Conta com dinheiro, impossivel de excluir conta");
	} else if(saldo < 0) {
		System.out.println("Conta em débito");
		
	} else {
		setStatus(false);
	}
	
	
}
public void pagarmensalidade() {
	double valor;
	if(getTipodeconta() == 'c' ) {
		 valor = 15;
		if(status == true  && saldo>valor) {
			setSaldo(getSaldo() - valor);
		} else {
			System.out.println("Impossivel pagar, saldo insuficiente");
		}
	}
	if(getTipodeconta() == 'a') {
		valor = 30;
		if(status == true && saldo > valor) {
			setSaldo(getSaldo() - valor);
		} else {
			System.out.println("Impossivel pagar, saldo insuficiente");
		}
	}
}

@Override
public String toString() {
	return "Banco [numerodaconta=" + numerodaconta + ", tipodeconta=" + tipodeconta + ", nome=" + nome + ", saldo="
			+ saldo + ", status=" + status + "]";
}


}
