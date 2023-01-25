package practicas60;

import java.util.Scanner;

public class practica21 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero para convertir a binario: ");
		
		int num =  sc.nextInt();
		
		String x = Integer.toBinaryString(num);
		
		int y = x.length();
		
			
		  for(int i=0;i<y;i++){
			  
		     System.out.println(x.charAt(i));
		  }
		}
	}