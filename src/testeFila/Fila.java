package testeFila;

import javax.swing.JOptionPane;

public class Fila {
	private String [] nome;
	private int tamanho;
	private int preferencial;
	
	public Fila(int capacidade) {
		this.nome = new String[capacidade];
		this.tamanho = 0;
	}
	
	public void adicionar(String nome) {
		if(this.tamanho == this.nome.length) {
			JOptionPane.showMessageDialog(null, "Fila cheia"); 
		}else {
			this.nome[this.tamanho] = nome;
			this.tamanho = this.tamanho + 1;
		}
	}
	
	public String chamar(int i) {
		return this.nome[i];
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void remover(int posicao) {
		
		if(posicao >= 0 && posicao < this.tamanho) {
			for(int i = posicao; i < this.tamanho; i++) {
				this.nome[i] = this.nome[i+1]; 
			}
			if(posicao == this.preferencial-1) {
				this.preferencial--;
			}
			tamanho--;
		}else {
			JOptionPane.showMessageDialog(null,"Posição inválida");
		}
	}
	
	public void adicionarPreferencial(String nome) {
		if(this.tamanho == this.nome.length) {
			return ; 
		}
		
		if(this.nome[this.preferencial] != null) {
			for (int i = this.tamanho -1  ; i >= this.preferencial ; i--) {
				this.nome[i+1] = this.nome[i];
			}
			this.nome[this.preferencial]= nome;
			this.tamanho++;
			this.preferencial++;
		}else {
			this.nome[this.preferencial]= nome;
			this.tamanho++;
			this.preferencial++;
		}
	}
	
	@Override
	public String toString() {
		String s = "[ ";
		for (int i = 0; i < this.tamanho ; i++) {
			if (i > 0) s += ", ";
			s += this.nome[i];
		}
		return s + " ]";
	}
}
