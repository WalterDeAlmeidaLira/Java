package GeradorDeJogosLoteria;
import javax.swing.JOptionPane;


public class Usuario {
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		int valorJogo = Integer.parseInt(JOptionPane.showInputDialog("Digite qual jogo voce deseja gerar:\n"
				+ "1 - megasena \n 2 - lotofacil \n 3 - quina \n 4 - lotomania"));
		switch(valorJogo) {
			case 1:
				jogo.setQuantidadeDeNumeros(6,60);
				jogo.geradorJogos();
				break;
			case 2:
				jogo.setQuantidadeDeNumeros(15,25);
				jogo.geradorJogos();
				break;
			case 3: 
				jogo.setQuantidadeDeNumeros(5,80);
				jogo.geradorJogos();
				break;
			case 4:
				jogo.setQuantidadeDeNumeros(20,99);
				jogo.geradorJogos();
				break;
		}
		JOptionPane.showMessageDialog(null,jogo.toString());	
	}
}
