package entidades.enumeracoes;

import java.util.Date;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		OrdemPedidos ordem = new OrdemPedidos(1, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
		
		JOptionPane.showInternalMessageDialog(null,ordem);
	}
}
