package practicas60;

import java.util.Scanner;

public class practica1 {
	public static void main (String[] args ) {
		System.out.println("Introduce un el precio a imponer IVA");
		Scanner sc=new Scanner (System.in);
		double numero1= sc.nextDouble();
		System.out.println("Introduce el IVA que quieres añadir al precio");
		double numero2= sc.nextDouble();
		double resultado= (numero2/100)*numero1;
		double resultado2=resultado+numero1;
		System.out.println("tu precio con el IVA añadido del "+numero2+"%"+" es "+ resultado2);
sc.close();
}
}
