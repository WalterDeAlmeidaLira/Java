package interfaceGrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextLayout;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import ObjetoAcessoDados.AbastecimentoDao;
import ObjetoAcessoDados.PostoDao;
import ObjetoAcessoDados.VeiculoDao;
import gerenciadorDeAbastecimento.Abastecimento;
import gerenciadorDeAbastecimento.Posto;
import gerenciadorDeAbastecimento.Veiculo;

public class Tela extends JFrame implements ActionListener{
	private JPanel painelVeiculo, painelPosto, 
	painelAbastecimento,painelLista,telaCadastroVeiculo,telaCadastroPosto,telaCadastroAbastecimento;
	private JLabel tituloVeiculo,tituloPosto,tituloAbastecimento,
	tituloLista,modelo,placa,nomePosto,Localizacao,data,litros,km,preco,tipo;
	private JTextField txtModelo,txtPlaca,txtNomePosto,txtLocalizacao,
	txtData,txtLitros,txtKm,txtPreco,txtTipo;
	private JButton gravarVeiculo,gravarPosto,gravarAbastecimento,gerarLista;
	private JTextArea areaLista;
	private JList listaVeiculo, listaPosto;
	private VeiculoDao vdao = new VeiculoDao();
	private PostoDao pdao = new PostoDao();
	private AbastecimentoDao adao = new AbastecimentoDao();
	private JScrollPane scroll;
	private Border border;
	//private String[] nomeVeiculo =  null;


