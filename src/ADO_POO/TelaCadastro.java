package ADO_POO;

import javax.swing.JFrame;

public class TelaCadastro {
	public static void main(String[] args) {
		Cadastro tela = new Cadastro();
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(520,250);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);
	}
}
