package programación;

import java.util.Scanner;

public class practica4 {
	public static void main (String[] args ) {
		System.out.println("Introduce a que año estamos");
		Scanner sc=new Scanner (System.in);
		int añoActual= sc.nextInt();
		System.out.println("Introduce cuando naciste");
		int añoNacimiento= sc.nextInt();
		int resultado= añoActual-añoNacimiento;
		System.out.println("tu edad es "+ resultado);

}
}
