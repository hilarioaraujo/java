package projeto;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		String sentence= sc.nextLine();
		
		// guardar atrav�s de espa�os
		String x,y,z;
		x=sc.next();
		y=sc.next();
		z=sc.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x=sc.next();
		y=sc.next();
		z=sc.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
