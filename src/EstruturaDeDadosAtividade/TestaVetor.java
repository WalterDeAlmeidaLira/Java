package EstruturaDeDadosAtividade;

import javax.swing.JOptionPane;

public class TestaVetor {
	public static void main(String[] args) {
		int qtdadeCadeiras = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cadeiras que"
		+ " existem no cinema: "));
		Vetor cinema  = new Vetor(qtdadeCadeiras);
		while(true){
			int opcoes = Integer.parseInt(JOptionPane.showInputDialog(
					" 1 - Vender ingresso." + 
					"\n 2 - Remover telespectador."+
					"\n 3 - Trocar de lugar."+
					"\n 4 - Buscar telespectador por nome."+
					"\n 5 - Buscar telespectador por cadeira."+
					"\n 6 - Exibir tamanho da sala."+
					"\n 7 - Sair"));
		}
	}
}
