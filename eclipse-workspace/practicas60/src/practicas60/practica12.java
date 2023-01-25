package practicas60;

import java.util.Scanner;

public class practica12 {
	
	public static void main(String[] args) {
		int N, aux, inverso = 0, cifra;
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Introduce un número >= 10: ");                                                 
            N = sc.nextInt();
         while (N < 10);
       
        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(N == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
        sc.close();
    }
	

}
