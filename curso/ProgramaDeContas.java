package curso;

import entites.Account;
import entites.NegocioDaEmpresa;
import entites.SalvandoContas;

public class ProgramaDeContas  {
public static void main(String[] args ) {
	Account acc1 = new Account(101, "Iago", 100.0);
	acc1.saque(50.0);
	System.out.println(acc1);
	Account acc2 = new SalvandoContas(1001, "Iago", 1000.0, 50.0);
	acc2.saque(100.0);
	System.out.println(acc2.getBalanco());
	Account acc3 = new NegocioDaEmpresa(1002, "Iago", 1000.0, 200.0);
	acc3.saque(100.0);
	System.out.println(acc3.getBalanco());
	
	

	
	
	
}
}
