package curso;

import java.util.Date;

import entites.OrdemStatus;
import entites.Pedido;
import entites.Pedidos;

public class Enumeracao {

	public static void main(String[] args) {
		 Pedidos pedido1 = new Pedidos(1080, new Date(), OrdemStatus.PROCESSANDO);
		 Pedidos pedido2 = new Pedidos(1090, new Date(), OrdemStatus.AGUARDANDO_PAGAMENTO);
		 
		System.out.println(pedido1);
		System.out.println(pedido2);
		OrdemStatus os1 = OrdemStatus.ENTREGUE;
		OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");
		System.out.println(os1);
		System.out.println(os2);
		
		
		

	}

}
