package practicas60;

import java.util.Scanner;

public class practica33 {
	
public static int pares (int x1) {
		
		int resultado=0;
		
		for(int i=1; i<x1; i++) {
			
			if(i%2==0) {
				
				 resultado=i;
			}
			else
			System.out.println(resultado);
		}
		return(resultado);
	}
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un valor ");
		int x1=sc.nextInt();

		 pares(x1);
		 
		
	
	}
}
