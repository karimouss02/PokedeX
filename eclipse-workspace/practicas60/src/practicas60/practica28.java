package practicas60;

import java.util.Scanner;

public class practica28 {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);

	        System.out.println("Primero numero ");
	        
	       int num1=sc.nextInt();
	       
	        System.out.println("Segundo numero ");
	        
	       int num2=sc.nextInt();
	       
	       int solución=1;
	       
	       int i=2;
	        while(i <= num1 || i <= num2)
	        	
	        {
	            if(num1%i==0 || num2%i==0){
	            	
	
	            solución=solución*i;
	            
	            if(num1%i==0){
	            	
	            	num1=num1/i;
	            }
	            	if(num2%i==0) {
	            		
	            		num2=num2/i;
	            	}

	            }
	            else
	                i=i+1;               
	        }                        
	        System.out.println("El minimo comun multliplo  es = " +solución);                                          
	        } 
}
