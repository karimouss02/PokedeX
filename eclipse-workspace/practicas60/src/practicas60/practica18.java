package practicas60;

import java.util.Scanner;

public class practica18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num2 = (int)(Math.random()*(99-1+1)+1);
		
		int num1 = (int)(Math.random()*(99-1+1)+1);
		
		System.out.println("suma los siguientes numeros: "+num1+" "+num2);
		
		int resultado=sc.nextInt();
		
		if(resultado==(num1+num2)) {
			System.out.println("bien echo sabes sumar ");
		}
		else {
			System.out.println("ni sumar sabes bobisimo el resultado es: "+(num1+num2));
		}
		
		sc.close();
	}
	
}
