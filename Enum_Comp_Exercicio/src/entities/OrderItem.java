package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	private Product product;

	public OrderItem(Integer quantaty, Double price, Product product) {
		this.quantity = quantaty;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantaty() {
		return quantity;
	}

	public void setQuantaty(Integer quantaty) {
		this.quantity = quantaty;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return product.getName()
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
	

}
