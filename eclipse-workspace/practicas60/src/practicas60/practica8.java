package practicas60;

import java.util.Scanner;

public class practica8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce cuantas hormigas has capturado");

		int hormigas = sc.nextInt();

		System.out.println("introduce cuantas arañas has capturado");

		int arañas = sc.nextInt();

		System.out.println("introduce cuantas cochinillas has capturado");

		int cochinillas = sc.nextInt();

		int patas1 = hormigas*6;

		int patas2 = arañas *8;

		int patas3 = cochinillas*14 ;
		
		int resultado= patas1+patas2+patas3;

		System.out.println("has capturado: "+hormigas+" hormigas por lo que tienes: "+patas1+" patas de hormiga");
		
		System.out.println("has capturado: "+arañas+" arañas por lo que tienes: "+patas2+" patas de araña");
		
		System.out.println("has capturado: "+cochinillas+" cochinillas por lo que tienes: "+patas3+" patas de cochinilla");
		
		System.out.println("en total tienes: "+resultado+" patas en total");
		sc.close();
	}
}
