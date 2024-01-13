package Arrays;

import java.util.ArrayList;

public class ClasseArrays {
	public static void main(String[] args) {
		ArrayList<String> itens = new ArrayList<String>();
		itens.add("Azul");
		itens.add(0,"Amarelo");
		
		for(String cor : itens) {
			System.out.println("Cor: " + cor);
		}
		
		itens.add("Verde");
		itens.add("Vermelho");
		itens.add("Violeta");
		
		itens.remove(1);
		itens.remove("violeta");
		
		for(String cor : itens) {
			System.out.println("Cor: " + cor);
		}
		
		int tamanhoItens = itens.size();
		System.out.println("Tamanho do array: " + tamanhoItens);
		
		boolean item = itens.contains("verde");
		
		if(item)
			System.out.println("Existe a cor verde");
		
				
	}
}
