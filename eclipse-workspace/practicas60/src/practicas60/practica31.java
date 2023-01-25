package practicas60;

import java.util.Scanner;

public class practica31 {
	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("introduce el radio para ");
		
        int num = sc.nextInt();
        
        int elevacion1= (int) Math.pow(num, 2);
        
        int elevacion2= (int) Math.pow(num, 3);
        
        double superficie= (4*Math.PI*elevacion1);
        
        double volumen= (((4*Math.PI)/3)*elevacion2);
        
        System.out.println("la superficie es: " +superficie);
        System.out.println("el volumen es: " +volumen);
	
	}
}
