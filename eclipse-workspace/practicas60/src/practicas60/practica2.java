package practicas60;
import java.util.Scanner;

public class practica2 {
	  public static void main(String [] agrs){
		  
	      Scanner sc = new Scanner(System.in);
	      
	      
	      System.out.println("Escribe un numero entero: ");
	      
	      int entero = sc.nextInt();
	      
	      int incognita = entero % 7;
	      
	      int suma= 7 - incognita;
	     
	      if(suma==7) {
	    	  System.out.println("el numero ya es multiplo de 7");
	      }
	      else {
	    	  System.out.println("para que sea multiplo de 7 hay que sumar: " + suma);
	      }
	      
	      sc.close();
	    }
}

