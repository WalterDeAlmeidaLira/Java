package ADO_POO;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame implements ItemListener, ActionListener{
	private JTextField numeroUm;
	private JTextField numeroDois;
	private JTextField resultado;
	private JLabel num1;
	private JLabel num2;
	private JLabel result;
	private JButton cancelar;
	private JButton sair;
	private JRadioButton soma;
	private JRadioButton mult;
	private JRadioButton pot;
	private JRadioButton sub;
	private JRadioButton div;
	private JRadioButton megaSena;
	private ButtonGroup grupoBotoes;
	
	public Calculadora() {
		super("Formulário");
		setLayout(new GridLayout(7,2,3,3));
		
		//COR DE FUNDO DOS BOTÕES TIPO RADIO
		Color cinza = new Color(128,128,128);
		
		//CRIANDO OS BOTÕES DE RÁDIO
		soma = new JRadioButton("soma", false);
		soma.setBackground(cinza);
		mult = new JRadioButton("multiplicação",false);
		mult.setBackground(cinza);
		pot = new JRadioButton("potenciação",false);
		pot.setBackground(cinza);
		sub = new JRadioButton("subtração", false);
		sub.setBackground(cinza);
		div = new JRadioButton("divisão",false);
		div.setBackground(cinza);
		megaSena = new JRadioButton("Mega Sena",true);
		megaSena.setBackground(cinza);
		
		
		//CRIANDO GRUPO DE BOTÕES 
		grupoBotoes = new ButtonGroup();
		grupoBotoes.add(soma);
		grupoBotoes.add(mult);
		grupoBotoes.add(pot);
		grupoBotoes.add(sub);
		grupoBotoes.add(div);
		grupoBotoes.add(megaSena);
		
		//CRIANDO OS LABELS
		num1 = new JLabel("Número 1:");
		num1.setHorizontalAlignment(SwingConstants.CENTER);
		num2 = new JLabel("Número 2:");
		num2.setHorizontalAlignment(SwingConstants.CENTER);
		result = new JLabel("Resultado: ");
		result.setHorizontalAlignment(SwingConstants.CENTER);
		
		//CRIANDO BOTOES
		cancelar = new JButton("Cancelar");
		sair = new JButton("Sair");
		
		//CRIANDO CAMPO DE TEXTO
		numeroUm = new JTextField();
		numeroDois = new JTextField();
		resultado = new JTextField();
		resultado.setEditable(false);
		
		
		//ADICIONANDO ELEMENTOS A TELA 
		add(soma);
		add(sub);
		add(mult);
		add(div);
		add(pot);
		add(megaSena);		
		add(num1);
		add(numeroUm);		
		add(num2);
		add(numeroDois);		
		add(result);
		add(resultado);		
		add(cancelar);		
		add(sair);
		
		//OUVIDORES	DOS RADIOS
		soma.addItemListener(this);
		mult.addItemListener(this);
		div.addItemListener(this);
		sub.addItemListener(this);
		pot.addItemListener(this);
		megaSena.addItemListener(this);
		
		//OUVIDOR DOS BOTOES
		cancelar.addActionListener(this);
		sair.addActionListener(this);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("get item: " + e.getItem());
		//System.out.println("getStateCahnge()" + e.getStateChange());
		
		if(soma.isSelected()) {
			try {			
				int a = Integer.parseInt(numeroUm.getText());
				int b = Integer.parseInt(numeroDois.getText());
				int somaNumeros = a + b;				
				resultado.setText("" + somaNumeros);
			}catch(Exception ex){
				JOptionPane.showMessageDialog(this, "valor invalido para soma","Erro na soma",JOptionPane.ERROR_MESSAGE);
				resultado.setText(" ");
			}			
		}else if(sub.isSelected()) {
			try {			
				int a = Integer.parseInt(numeroUm.getText());
				int b = Integer.parseInt(numeroDois.getText());
				int subNumeros = a - b;				
				resultado.setText("" + subNumeros);
			}catch(Exception ex){
				JOptionPane.showMessageDialog(this, "valor invalido para subtração","Erro na subtração",JOptionPane.ERROR_MESSAGE);
				resultado.setText(" ");
			}			
		}else if(mult.isSelected()) {
			try {			
				int a = Integer.parseInt(numeroUm.getText());
				int b = Integer.parseInt(numeroDois.getText());
				int multNumeros = a * b;				
				resultado.setText("" + multNumeros);
			}catch(Exception ex){
				JOptionPane.showMessageDialog(this, "valor invalido para multiplicação","Erro na multiplicação",JOptionPane.ERROR_MESSAGE);
				resultado.setText(" ");
			}			
		}else if(div.isSelected()) {
			try {			
				int a = Integer.parseInt(numeroUm.getText());
				int b = Integer.parseInt(numeroDois.getText());
				int divNumeros = a / b;				
				resultado.setText("" + divNumeros);
			}catch(Exception ex){
				JOptionPane.showMessageDialog(this, "valor invalido para divisao","Erro na divisão",JOptionPane.ERROR_MESSAGE);
				resultado.setText(" ");
			}			
		}else if(pot.isSelected()) {
			try {			
				double a = Double.parseDouble(numeroUm.getText());
				double b = Double.parseDouble(numeroDois.getText());
				double potNumeros = Math.pow(a, b);				
				resultado.setText("" + potNumeros);
			}catch(Exception ex){
				JOptionPane.showMessageDialog(this, "valor invalido para potência","Erro na potenciação",JOptionPane.ERROR_MESSAGE);
				resultado.setText(" ");
			}
		}else if(megaSena.isSelected()) {
			Random aleatorio = new Random();
			String sorteio = "";
			for(int i = 0; i < 6 ; i++) {
				int num = aleatorio.nextInt(60);
				num += 1;
				sorteio += num + " ";
			}
			
			resultado.setText(sorteio);
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == cancelar) {
			numeroUm.setText(" ");
			numeroDois.setText(" ");
			resultado.setText(" ");
		}else if(e.getSource() == sair) {
			System.exit(0);
		}
			
			
			
			
			
	}
}
