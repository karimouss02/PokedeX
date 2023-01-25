package programación;

import java.util.Scanner;

public class practica7 {
	public static void main (String[] args ) {
		System.out.println("Introduce el radio de el circulo");
		Scanner sc=new Scanner (System.in);
		double numero1= sc.nextDouble();
		double resultado= 3.14*2*(numero1);
		double resultado1= 3.14*numero1*numero1;
		System.out.println("tu circunferencia mide  "+ resultado);
		System.out.println("tu area es  "+ resultado1);

}
}
