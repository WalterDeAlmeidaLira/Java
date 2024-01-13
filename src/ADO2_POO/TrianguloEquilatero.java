package ADO2_POO;

import javax.swing.JOptionPane;

public class TrianguloEquilatero extends Triangulo {
	public TrianguloEquilatero(double base, double altura) {
		super(base,altura);
	}
	
	@Override
	public void calculaArea() {
		JOptionPane.showMessageDialog(null, "Calculando a área de um triângulo equilâtero","Triangulo Equilâtero", JOptionPane.INFORMATION_MESSAGE);
		super.calculaArea();
		JOptionPane.showMessageDialog(null, "A área do triangulo equilâtero é:" + this.area,"Triangulo Equilâtero", JOptionPane.INFORMATION_MESSAGE);
	}
}
