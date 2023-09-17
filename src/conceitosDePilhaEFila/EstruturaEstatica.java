package conceitosDePilhaEFila;

public class EstruturaEstatica<T> {
	public T[] elementos;
	private int tamanho;
	
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {
		this(10);
	}
	
	public boolean adiciona(T elementos) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elementos;
			this.tamanho++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean adiciona(int posicao, T elemento) {
		if(posicao >= 0 && posicao < this.tamanho) {
			this.aumentaCapacidade();
			for(int i = this.tamanho -1; i > posicao ; i--) {
				this.elementos[i+1] = this.elementos[i];
			}
			this.elementos[posicao] = elemento;
			this.tamanho++;
			
			return true;
		}else {
			return false;
		}
	}
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] novosElementos = (T[]) new Object [this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length ; i++) {
				novosElementos[i] = this.elementos[i];
			}
			
			this.elementos = novosElementos;
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
}
