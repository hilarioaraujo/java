package projeto;

/* importa classe da biblioteca do java*/

// Crtl+shift+f para alinhar todas as linhas

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Olá Mundo");
		
		byte x=126;
		boolean completed = false;
		char gender = 'F';
		char letter= '\u0041';
		int n2= 1000;
		
		float n8=5.21359f;
		//necessário colocar f para o programa interpretar como float
		float n5=4.5f;
		double n6=4.5;
		
		//parse muda o tipo de variavel
		//sysout crtr+espaço - completa o controlo
		System.out.println("------------------------------");
		System.out.printf("%.4f%n",n8);
		System.out.println(completed);
		System.out.println(x+gender+letter+n2+n5+n6);
		sc.close();
		//mudar virgula para ponto
		//Locale.setDefault(Locale.);
	}

}
