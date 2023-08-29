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
		aumentaVetor();
		if(tamanho <= this.elementos.length) {
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
			return "Essa posicao não existe no vetor";
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
	
//	public boolean adicionaPosicao(int pos, String valor) {
//		aumentaVetor();
//		if(pos >= 0 && pos < tamanho) {
//			for(int i = tamanho -1; i > pos ; i--) {
//				this.elementos[i+1] = this.elementos[i];
//			}
//			this.elementos[pos] = valor;
//			tamanho++;
//		}else {
//			JOptionPane.showMessageDialog(null, "Posicao invalida");
//		}
//		
//		return true;
//	}
	
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
	private void aumentaVetor() {
		if(tamanho == this.elementos.length) {
			String[] novoElemento = new String[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length ; i++) {
				novoElemento[i] = this.elementos[i]; 
			}
			
			this.elementos = novoElemento;
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
