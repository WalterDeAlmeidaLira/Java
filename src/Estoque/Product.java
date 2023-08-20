package Estoque;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString(){
		return "produto data: " + this.name + ", $ " + String.format("%.2f",this.price) + ", "
				+ this.quantity + " units, " +" Total: $ "+ String.format("%.2f",totalValueInStock());
	}
}
