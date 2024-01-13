package Arrays;

public class Carta {
	private String valor;
	private String naipe;
	
	public Carta(String valor, String naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}
	
	@Override
	public String toString() {
		return valor + " de " + naipe;
	}
}
