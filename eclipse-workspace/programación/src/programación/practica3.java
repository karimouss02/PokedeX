package programación;

import java.util.Scanner;

public class practica3 {
	public static void main (String[] args ) {
		System.out.println("Introduce un número real");
		Scanner sc=new Scanner (System.in);
		int numero1= sc.nextInt();
		System.out.println("Introduce otro número real");
		int numero2= sc.nextInt();
		int resultado= numero1+numero2; 
		System.out.println("tu suma es "+ resultado);

}
}
