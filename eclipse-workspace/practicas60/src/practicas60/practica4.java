package practicas60;

import java.util.Scanner;

public class practica4 {
	public static void main (String[] args ) {
		System.out.println("Introduce la altura (m)");
		Scanner sc=new Scanner (System.in);
		double altura= sc.nextDouble();
		System.out.println("Introduce la base (m)");
		double base= sc.nextDouble();
		double resultado= (base*altura)/2;
		System.out.println("el area de tu triangulo es "+ resultado+" metros cuadrados (m^2)");
sc.close();
}
}
