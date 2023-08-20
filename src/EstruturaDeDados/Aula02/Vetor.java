package EstruturaDeDados.Aula02;
import java.util.Arrays;
public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		tamanho = 0;
	}
	
	public void adiciona(String eleme) throws Exception{
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho]= eleme;
			this.tamanho++;
		}else {
			throw new Exception("Vetor cheio.");
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.elementos);
	}
	
	public String busca(int posicao)throws Exception{
		if(posicao >=0 && posicao < tamanho) {
			return elementos[posicao];
		}else {
			throw new Exception("posicao invalida");
		}
	}
	
	public int busca(String nome) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return -1;
	}
	
	
}
