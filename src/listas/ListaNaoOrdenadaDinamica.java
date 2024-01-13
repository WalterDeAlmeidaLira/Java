package listas;

import java.util.Scanner;

public class ListaNaoOrdenadaDinamica {
	//CALSSE QUE REPRESENTARA CADA ELEMENTO DA LISTA
	private static class Lista{
		public int num;
		public Lista proximo;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//LISTA VAZIA 
		// O OBJETO INICIO CONTERA O ENDERECO 
		// DO PRIMEIRO ELEMENTO DA LISTA 
		Lista inicio = null;
		
		//O OBJETO FIM CONTERÁ O ENDERCO 
		// DO ULTIMO ELEMENTO DA LISTA 
		Lista fim = null;
		
		//O OBJETO AUX É UM OBJETO AUXILIAR 
		Lista aux = null;
		
		//O OBJETO ANTERIRO É UM OBJETO AUXILIAR
		Lista anterior;
		
		// MENU DE OPCÕES		
		int op, numero, achou;
		
		do {
			System.out.println("\nMenu de Opções\n");
			System.out.println("\nMenu de Opções\n");
		}while(aux != null);
	}
}
