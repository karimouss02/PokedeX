package practicas60;

import java.util.Scanner;

public class practica6 {
	public static void main (String[] args ) {
		Scanner sc=new Scanner (System.in);
	System.out.println("introduce los segundos");
	
	int segundos= sc.nextInt();
	
	int horas=segundos/3600;
	int restohoras=segundos%3600;
	
	int minutos=restohoras/60;
	
	int restominutos=restohoras%60;
	
	int segundos2=restominutos;
	System.out.println(segundos+" segundos son "+horas+" horas "+minutos+" minutos y "+segundos2+" segundos");
	sc.close();
}
}