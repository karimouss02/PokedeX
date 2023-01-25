package practicas60;

import java.util.Scanner;

public class practica36 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce num ");
        int num = sc.nextInt();
        
        hola(num);
    }
	
	public static void hola (int num) {
		int contador = 0;
        int z = 0;
		for (int i = 1; i <= num; i++) {// Averiguas los divisores de un num
            if (num % i == 0) {
                contador++;
            }
        }
        int[] array = new int[contador];
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                array[z] = i;
                z++;
            }

        }
        boolean x = true;
        for (int i = 0; i < array.length; i++) {

            if ( array[i] == 2 ||array[i]==5) {
                x = true;

            } else if (array[i] == 1 ||array[i] == 4 || array[i] == 0)
                x = false;
            else {
                for (int j = 2; j < (array[i] / 2); j++) {
                    if ((array[i] % j) == 0)
                        x = false;

                }

            }
            if (x == true) {
                System.out.println(array[i] );

            }

            }
        

		
		
		
	}
}
