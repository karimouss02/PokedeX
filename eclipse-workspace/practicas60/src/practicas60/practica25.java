package practicas60;

import java.util.Scanner;

public class practica25 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("intoduce el numero de filas que quieres");
	        int numerofilas = sc.nextInt();
	        int[] a = new int[1];
	        for (int i = 1; i <= numerofilas; i++) {
	            int[] x = new int[i];
	            for (int j = 0; j < i; j++) {
	                if (j == 0 || j == (i - 1)) {
	                    x[j] = 1;
	                } else {
	                    x[j] = a[j] + a[j - 1];
	                }
	                System.out.print(x[j] + " ");
	            }
	            a = x;
	            System.out.println(" Fila: "+i);
	        }
	    }
}
