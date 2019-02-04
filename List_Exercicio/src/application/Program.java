package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> emp = new ArrayList<>();

		//PART 1 - READING DATA
		
		System.out.print("How many employees will be registered? ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			emp.add(new Employee(id,name,salary));
		}
		
		//PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Enter the emplyee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee empl = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(empl!=null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			empl.increaseSalary(percentage);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		//PART 3 - LISTING EMPLOYEES
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee x : emp) {
			System.out.println(x);
		}

		sc.close();
	}

}
