package ADO2_POO;

import javax.swing.JOptionPane;

public class Trapezio extends FigurasGeometricas{
	private double baseMaior, baseMenor, altura;
	
	public Trapezio(double baseMaior, double baseMenor,double altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}
	
	public void setBaseMaior(double baseMaior) {
		
		if(baseMaior > 0) {
			this.baseMaior = baseMaior;
		}else {
			JOptionPane.showMessageDialog(null, "Valor deve ser um doble maior que zero", "ERRO BASE MAIOR",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public double getBaseMenor() {
		return baseMenor;
	}
	
	public void setBaseMenor(double baseMenor) {
		
		if(baseMenor > 0) {
			this.baseMenor = baseMenor;
		}else {
			JOptionPane.showMessageDialog(null, "Valor deve ser um doble maior que zero", "ERRO BASE MENOR",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		
		if(altura > 0) {
			this.altura = altura;
		}else {
			JOptionPane.showMessageDialog(null, "Valor deve ser um doble maior que zero", "ERRO ALTURA",JOptionPane.ERROR_MESSAGE);
		}		
	}
	
	@Override
	public void calculaArea() {
		this.area = ((getBaseMaior()+getBaseMenor())*this.altura)/2;
		JOptionPane.showMessageDialog(null, "A area do trapezio é: " + this.area, "Trapézio", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	
	
	
	
}
