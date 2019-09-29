package estudando.encapsulamento;

public class Televisao {

	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
	
		controle.ligar();
		System.out.println(controle);
		controle.maisVolume();
		System.out.println(controle);
		System.out.println();
	}

}
