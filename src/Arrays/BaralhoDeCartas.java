package Arrays;

import java.util.Random;

public class BaralhoDeCartas {
	private Carta[] baralho;
	private int proximaCarta;
	private static final int TOTAL_CARTAS = 52;
	private static final Random numerosAleatórios = new Random();
	
	public BaralhoDeCartas() {
		String[] valor = {"um","dois","tres","quatro","cinco","seis","sete",
				"oito","nove","dez","valete","dama","rei"};
		String[] naipe = {"copas","espadas","ouros","paus"};
		
		baralho = new Carta[TOTAL_CARTAS];
		proximaCarta = 0;
		
		for (int i = 0; i < baralho.length; i++) {
			baralho[i] = new Carta(valor[i % 13],naipe[i / 13]);
			System.out.println("mod: " + i % 13);
		}
				
	}
	
	public void embaralhar() {
		proximaCarta = 0;
		
		for (int i = 0; i < baralho.length; i++) {
			int selecao = numerosAleatórios.nextInt(TOTAL_CARTAS);
			Carta temp = baralho[i];
			baralho[i] = baralho[selecao];
			baralho[selecao] = temp;
		}
	}
	
	public Carta distribuirCartas() {
		if(proximaCarta < baralho.length) {
			return baralho[proximaCarta++];
		}else {
			return null;
		}
	}
}
