package projeto;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//verificar se � impar ou par
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Write a number:");
		double num=sc.nextDouble();
		double rest=num%2;
		
		if(rest==0)
		{
			System.out.println("� par");
		}
		else
		{
			System.out.println("� impar");
		}
		sc.close();
	}

}