	public Tela() {
		//CONFIGURAÇÕES DE TELA
		super("Gerenciador de Abastecimento");
		setLayout(new GridLayout(1,1,5,5));
		setLocationRelativeTo(null);
		border = BorderFactory.createLineBorder(Color.BLACK,2);
		JTabbedPane tabbedPane = new JTabbedPane();


		// TITULO DAS TELAS
		tituloVeiculo = criarLabel("Cadastro Veículo");
		tituloPosto = criarLabel("Cadastro Posto");
		tituloAbastecimento = criarLabel("Registrar Abastecimento");
		tituloLista = criarLabel("Lista de Abastecimento");

		//VEICULO

		painelVeiculo = criarPainel();
		painelVeiculo.setLayout(new GridLayout(3,1,70,70));		
		//painelVeiculo.setBorder(border);
		painelVeiculo.add(tituloVeiculo);
		telaCadastroVeiculo = criarPainel();
		telaCadastroVeiculo.setLayout(new GridLayout(2,2,5,5));

		modelo = criarLabel("Modelo");
		txtModelo = criarInput();
		telaCadastroVeiculo.add(modelo);
		telaCadastroVeiculo.add(txtModelo);

		placa = criarLabel("Placa");
		txtPlaca = criarInput();
		telaCadastroVeiculo.add(placa);
		telaCadastroVeiculo.add(txtPlaca);		
		painelVeiculo.add(telaCadastroVeiculo);
		gravarVeiculo = criarBotao("Gravar Veículo");
		gravarVeiculo.addActionListener(this);

		painelVeiculo.add(gravarVeiculo);
		tabbedPane.addTab("Cadastrar Veículo", null, painelVeiculo, "Cadatrar Veiculo");


		//POSTO

		painelPosto = criarPainel();
		painelPosto.setLayout(new GridLayout(3,1,70,70));
		//painelPosto.setBorder(border);
		painelPosto.add(tituloPosto);
		telaCadastroPosto = criarPainel();
		telaCadastroPosto.setLayout(new GridLayout(2,2,5,5));

		nomePosto = criarLabel("Nome");
		txtNomePosto = criarInput();
		telaCadastroPosto.add(nomePosto);
		telaCadastroPosto.add(txtNomePosto);

		Localizacao = criarLabel("Localizacao");
		txtLocalizacao = criarInput();
		telaCadastroPosto.add(Localizacao);
		telaCadastroPosto.add(txtLocalizacao);
		painelPosto.add(telaCadastroPosto);	
		gravarPosto = criarBotao("Gravar Posto");
		gravarPosto.addActionListener(this);
		painelPosto.add(gravarPosto);
		tabbedPane.addTab("Cadastrar Posto", null, painelPosto, "Cadastrar Posto");


		//ABASTECIMENTO		

		painelAbastecimento = criarPainel();
		painelAbastecimento.setLayout(new GridLayout(3,1,40,40));
		//painelAbastecimento.setBorder(border);
		painelAbastecimento.add(tituloAbastecimento);
		telaCadastroAbastecimento = criarPainel();
		telaCadastroAbastecimento.setLayout(new GridLayout(6,2));

		data = criarLabel("Data");
		txtData = criarInput();
		txtData.setSize(100,10);
		telaCadastroAbastecimento.add(data);
		telaCadastroAbastecimento.add(txtData);

		litros = criarLabel("litros");
		txtLitros = criarInput();
		telaCadastroAbastecimento.add(litros);
		telaCadastroAbastecimento.add(txtLitros);

		tipo = criarLabel("Tipo de Combustível");
		txtTipo = criarInput();
		telaCadastroAbastecimento.add(tipo);
		telaCadastroAbastecimento.add(txtTipo);

		preco = criarLabel("Preço");
		txtPreco = criarInput();
		telaCadastroAbastecimento.add(preco);
		telaCadastroAbastecimento.add(txtPreco);		
		painelAbastecimento.add(telaCadastroAbastecimento);
		gravarAbastecimento = criarBotao("Gravar Abastecimento");
		gravarAbastecimento.addActionListener(this);
		painelAbastecimento.add(gravarAbastecimento);


		String[] nomeVeiculo = new String[vdao.Listar().size()];
		for(int i = 0; i < vdao.Listar().size(); i++) {
			nomeVeiculo[i] = vdao.Listar().get(i).getModelo(); 
		}

		JLabel veiculo = criarLabel("Veículo");
		listaVeiculo = new JList(nomeVeiculo);
		listaVeiculo.setVisibleRowCount(1);
		listaVeiculo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		telaCadastroAbastecimento.add(veiculo);
		telaCadastroAbastecimento.add(new JScrollPane(listaVeiculo));

		String[] nomePosto = new String[pdao.Listar().size()];
		for(int i = 0; i < pdao.Listar().size(); i++) {
			nomePosto[i] = pdao.Listar().get(i).getNome();
		}

		JLabel posto = criarLabel("Posto");
		listaPosto = new JList(nomePosto);
		listaPosto.setVisibleRowCount(1);
		listaPosto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		telaCadastroAbastecimento.add(posto);
		telaCadastroAbastecimento.add(new JScrollPane(listaPosto));


		tabbedPane.addTab("Cadastrar Abastecimento", null, painelAbastecimento, "Cadastrar Abastecimento");

		//LISTA DE ABASTECIMENTO

		painelLista = criarPainel();
		painelLista.setLayout(new FlowLayout());
		//painelLista.setBorder(border);
		painelLista.add(tituloLista);
		gerarLista = criarBotao("Gerar Listar");
		gerarLista.addActionListener(this);
		painelLista.add(gerarLista);
		areaLista = new JTextArea(20,50);
		scroll = new JScrollPane(areaLista);
		painelLista.add(scroll);


		tabbedPane.addTab("Listar Abastecimentos", null, painelLista, "Lista");

		add(tabbedPane);
	}
	
//	private void listarVeiculo(String[] nomeVeiculo) {
//		String[] nomeVeiculo2 = new String[vdao.Listar().size()];
//		this.nomeVeiculo = nomeVeiculo2;
//		System.out.println(vdao.Listar().size());
//		System.out.println(nomeVeiculo.length);
//		for(int i = 0; i < vdao.Listar().size(); i++) {
//			nomeVeiculo[i] = vdao.Listar().get(i).getModelo(); 
//		}
//	}

	private JLabel criarLabel(String txt) {
		JLabel criarTexto = new JLabel(txt);
		criarTexto.setFont(new Font("Arial",Font.PLAIN,16));
		criarTexto.setHorizontalAlignment(SwingConstants.CENTER);
		return criarTexto;
	}

	private JTextField criarInput() {
		JTextField txt = new JTextField();
		return txt;
	}

	private JButton criarBotao(String txt) {
		JButton botao = new JButton(txt);
		botao.setFont(new Font("Arial",Font.BOLD,16));
		botao.setBackground(new Color(100,149,237));
		return botao;
	}

