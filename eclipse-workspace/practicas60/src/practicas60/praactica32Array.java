package practicas60;

import java.util.Arrays;
import java.util.Scanner;

public class praactica32Array {
	
	public static String mostrarPares(int n) {
		
	    int[] array = new int[(n/2)+1];
	    
	    int j=0;
	    for (int i = 0; i <= n; i++) {
	        if (i%2==0) {
	            array[j]=i;
	            j++;
	        } 
	    }
	        return (Arrays.toString(array));    

	        } 

	public static void main (String [] args) {
	    Scanner  sc=new Scanner(System.in);
	    System.out.print("introduce un numero ");
	    int n=sc.nextInt();
	    mostrarPares(n);
	    System.out.println(mostrarPares(n));
	}
	}

