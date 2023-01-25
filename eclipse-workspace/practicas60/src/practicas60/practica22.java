package practicas60;

import java.util.Scanner;

public class practica22 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero para convertir a normal: ");
		
		String binario=sc.nextLine();
		
		System.out.println("tu numero es: "+Integer.parseInt(binario,2));
		
}
}
