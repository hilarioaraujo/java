package exercicio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your full name:");
		String name=sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int bed = sc.nextInt();
		System.out.println("Enter product price:");
		double price= sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String last=sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(bed);
		System.out.println(price);
		System.out.println(price);
		System.out.println(last);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
	}

}
