package GeradorDeJogosLoteria;
import java.util.Arrays;
import java.util.Random;


public class Jogo {
	private int quantidadeDeNumeros;
	private int valorMaxParaJogo;
	private int[] jogos;
	

	
	public void setQuantidadeDeNumeros(int quantidadeDeNumeros,int valorMaxParaJogo) {
		this.quantidadeDeNumeros = quantidadeDeNumeros;
		this.valorMaxParaJogo = valorMaxParaJogo;
	}
	
	public void geradorJogos() {
		Random gerador = new Random();
		this.jogos = new int[this.quantidadeDeNumeros];
		for(int i = 0; i < this.jogos.length; i++) {
			this.jogos[i] = gerador.nextInt(this.valorMaxParaJogo + 1);
		}
		
	}
	
	
	public String toString() {
		return Arrays.toString(jogos);
	}
		
}
