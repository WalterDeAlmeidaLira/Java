package EstruturaDeDadosAtividade02;

import javax.swing.JOptionPane;

public class FilaHospital {
	public static void main(String[] args) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da fila: "));
		Fila fila = new Fila(tamanho);
		int teste = 0;
		do {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu de opções: "
					+ "\n 1 - senha comum "
					+ "\n 2 - senha preferencial"
					+ "\n 3 - Remover paciente "
					+ "\n 4 - Exibir fila "));
			switch(opcao) {
				case 1: 
					String nome = JOptionPane.showInputDialog("Digite o nome do paciente");
					Paciente paciente = new Paciente(nome, false);
					fila.adicionar(paciente.getNome(), paciente.getPreferencial());
					break;
				case 2: 
					String nomePreferencial = JOptionPane.showInputDialog("Digite o nome do paciente");
					Paciente pacientePreferencial = new Paciente(nomePreferencial, true);
					fila.adicionar(pacientePreferencial.getNome(), pacientePreferencial.getPreferencial());
					break;
				case 3:
					String removido = JOptionPane.showInputDialog("Digite o nome que será removido: ");
					int controle = -1;
					for (int i = 0; i < fila.getTamanho() ; i++) {
						if(removido.equalsIgnoreCase(fila.getFila(i).getNome())) {
							controle = i;
						}
					}
					
					if(controle == -1) {
						JOptionPane.showInternalMessageDialog(null, "Paciente nao foi encontrado na fila!");
						break;
					}
					
					fila.remover(controle);
					break;
				case 4:
					JOptionPane.showInternalMessageDialog(null, fila.toString());
					break;
					
			}
		}while(teste == 0);
	}
}
