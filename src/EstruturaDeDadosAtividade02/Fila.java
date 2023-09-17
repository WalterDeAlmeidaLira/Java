package EstruturaDeDadosAtividade02;

import javax.swing.JOptionPane;

public class Fila {
	private Paciente[] fila;
	private int tamanho;
	private int qtdPreferencial;
	
	public Fila(int capacidade) {
		this.fila = new Paciente[capacidade];
		this.tamanho = 0;
	}
	
	public Fila() {
		this(10);
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public Paciente getFila(int i) {
		return fila[i];
	}
	
	public void adicionar(String nome, boolean preferencial) {
		if(this.tamanho == this.fila.length) {
			JOptionPane.showInternalMessageDialog(null, "Hospital cheio, volte amanhã!!");
			return;
		}		
		//Paciente novoPaciente = new Paciente(nome, preferencial);
		if(novoPaciente.getPreferencial()) {
			for(int i = this.tamanho -1; i > this.qtdPreferencial;i--) {
				this.fila[i+1] = this.fila[i]; 
			}
			this.fila[qtdPreferencial] = novoPaciente;
			this.tamanho++;
			this.qtdPreferencial++;
		}else {
			this.fila[this.tamanho]= novoPaciente;
			this.tamanho++;
		}
	}
	
	public void remover(int posicao) {
		if(posicao >= 0 && posicao < this.tamanho) {
			if(this.fila[posicao].getPreferencial()) {
				for(int i = posicao ; i < this.tamanho; i++) {
					this.fila[i] = this.fila[i+1]; 
				}
				this.tamanho--;
				this.qtdPreferencial--;
			}else {
				for(int i = posicao ; i < this.tamanho-1; i++) {
					this.fila[i] = this.fila[i+1]; 
				}
				this.tamanho--;
			}
		}else {
			JOptionPane.showInternalMessageDialog(null, "Posicao invalida!");
		}
	}
	
	public String toString() {
		String s = "[";
		for(int i = 0 ; i < this.tamanho -1; i++) {
			if(i > 0) s += ", ";
			s += this.fila[i].getNome();
		}
		
		return s + "]";
	}
}
