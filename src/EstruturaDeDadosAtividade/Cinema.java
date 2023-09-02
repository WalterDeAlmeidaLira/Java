package EstruturaDeDadosAtividade;

import javax.swing.JOptionPane;

public class Cinema {
	public static void main(String[] args) {
		int qtdadeCadeiras = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cadeiras que"
		+ " existem no cinema: "));
		Vetor cinema  = new Vetor(qtdadeCadeiras);
		boolean controle = true;
		while(controle){
			int opcoes = Integer.parseInt(JOptionPane.showInputDialog(
					" 1 - Vender ingresso." + 
					"\n 2 - Remover telespectador."+
					"\n 3 - Trocar de lugar."+
					"\n 4 - Buscar telespectador por nome."+
					"\n 5 - Buscar telespectador por cadeira."+
					"\n 6 - Exibir tamanho da sala."+
					"\n 7 - trocar para uma sala maior" +
					"\n 8 - Exibir nomes da sala " +
					"\n 9 - Sair"));
			switch(opcoes){
			case 1:
				String nome  = JOptionPane.showInputDialog("Digite o nome do cliente");
				cinema.adicionaElementos(nome);
				JOptionPane.showMessageDialog(null, "O último cliente está na cadeira " + cinema.getTamanho());
				break;
			case 2:
				JOptionPane.showInternalMessageDialog(null, "Estes são os telespectadores que estão na sala: \n" + 
						cinema.toString());
				String remove = JOptionPane.showInputDialog("DIgite o nome do telespectador: ");
				int busca = cinema.busca(remove);
				if(busca >= 0) {
					cinema.remover(busca);
					JOptionPane.showInternalMessageDialog(null, "O telespectador "+ remove + " foi removido");
					JOptionPane.showInternalMessageDialog(null, "Estes são os telespectadores que estão na sala: \n" + 
							cinema.toString());
				}else {
					JOptionPane.showInternalMessageDialog(null, "O nome digitado não está na sala: ");
				}
				break;
			case 3: 
				String nome1 = JOptionPane.showInputDialog("Digite o nome do primeiro telespectador: ");
				String nome2 = JOptionPane.showInputDialog("Digite o nome do segundo telespectador: ");
				
				cinema.trocaPosicao(nome1, nome2);
				break;
			case 4:
				String nomeCliente = JOptionPane.showInputDialog("Digite o nome que deseja buscar: ");
				if(cinema.busca(nomeCliente) >= 0) {
					JOptionPane.showMessageDialog(null, "O cliente está na cadeira " + (cinema.busca(nomeCliente) + 1));
				}else {
					JOptionPane.showMessageDialog(null, "O nome não está constando na sala");
				}
				break;
			case 5: 
				int cadeiraCliente =  Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da cadeira do cliente: "));
				if(cinema.busca(cadeiraCliente - 1) != null) {
					JOptionPane.showInternalMessageDialog(null, "O cliente " + 
							cinema.busca(cadeiraCliente) + " está nesta sala");
				}else {
					JOptionPane.showMessageDialog(null, "O cliente não está na sala");
				}
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "O tamanho da sala é " + cinema.tamanhoSala());
				break;
			case 7:
				cinema.aumentaVetor();
				break;
			case 8: 
				JOptionPane.showMessageDialog(null, "SALA: \n" + cinema.toString());
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Obrigado!!");
				controle = false;
				break;
			}
		}
	}
}
