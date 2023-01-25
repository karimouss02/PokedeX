package practicas60;

import java.util.Scanner;

public class practica3 {
	 public static void main(String [] agrs){
		  
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Escribe un numero entero: ");
	      
	      int entero = sc.nextInt();
	      
	      System.out.println("Escribe el numero entero que quieras que sea multiplo:  ");
	      
	      int entero2 = sc.nextInt();
	      
	      int incognita = entero % entero2;
	      
	      int suma= entero2 - incognita;
	     
	      if(suma==entero2) {
	    	  System.out.println("el numero ya es multiplo de "+entero2);
	      }
	      else {
	    	  System.out.println("para que sea multiplo de "+entero2+"  hay que sumar: " + suma);
	      }
	      
	      sc.close();
	    }
}
