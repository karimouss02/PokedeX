package practicas60;

import java.util.Scanner;

public class practica29entregar {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("introduce un numero ");
	        
	       int num=sc.nextInt();
	       
	       int numeroAnterior=0;
	       
	       int [] resultado=new int [2];
	       
	       for(int i=1; i<num; i++) {
	    	   
	    	   int a= i*i;
	    	   
	    	   if(a==num) {
	    		   
	    		   resultado[0]=i;
	    		   
	    	   }
	    	   
	    	   else if(a>num) {
	    		   
	    		   resultado [0]=numeroAnterior;
	    		   
	    		   resultado [1]= num-(numeroAnterior*numeroAnterior);
	    		   
	    		   System.out.println(resultado[0]+" con resto de "+ resultado[1]);
	    		   
	    		   break;
	    	   }

	    	   numeroAnterior=i;

	       }

	       }
}
