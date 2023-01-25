package practicas60;

import java.util.Scanner;
public class practica39 {
	public static void main (String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("introduce las veces que aparecerán los numeros random");
		int veces=sc.nextInt();
		asele2(veces);
	}
	public static void asele2(int veces) {
		for(int i=0; i<veces; i++) {			
			double random= (Math.random());			
			System.out.println(random);			
		}
	}
}
