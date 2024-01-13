package ADO2_POO;

public class testeArea {
	public static void main(String[] args) {
		Trapezio trapezio = new Trapezio(1.0,2.0,5.0);
		trapezio.calculaArea();
		Triangulo tri = new Triangulo(10, 5);
		tri.calculaArea();
		TrianguloEquilatero te = new TrianguloEquilatero(2, 2);
		te.calculaArea();
		TrianguloRetangulo tr = new TrianguloRetangulo(5, 5);
		tr.calculaArea();
	}

	
}
