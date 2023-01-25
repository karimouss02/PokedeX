package practica15;

import java.util.Scanner;

public class practica15 {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
        System.out.println("Dime un numero");
        
        int numero= sc.nextInt();
        
        System.out.println("Dime otro numero");
        
        int fin= sc.nextInt();
       
        while (numero<=fin) {
        	
        	for(int i=1; i<=10; ++i) {
        		System.out.println( numero + "x"+ i +"="+numero*i);
        		
        	}
        	numero++;
        }
       
       sc.close();
        }
}

