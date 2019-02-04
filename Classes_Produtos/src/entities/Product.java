package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock()
	{
		return quantity*price;
	}
	
	public void addProducts(int quantity)
	{
		//especifica o atibuto da classe
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity)
	{
		this.quantity-=quantity;
	}
	
	//para mostrar a string completa e direira da Class Product
	public String toString()
	{
		return name + ", " + String.format("%.2f",price) + "€, " + quantity +" units, Total: "+ String.format("%.2f",TotalValueInStock()) + "€";
	}
}
