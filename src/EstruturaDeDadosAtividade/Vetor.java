package EstruturaDeDadosAtividade;

import javax.swing.JOptionPane;

public class Vetor {
	private String[] elementos;
	private int tamanho;

	/*
	 * MÉTODO CONSTRUTOR QUE INICIA O VETOR. O MÉTODO FOI DESENVOLVIDO PARA EVITAR
	 * ERROS NO MOMENTO DE INICIALIZAR O VETOR. 
	 */
	public Vetor(int tamanho) {
		if (tamanho > 0) {
			elementos = new String[tamanho];
		} else {
			boolean teste = true;
			while (teste) {
				int tamanhoDois = testaValor();
				if (tamanhoDois > 0) {
					elementos = new String[tamanhoDois];
					teste = false;
				}
			}
		}
	}
	
	// CRIADO PARA AUXILIAR OUTROS METODOS
	private int testaValor() {
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero maior que zero: "));
		if(tam > 0) {
			return tam;
		}
		
		return  -1;
	}
	
	public boolean trocaPosicao(String nome1, String nome2) {
		int busca1 = busca(nome1);
		int busca2 = busca(nome2);
		if(busca1 >= 0 && busca2 >= 0) {
			String armazena = this.elementos[busca1];
			this.elementos[busca1] = this.elementos[busca2];
			this.elementos[busca2] = armazena;
			JOptionPane.showMessageDialog(null, "A troca realizada com sucesso.");
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "A troca falhou!!");
			return false;
		}
	}

	public String getElementos(int posicao) {
		boolean testa;
		do {
			testa = true;
			if(posicao < 0) {
				posicao = testaValor();
				if(posicao > 0) {
					testa = false;
					return elementos[posicao];
				}
			}else {
				testa = false;
				return elementos[posicao];
			}
		}while(testa);
		
		return elementos[posicao];
		
	}
	
	public void adicionaElementos(String valor) {
		if(tamanho <= this.elementos.length - 1) {
			System.out.println("Entrou");
			elementos[tamanho] = valor;
			tamanho++;
		}else {
			JOptionPane.showMessageDialog(null, "O vetor já está cheio");
		}
	}
	
	public String busca(int posicao) {
		if(posicao >= 0 &&  posicao < tamanho) {
			return this.elementos[posicao];
		}{
			return null;
		}
	}
	
	public int busca(String valor) {
		for(int i = 0; i < tamanho; i++) {
			if(elementos[i].equalsIgnoreCase(valor)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public int tamanhoSala() {
		return this.elementos.length;
	}
	
	public boolean adicionaPosicao(int pos, String valor) {
		if(pos > 0 && pos <= this.tamanho) {
			if(this.elementos[pos] == null) {
				this.elementos[pos] = valor;
				return true;
			}else {
				JOptionPane.showMessageDialog(null, "posicao ocupada");
				return false;
			}
		}else {
			JOptionPane.showMessageDialog(null, "posicao inválida");
			return false;
		}
	}
	
	public void remover(int posicao) {
		if(posicao >= 0 && posicao < this.tamanho) {
			for(int i = posicao; i < this.tamanho; i++) {
				this.elementos[i] = this.elementos[i+1]; 
			}
			tamanho--;
		}else {
			JOptionPane.showMessageDialog(null,"Posição inválida");
		}
	}
	
	// DOBRA O TAMANHO DO VETOR, SE ELE ESTIVER CHEIO.
	public void aumentaVetor() {
		if(tamanho == this.elementos.length) {
			String[] novoElemento = new String[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length ; i++) {
				novoElemento[i] = this.elementos[i]; 
			}
			
			this.elementos = novoElemento;
			JOptionPane.showMessageDialog(null, "Tamanho da sala aumentado com sucesso.");
		}else {			
			JOptionPane.showMessageDialog(null, "Erro ao aumentar a sala!!");
		}
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < tamanho ; i++) {
			s.append(this.elementos[i]);
			s.append("- ");
		}
		return s.toString(); 
	}
	
}
