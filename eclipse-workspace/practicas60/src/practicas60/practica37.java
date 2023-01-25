package practicas60;

import java.util.Scanner;

public class practica37 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un numero ");
        int num = sc.nextInt();
        System.out.print("introduce otro numero ");
        int num2 = sc.nextInt();      
        hola(num,num2);
        sc.close();
    }
	public static void hola (int num,int num2) {		
		int suma=0;
        int suma2=0;	
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) 
            	suma=suma+i;          	            
        }
		for (int i = 1; i <= num2; i++) {      
			if (num2 % i == 0) 
            	suma2=suma2+i;            
        }
		System.out.println(suma); 		
		System.out.println(suma2); 		
		if(suma==suma2) 
        	System.out.print("los numeros son amigos ");       	        
        else 
        	System.out.print("no son amigos ");
                       
	}
        
}
