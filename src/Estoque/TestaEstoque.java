package Estoque;

public class TestaEstoque {
	public static void main(String[] args) {
		Product produto = new Product();
		produto.AddProduct(10,7.50);
		produto.RemoveProduct(5);
		produto.InsertNaame("refrigerante");
		System.out.println(produto.toString());
	}
}
