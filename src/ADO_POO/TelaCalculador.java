package ADO_POO;

import javax.swing.JFrame;

public class TelaCalculador {
	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setSize(500,300);
		cal.setVisible(true);
	}
}
