package ADO2_POO;

import javax.swing.JOptionPane;

public class TrianguloRetangulo extends Triangulo {
	public TrianguloRetangulo(double base, double altura) {
		super(base,altura);
	}
	
	@Override
	public void calculaArea() {
		JOptionPane.showMessageDialog(null, "Calculando a área de um triângulo retângulo","Triangulo Retangulo", JOptionPane.INFORMATION_MESSAGE);
		super.calculaArea();
		JOptionPane.showMessageDialog(null, "A área do triangulo retângulo é:" + this.area,"Triangulo Retangulo", JOptionPane.INFORMATION_MESSAGE);
	}
}
