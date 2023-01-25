package practicas60;

import java.util.Scanner;

public class practica35 {
	static int minDiferencia(int hora1, int minuto1, int hora2, int minuto2) {
		
		
		int solucionHo1= hora1*60;
	
		int solucionHo2= hora2*60;
		
		int solucionHo= Math.abs(solucionHo1-solucionHo2);
		
		int resultado= Math.abs(minuto1-minuto2)+solucionHo;
		
		
		return(resultado);
	}
	
	public static void main (String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("intoduce las primeras horas: ");	
		int hora1= sc.nextInt();
		
		System.out.println("intoduce los primeros minutos: ");	
		
		int minuto1= sc.nextInt();
		
		System.out.println("intoduce las segundas horas: ");	
		int hora2= sc.nextInt();
		
		System.out.println("intoduce los  segundos minutos: ");	
		
		int minuto2= sc.nextInt();

		System.out.println(minDiferencia(hora1,minuto1,hora2,minuto2)+" minutos de diferencia");
	}
}
