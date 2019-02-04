package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		Employee employee=new Employee();
		
		System.out.println("Enter Employee data: ");
		System.out.println("Name: ");
		employee.name= sc.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary= sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax= sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		
		System.out.println("Which percentage to increase salary: ");
		double percentage=sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + employee);
		System.out.println();
		sc.close();
	}

}
