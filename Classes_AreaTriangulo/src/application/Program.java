package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc= new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Entre the measures of triangle X: ");
		x.a=sc.nextDouble();
		x.b= sc.nextDouble();
		x.c=sc.nextDouble();
				
		System.out.println("Entre the measures of triangle X: ");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
		//double p= (x.a+x.b+x.c)/2;
		//double areaX= Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		double areaX=x.area();
		
		//p= (y.a+y.b+y.c)/2;
		//double areaY= Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		double areaY= y.area();
		
		System.out.println("Área X: "+areaX);
		System.out.println("Área Y: "+areaY);
		
		if(areaX<areaY)
		{
			System.out.println("Larger area: Y");
		}
		else
		{
			System.out.println("Larger area: X");
		}
		sc.close();
	}

}
