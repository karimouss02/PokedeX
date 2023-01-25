package practicas60;

import java.util.Scanner;

public class practica7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce una unidad en milimetros");

		float milimetros = sc.nextFloat();

		System.out.println("introduce una unidad en centimetros");

		float centimetros = sc.nextFloat();

		System.out.println("introduce una unidad en metros");

		float metros = sc.nextFloat();

		float centimetro1 = milimetros / 10;

		float centimetro2 = metros * 100;

		float resultado = centimetros + centimetro1 + centimetro2;

		System.out.println(milimetros + " milimetro/s pasados a centimetros son: " + centimetro1 + " mas "
				 + metros + " metros pasado/s a centimetros son: "+ centimetro2 + " mas los centimetro que has intoducido " 
				+ centimetros + " da: " + resultado+ " son:");
		sc.close();
	}
}
