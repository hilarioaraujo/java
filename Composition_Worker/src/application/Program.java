/*
 * Class Name            Program
 * 
 * Version information   1.0
 *
 * Date                  (05/02/2018 PT 14:44:00)
 * 
 * author                Hilário Araújo
 * Copyright notice      Execute the main code
 */

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String name = sc.nextLine();
		Department dep = new Department(name);

		System.out.print("Enter worker data: ");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base Salary: ");
		double salary = sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, dep);

		System.out.print("How many contracts have this worker? ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			HourContract contract = new HourContract(date, value, duration);
			worker.addContract(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String date2 = sc.next();
		int month = Integer.parseInt(date2.substring(0, 2));
		int year = Integer.parseInt(date2.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartement());
		System.out.println("Income for " + date2 + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}

}
