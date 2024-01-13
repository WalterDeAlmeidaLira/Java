package Arrays;

import java.util.Random;

public class FrequeciaDados {
	public static void main(String[] args) {
		Random random = new Random();
		int[] frequencia = new int[7];
		
		for(int i = 0; i < 6000; i++) {
			++frequencia[1 + random.nextInt(6)];
		}
		
		System.out.printf("%s%10s\n","Face","frequêcia");
		
		for (int i = 1; i < frequencia.length; i++) {
			System.out.printf("%4d%10d\n",i, frequencia[i]);
		}
	}
}
