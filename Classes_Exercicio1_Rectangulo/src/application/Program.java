package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Rectangle rec=new Rectangle();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		rec.width=sc.nextDouble();
		rec.height=sc.nextDouble();
		
		System.out.printf("Area = %.2f%n",rec.area());
		System.out.printf("Perimeter = %.2f%n",rec.perimeter());
		System.out.printf("Diagonal = %.2f%n",rec.diagonal());
	}

}
