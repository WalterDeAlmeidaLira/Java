package Arrays;

public class TesteBaralho {
	public static void main(String[] args) {
		BaralhoDeCartas bc = new BaralhoDeCartas();
		bc.embaralhar();
		
		for (int i = 0; i <= 52; i++) {
			System.out.printf("%-19s", bc.distribuirCartas());
			if( i % 4 == 0 ) {
				System.out.println();
			}
		}
	}
}
