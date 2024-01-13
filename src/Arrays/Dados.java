package Arrays;

import java.util.Random;

public class Dados {
	public static void main(String[] args) {
		Random numAleatorio = new Random();
		int[] frequencia = new int[13];
		
		for (int i = 0; i < 36000; i++) {
			int dado1 = numAleatorio.nextInt(6) + 1;
			int dado2 = numAleatorio.nextInt(6) + 1;
			++frequencia[dado1 + dado2];
		}
		
		for (int i = 2; i < frequencia.length ; i++) {
			System.out.printf("%4d%10d\n",i,frequencia[i]);
		} 
		
	}
}
