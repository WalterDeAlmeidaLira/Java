package testeFila;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da fila."));
		Fila pacientes = new Fila(capacidade);
		int teste;
		do {
			int opcoes = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opcoes: "
					+ "\n 1 - inserir paciente"
					+ "\n 2 - remover paciente"
					+ "\n 3 - inserir paciente preferencial"
					+ "\n 4 - Exibir fila"
					+ "\n 5 - Exibir tamanho da fila"));
			switch(opcoes) {
				case  1:
					String nome = JOptionPane.showInputDialog("insira o nome do novo paciente: ");
					pacientes.adicionar(nome);
					break;
				case 2:
					int pos = Integer.parseInt(JOptionPane.showInputDialog("Qual a posicao que deseja remover? "));
					pacientes.remover(pos);
					break;
				case 3:
					String nomePreferencial = JOptionPane.showInputDialog("Digite o nome do paciente: ");
					pacientes.adicionarPreferencial(nomePreferencial);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, pacientes.toString());
					break;
				case 5:
					JOptionPane.showInternalMessageDialog(null, "Tamanho da fila: " + pacientes.getTamanho());
					
			}
			teste = JOptionPane.showConfirmDialog(null, "Deseja continuar? "); 
		}while(teste == 0);
		
		int senha = 1;
		
		for (int i = 0; i < pacientes.getTamanho(); i++) {			
			JOptionPane.showInternalMessageDialog(null, "Senha: " + senha +"\n paciente: "+pacientes.chamar(i));
			senha++;
		}
	}
}
