package practicas60;

import java.util.Scanner;

public class practica20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce cuantos grados tiene tu circulo");

		double grados = sc.nextFloat();
		
		double pi= 3.141516;
		
		double radianes =    grados *(pi/180);
	
		System.out.println(radianes);
		sc.close();
	}
	
}
