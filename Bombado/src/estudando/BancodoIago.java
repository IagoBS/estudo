package estudando;

public class BancodoIago {
public static void main(String[] args) {
	
	Banco banco = new Banco();
	banco.AbrirConnta('a');

	banco.setNumerodaconta(100);
	banco.setNome("Iago");
	System.out.println(banco);	
		banco.Fecharcontaa();
		banco.pagarmensalidade();
		System.out.println(banco);
		
		
	
	
}
}
