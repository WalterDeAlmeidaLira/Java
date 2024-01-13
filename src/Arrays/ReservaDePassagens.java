package Arrays;

import javax.swing.JOptionPane;

public class ReservaDePassagens {
	public static void main(String[] args) {
		boolean run = true;
		boolean[] firstClass = new boolean[5];
		boolean[] economyClass = new boolean[5];
		while(run) {
			int optionUm = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Primeria Classe\n"
					+ "2 - classe econômica\n"
					+ "3 - sair", "Venda de passagens",JOptionPane.INFORMATION_MESSAGE));
			run = statusApp(optionUm);
			if(optionUm == 1) {
				int chair = searchSeat(firstClass);
				if(chair != -1 && chair != -2) {
					firstClass[chair] = true;
					JOptionPane.showMessageDialog(null, "Poltrona: " + (chair+1) + "\nPrimeira Classe","Cartao de embarque",JOptionPane.INFORMATION_MESSAGE);
					
				}else if(chair == -1){
					JOptionPane.showMessageDialog(null, "Desculpe não temos outros lugares.","Venda de passagens",JOptionPane.ERROR_MESSAGE);
				}else if(chair == -2) {
					JOptionPane.showMessageDialog(null, "Desculpe estamos lotados!.","Venda de passagens",JOptionPane.ERROR_MESSAGE);
				}
			}else if(optionUm == 2) {
				int chair = searchSeat(economyClass);
				if(chair != -1 && chair != -2) {
					economyClass[chair] = true;
					JOptionPane.showMessageDialog(null, "Poltrona: " + (chair+1) + "\nClasse Econômica","Cartao de embarque",JOptionPane.INFORMATION_MESSAGE);					
				}else if(chair == -1){
					JOptionPane.showMessageDialog(null, "Desculpe não temos outros lugares.","Venda de passagens",JOptionPane.ERROR_MESSAGE);
				}else if(chair == -2) {
					JOptionPane.showMessageDialog(null, "Desculpe estamos lotados!.","Venda de passagens",JOptionPane.ERROR_MESSAGE);
					
				}
			}else if(optionUm == 3) {
				run = false;
			}
			
		}
	}
	
	public static boolean statusApp(int i) {
		if(i == 3) {
			return false;
		}
		
		return true;
	}
	
	public static int searchSeat(boolean[] seat) {
		for (int i = 0; i < seat.length; i++) {
			if(seat[i] == false) {
				boolean checker = true;
				while(checker) {
					int question = JOptionPane.showConfirmDialog(null, "O senhor aceita o assento " + (i+1));
					if(question == 0) {
						return i;
					}else if(question == 2){
						return -1;
					}else {
						checker = false;
					}
				}
			}
		}
		
		return -2;
	}

	
	
}
