package Estoque;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public double TotalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void InsertNaame(String name) {
		this.name = name;
	}
	
	public void AddProduct(int quantity, double price) {
		this.quantity += quantity;
		this.price = price;
	}
	
	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString(){
		return "produto: " + this.name + " preco: " + this.price + " quantidade: " + this.quantity;
	}
}
