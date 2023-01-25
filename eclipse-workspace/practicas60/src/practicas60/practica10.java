package practicas60;

import java.util.Scanner;

public class practica10 {
	public static void main (String[] args ) {
		Scanner sc=new Scanner (System.in);
	System.out.println("introduce un numero ");
	int numero= sc.nextInt();
	
	
	System.out.println("introduce otro numero ");
	int numero2= sc.nextInt();
	
	if(numero==numero2) {
		System.out.println("el numero es igual?: true");
	}
	else {
		System.out.println("el numero  es igual?: false");
	}
	
	sc.close();
}
}
