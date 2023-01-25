package programación;

import java.util.Scanner;

public class practica6 {
	public static void main (String[] args ) {
		System.out.println("Introduce un número real");
		Scanner sc=new Scanner (System.in);
		double numero1= sc.nextDouble();
		System.out.println("Introduce otro número real");
		double numero2= sc.nextDouble();
		double resultado= (numero1+numero2)/2; 
		System.out.println("tu media es "+ resultado);

}
}
