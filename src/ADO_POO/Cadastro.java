package ADO_POO;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Scrollable;
import javax.swing.SwingConstants;

public class Cadastro extends JFrame implements ActionListener{
	private ArrayList<String> guardaMatricula;
	private ArrayList<String> guardaNome;
	private JButton registrar;
	private JTextField matricula;
	private JTextField nome;
	private JLabel labelMatricula;
	private JLabel labelNome;
	private JTextArea areaTexto;
	private JScrollPane scroll;
	
	public Cadastro() {
		super("Tela de cadastro");
		
		JPanel painelUm = new JPanel();
		JPanel painelDois = new JPanel();
		
		guardaMatricula = new ArrayList<String>();
		guardaNome = new ArrayList<String>();
		
		setLayout(new GridLayout(2,1,5,5));
		
		painelUm.setLayout(new GridLayout(2,3,5,5));
		painelDois.setLayout(new FlowLayout());
		
		registrar = new JButton("Gravar Registro");
		registrar.setBackground(new Color(128,128,128));
		registrar.setFont(new Font("Arial",Font.BOLD,14));
		
		matricula = new JTextField();
		nome = new JTextField();
		
		areaTexto = new JTextArea();
		areaTexto.setFont(new Font("Arail",Font.BOLD,16));
		areaTexto.setText("Matricula Nome \n -------------------------------------------------------------------------------------------- \n");
		areaTexto.setRows(5);
		areaTexto.setColumns(35);
		areaTexto.setAlignmentX(LEFT_ALIGNMENT);
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
		scroll = new JScrollPane(areaTexto);
		
		
		labelMatricula = new JLabel("Matricula");
		labelMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		labelMatricula.setFont(new Font("Arial", Font.BOLD,14));
		labelNome = new JLabel("Nome");
		labelNome.setHorizontalAlignment(SwingConstants.CENTER);
		labelNome.setFont(new Font("Arial", Font.BOLD,14));
		
		painelUm.add(labelMatricula);
		painelDois.add(scroll);
		
		painelUm.add(matricula);
		painelUm.add(registrar);
		painelUm.add(labelNome);
		painelUm.add(nome);		
		
		add(painelUm);
		add(painelDois);
		
		registrar.addActionListener(this);	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == registrar) {
			String mat = matricula.getText();
			String nom = nome.getText();
			areaTexto.append(mat + " " + nom + "\n");
			guardaMatricula.add(mat);
			guardaNome.add(nom);
			
		}
		
	}
}
