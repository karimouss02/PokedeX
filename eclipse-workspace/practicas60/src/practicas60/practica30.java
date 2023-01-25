package practicas60;

import java.util.Scanner;

public class practica30 {
	public static void main(String[] args) {
        int num = 1;
        int numf = 0;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        
        String[] dinero = { "banco" , "hucha" , "bolsillo" , "cajon" , "ano" , "españa"};
        
        while (num != 0 && i <= (dinero.length)-1) {
        	
        	
            System.out.println("Dinero en " + dinero[i] );
            num = sc.nextInt();
            numf += num;
            i++;
        }
        System.out.println("dinero total "+numf);
	
	
	}
}
