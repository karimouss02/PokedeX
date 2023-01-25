package programación;

import java.util.Scanner;

public class practica17 {
public static void main (String[] args) {
		
		Scanner sc= new Scanner (System.in);

		int i;
	
		System.out.println("Intenta adivinar el numero del 1-100, solo tienes 10 intentos");
	
		int numero= sc.nextInt();
	
		int resultado= (int)(Math.random() * 100);
	
		for(i=0; i<=10; i++) {
		
			if (resultado==numero) {
	
				System.out.println("Felicidades has adivinado el número: "+resultado);
				break;
			}
			else if(i==10) {
				System.out.println("demasiados intentos has perdido");
				break;
			}
			else if(i<10) {
				System.out.println("prueba otra vez");
		
				if(resultado<numero) { 
					System.out.println("el número es menor");
					numero= sc.nextInt();
				}

				if(resultado>numero) {
					System.out.println("el número es mayor");
					numero= sc.nextInt();
				}	
			}
			sc.close();
		}
		
}
}
