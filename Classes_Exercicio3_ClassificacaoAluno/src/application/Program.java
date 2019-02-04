package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Student stu=new Student();
		System.out.println("Student Data:");
		System.out.println("Name: ");
		stu.name=sc.nextLine();
		
		System.out.println("Grade of First Semester: ");
		stu.grade1=sc.nextDouble();
		
		System.out.println("Grade of Second Semester: ");
		stu.grade2=sc.nextDouble();
		
		System.out.println("Grade of Thrird Semester: ");
		stu.grade3=sc.nextDouble();
		
		System.out.println("Final Grade= " + String.format("%.2g%n", stu.finalGrade()));
		
		if (stu.finalGrade()>=60.00) {
		System.out.println("Pass");	
		}
		else {
			System.out.println("Failed");
			System.out.println("Missing "+String.format("%.2g%n", stu.missingPoints()));
		}
		
		sc.close();
				
	}

}
