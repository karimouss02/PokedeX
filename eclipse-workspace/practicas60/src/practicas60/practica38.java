package practicas60;

import java.util.Scanner;

public class practica38 {
	public static void main (String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("introduce el numero minimo de los numeros aleaorios");
		int minimo=sc.nextInt();
		System.out.println("introduce el numero maximo de los numeros aleaorios");
		int maximo=sc.nextInt();
		System.out.println("introduce las veces que aparecerán los numeros random");
		int veces=sc.nextInt();
		asele(minimo,maximo,veces);
	}
	public static void asele(int minimo,int maximo, int veces) {
		for(int i=0; i<veces; i++) {			
			int random=(int) (Math.random()* (maximo-minimo+1)+minimo);			
			System.out.println(random);
			
		}
	}

}
