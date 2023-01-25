package practicas60;

import java.util.Scanner;
  
public class practica26 {
	 public static void main(String[] args) {       
		 
		 int num;
		    Scanner sc = new Scanner(System.in);
		    
		    num = sc.nextInt();
		    
		     System.out.println();
		    
		    for (int i = 1; i <= num; i++) {
		    	
		    	for (int k = 1; k <= num-i; k++) {
	                System.out.print(" ");
	            
		    	 }
		        for(int j = 1; j<=(i*2)-1;j++) {
		            
		            System.out.print("*");

		        }
		         System.out.println();
		    }
	 }
}