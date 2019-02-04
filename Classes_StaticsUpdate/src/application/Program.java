package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius=sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		System.out.printf("Circumference: %.2f%n",c);
		
		double v = Calculator.volume(radius);
		System.out.printf("Volume: %.2f%n",v);
		
		System.out.printf("PI value: %.2f%n",Calculator.PI);
		
		sc.close();
	}
	
}
