package practica2;

import java.util.Scanner;

public class practica5 {
	public static void main (String[] args ) {
		System.out.println("Introduce un número de como maximo 127");
		Scanner sc=new Scanner (System.in);
		System.out.println("como por ejemplo entre estos numeros");
		System.out.println("byte\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
		byte minimo= -128;
		byte maximo= 127;
		int numero= sc.nextInt();
		if (minimo<numero) {
			System.out.println("este numero es muy grande");
		}
		if (maximo>numero) {
			System.out.println("este numero es muy pequeño");
		}
}
}

