package practicas60;

import java.util.Scanner;

public class practica34 {

	public static int hola (int horas, int minutos, int dias) {
		
		
		int solucionHo= horas*3600;
		
		int solucionMin=minutos*60;
		
		int solucionDia= dias*24*3600;
		
		int resultado= solucionHo+solucionMin+solucionDia;
		
		return(resultado);
	}
	
	public static void main (String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("intoduce las horas: ");	
		int horas= sc.nextInt();
		
		System.out.println("intoduce los minutos: ");	
		
		int minutos= sc.nextInt();
		System.out.println("intoduce los dias: ");	
		
		int dias= sc.nextInt();

		System.out.println(hola(horas,minutos,dias));
	}
}
