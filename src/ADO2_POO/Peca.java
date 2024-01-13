package ADO2_POO;

import javax.swing.JOptionPane;

public class Peca {
	public String nome;
	protected int comprimento;
	private int durabilidade;
	
	
	public int getComprimento() {
		return comprimento;
	}
	
	public int getDurabilidade() {
		return durabilidade;
	}
	
	public void setComprimento(int comprimento) {
		if(comprimento > 0 && comprimento < 25) {
			this.comprimento = comprimento;
			JOptionPane.showMessageDialog(null,"Comprimento atribuido com suceso","Aviso",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,"Erro: O vaor deve ser maior que 0 e menor que 25.","Comprimento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setDurabilidade(int durabilidade) {
		if(durabilidade > 0 && durabilidade < 180){
			this.durabilidade = durabilidade;
			JOptionPane.showMessageDialog(null,"Durabilidade atribuida com sucesso","Aviso",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,"Erro: o valor deve ser maior que 0 e menor que 180","Durabilidade",JOptionPane.ERROR_MESSAGE);
		}
	} 
	
//	public static void main(String[] args) {
//		Peca peca = new Peca();
//		peca.setComprimento(2);
//		peca.setDurabilidade(10);
//	}
}
