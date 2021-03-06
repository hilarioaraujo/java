package entities;

public class Product {

	String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	public double TotalValueInStock() {
		return quantity * price;
	}

	public void addProducts(int quantity) {
		// especifica o atibuto da classe
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// para mostrar a string completa e direira da Class Product
	public String toString() {
		return name + ", " + String.format("%.2f", price) + "�, " + quantity + " units, Total: "
				+ String.format("%.2f", TotalValueInStock()) + "�";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
