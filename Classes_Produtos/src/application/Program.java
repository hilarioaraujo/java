package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name= sc.nextLine();
		System.out.println("Price: ");
		product.price= sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity= sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.println("Enter the number of product to be added in Stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Product data with new add products: " + product);
		
		System.out.println("Enter the number of product to be removed from Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Product data with removed products: " + product);
		sc.close();
	}

}
