package Estoque;

import java.util.Locale;
import java.util.Scanner;

public class TestaEstoque {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		Product produto = new Product();
		System.out.println("Name: ");
		produto.name = leitor.nextLine();
		System.out.println("Price: ");
		produto.price = leitor.nextDouble();
		System.out.println("Quantity in stock:  ");
		produto.quantity = leitor.nextInt();
		
		System.out.println(produto.toString());
		
		System.out.println("Enter the number of products to be added in stock: ");
		int addStock = leitor.nextInt();
		produto.addProduct(addStock);
		System.out.println(produto.toString());
		System.out.println("Enter the number of products to be removed from stock: ");
		addStock = leitor.nextInt();
		produto.removeProduct(addStock);
		System.out.println(produto.toString());
		
		leitor.close();
	}
}
