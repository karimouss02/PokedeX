package practicas60;

import java.util.Scanner;

public class practica29 {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);

	        System.out.println("Primero numero ");
	        
	       int num1=sc.nextInt();
	       
	       double potencia= Math.pow(num1, (0.5));
	       
	       int numeroEntero= (int) potencia;
	       
	       int multiplicacion= (int) potencia* (int)potencia;
	       
	       int resto= num1-multiplicacion;
	       
	       System.out.println("El resultado es "+numeroEntero+" con resto de: "+resto);
	      
	            	
	            	}
 
}
