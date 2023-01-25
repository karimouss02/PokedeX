package practicas60;

import java.util.Scanner;

public class practica23 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las horas ");
		
		int horas= sc.nextInt();
		
		System.out.println("Introduce los minutos ");
		
		int minutos= sc.nextInt();
		
		System.out.println("Introduce los segundos ");
		
		int segundos= sc.nextInt();
		
		System.out.println("cuantos segundos quieres sumar? ");
		
		int SegIntroducidos= sc.nextInt();
		
		int resultadohoras= SegIntroducidos/3600;
		
		int resultado1= SegIntroducidos%3600;
		
		int resultadoMinutos= resultado1/60;
		
		int resultado2= resultado1%60;
		
		int final1=horas+resultadohoras;
		
		int final2=minutos+resultadoMinutos;
		
		int final3=segundos+resultado2;
		
		System.out.println("tu suma será: "+final1+"/"+final2+"/"+final3);
		
}
}
