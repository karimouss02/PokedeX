package practicas60;

import java.util.Scanner;

public class practica5 {
	public static void main (String[] args ) {
		
		System.out.println("dime el valor de a");
		
		Scanner sc=new Scanner (System.in);
		
		double a= sc.nextDouble();
		
		System.out.println("dime el valor de b");
		
		double b= sc.nextDouble();
		
		System.out.println("dime el valor de c");
		
		double c= sc.nextDouble();
		
		System.out.println("dime el valor de x");
		
		double x= sc.nextDouble();
		
		double Y=a*x*x + b*x +c;
		
		System.out.println("el valor segun los datos introducidos es de  "+ Y);
		
sc.close();
}
	
}
