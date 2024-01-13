package ADO2_POO;

import javax.swing.JOptionPane;

public class Triangulo extends FigurasGeometricas {
	private double base , altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		
		if(base > 0) {
			this.base = base;
		}else {
			JOptionPane.showMessageDialog(null, "Erro ao atribuir a base", "Triangulo",JOptionPane.ERROR_MESSAGE);
		}		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}else {
			JOptionPane.showMessageDialog(null, "Erro ao atribuir a altura", "Triangulo",JOptionPane.ERROR_MESSAGE);
		}		
	}
	
	@Override
	public void calculaArea() {
		this.area = (getBase()*getAltura())/2;
	}
	
}
