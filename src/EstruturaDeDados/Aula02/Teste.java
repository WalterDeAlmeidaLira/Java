package EstruturaDeDados.Aula02;

public class Teste {
	public static void main(String[] args)throws Exception {
		Vetor vetor = new Vetor(5);
		Vetor vetor2 = vetor;
		vetor.adiciona("Walter");
		vetor.adiciona("Victor");
		vetor.adiciona("Thiago");
		vetor.adiciona("Agda");
		System.out.println(vetor2.toString());
		System.out.println(vetor.busca(2));
		int busca = vetor.busca("wal");
		if(busca == -1) {
			System.out.println("Valor nao encontrado");
		}else {
			System.out.println(vetor.busca(busca));
		}		
		
	}
}