	private JPanel criarPainel() {
		JPanel criarPainel = new JPanel();
		add(criarPainel);
		return criarPainel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == gravarVeiculo) {
			Veiculo veiculo = new Veiculo();
			veiculo.setModelo(txtModelo.getText());
			veiculo.setPlaca(txtPlaca.getText());

			vdao.adicionar(veiculo);
			
			//listarVeiculo(this.nomeVeiculo);
		}else if(e.getSource() == gravarPosto) {
			Posto posto = new Posto();
			posto.setNome(txtNomePosto.getText());
			posto.setLocalizacao(txtLocalizacao.getText());

			pdao.adicionar(posto);
			getContentPane().repaint();
		}else if(e.getSource() == gravarAbastecimento) {
			Abastecimento ab = new Abastecimento();

			try {
				SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date utilDate = formatoData.parse(txtData.getText());
				Date sqlDate = new Date(utilDate.getTime());			
				ab.setData(sqlDate);
			} catch (Exception e2) {
				JOptionPane.showInternalMessageDialog(null, "Erro na data!! yyyy-MM-dd");
			}

			String nomePosto = (String) listaPosto.getSelectedValue();
			int idPosto = -1;
			for(int i = 0; i < pdao.Listar().size(); i++) {
				if(nomePosto.equalsIgnoreCase(pdao.Listar().get(i).getNome())) {
					idPosto = pdao.Listar().get(i).getIdPosto();
				}
			}	
			ab.setIdPosto(idPosto);

			String nomeVeiculo = (String) listaVeiculo.getSelectedValue();
			System.out.println(nomeVeiculo);
			int idVeiculo = -1;
			for(int i = 0; i < vdao.Listar().size(); i++) {
				if(nomeVeiculo.equalsIgnoreCase(vdao.Listar().get(i).getModelo())) {
					System.out.println("Entro no if veiculo");
					idVeiculo = vdao.Listar().get(i).getIdVeiculo();
					System.out.println(idVeiculo);
				}
			}
			ab.setIdVeiculo(idVeiculo);


			double litros = Double.parseDouble(txtLitros.getText());
			ab.setLitros(litros);
			
			ab.setTipo(txtTipo.getText());

			double preco = Double.parseDouble(txtPreco.getText());
			ab.setPrecolitro(preco);
			
			for(int i = 0; i < vdao.Listar().size(); i++) {
				if(nomeVeiculo.equalsIgnoreCase(vdao.Listar().get(i).getModelo())) {
					int id = vdao.Listar().get(i).getIdVeiculo();
					System.out.println(id);
					double kilo = vdao.Listar().get(i).getKm() + 100;
					System.out.println(kilo);
					Veiculo vi = vdao.Listar().get(i);
					System.out.println(vi);
					vdao.alterar(vi, id, kilo);					
				}
			}

			adao.adicionar(ab);
			
		}else if(e.getSource() == gerarLista) {
			
			areaLista.append("  Data          Litros   Tipo   preço/litro \n");
			for(int i = 0; i < adao.listarAbastecimento().size(); i++) {
				areaLista.append(adao.listarAbastecimento().get(i).toString());
			}
			
			int[] valorVeiculo = new int[adao.listarAbastecimento().size()];
			for(int i = 0; i < vdao.Listar().size(); i++) {
				valorVeiculo[i] = vdao.Listar().get(i).getIdVeiculo();
			}
			int[] verificadorKm = new int[adao.listarAbastecimento().size()];
			int[] verificadorLitros = new int[adao.listarAbastecimento().size()];
			for(int i = 0; i < adao.listarAbastecimento().size(); i++) {
				for(int j = 0; j < adao.listarAbastecimento().size(); j++) {
					if(valorVeiculo[i] == adao.listarAbastecimento().get(j).getIdVeiculo()) {
						verificadorKm[i] += 100;
						verificadorLitros[i] += adao.listarAbastecimento().get(j).getLitros();
						System.out.println(verificadorKm[i] +" "+ i);
						System.out.println(verificadorLitros[i]);
					}
				}
			}
			
			areaLista.append("Carro  km/l \n");
			
			for(int i = 0; i < vdao.Listar().size(); i++) {
				String imveic = vdao.Listar().get(i).getModelo();
				areaLista.append(imveic+"  ");
				double kml = (double) verificadorKm[i]/verificadorLitros[i];
				String skml =String.format("%.2f \n", kml);
				areaLista.append(skml);
			}
			
			areaLista.append("\n");
			
			
		}

	}


}
