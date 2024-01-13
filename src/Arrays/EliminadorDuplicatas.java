package Arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EliminadorDuplicatas {
	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner leitor = new Scanner(System.in);
		int cont = 0;
		while(cont < num.length) {
			int entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 10 e 100"));
			if(entrada < 10 || entrada > 100)
				continue;
			boolean teste = false;
			for (int i = 0; i < num.length; i++) {
				if(entrada ==num[i]) {
					teste = true;
				}
			}
			
			if(!teste) {
				num[cont] = entrada;
				cont++;
			}			
		}
		
		for(int a : num) {
			System.out.printf("%3d - ", a);
		}
		
	}
}
