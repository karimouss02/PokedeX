package practicas60;

import java.util.Scanner;

public class practica11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce una unidad en metros");

		float metros = sc.nextFloat();

		float centimetros = metros * 100;

		int centimetroentero=(int) centimetros;
	
		System.out.println(centimetroentero+" centimetros");
		sc.close();
	}
}
