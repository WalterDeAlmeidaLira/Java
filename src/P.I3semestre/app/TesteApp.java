package app;

import javax.swing.JFrame;

import banco_de_dados.Conecta;
import interfaceGrafica.Tela;

public class TesteApp {
	public static void main(String[] args) {		
		Tela tela = new Tela();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(700,550);
		tela.setVisible(true);
	}
}
