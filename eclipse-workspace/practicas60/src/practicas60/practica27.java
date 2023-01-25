package practicas60;

import java.util.Scanner;

public class practica27 {
	public static void main(String[] args) {       
		 
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("introduce un numero");
		
		  int num= sc.nextInt();
		  
		  System.out.println("introduce otro numero");
		  
		  int num2= sc.nextInt();
		  
		  int resultado;
		  
		  int resultado2=1;
		 
		 if (num<num2) {
			 
			 resultado=num;
		 }
		 else {
			 
			 resultado=num2;
		 }
		 int i=1;
		 for(; i<=resultado; i++) {
			 
			 int divisible1= num%i;
			 
			 int divisible2= num2%i;
			 
			if(divisible1==0&& divisible2==0) {
				
				System.out.println(i+" es divisible por los 2 numeros");
				
				 resultado2=i;
			}
		 }
		 System.out.println("el numero mayor divisor es "+(resultado2));
		  sc.close();
			    }
}
