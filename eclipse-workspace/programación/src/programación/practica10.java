package programación;

import java.util.Scanner;

public class practica10 {
	public static void main (String[] args ) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce un numero real");
		int numero1 = sc.nextInt();
		int calculo= numero1 %2;
		boolean parimpar=calculo<1;
		System.out.println("¿el numero es par? : "+ parimpar);
		sc.close();
}
}
