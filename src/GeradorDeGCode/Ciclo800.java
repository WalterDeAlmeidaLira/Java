package GeradorDeGCode;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
public class Ciclo800 {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.println("informe o tamanho da peca em x: ");
		double x = ler.nextDouble();
		x = 26 - (x/2);
		System.out.println("informe o tamanho da peca em  y: ");
		double y = ler.nextDouble();
		y = 26 - (y/2);
		System.out.println("informe o tamanho da ´peca em z: ");
		double z = ler.nextDouble();
		z += 5 + 62;
		
		FileWriter arq = new FileWriter("ciclo800.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.printf("CYCLE800(4,\"TABLE\",200000,27,%.2f,%.2f,%.2f,0,0,0,0,0,0,1,1,1)\n", x,y,z);
		gravarArq.printf("CYCLE800(4,\"TABLE\",200000,27,%.2f,%.2f,%.2f,0,0,0,0,0,0,1,1,1)\n", x,y,z);
		gravarArq.printf("CYCLE800(4,\"TABLE\",200000,27,%.2f,%.2f,%.2f,0,0,0,0,0,0,1,1,1)\n", x,y,z);
		arq.close();
	}
}
