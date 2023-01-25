package practica19;

import java.util.Scanner;

public class practica19 {
	
		public static void main (String[] args) {
			
	Scanner sc=new Scanner (System.in);

		int i;
		
		System.out.println("cuantos intentos quieres");
		
		int a =sc.nextInt();
		
		System.out.println("Intenta adivinar el numero del 1-100, tienes "+a+" intentos");
		
		int numero= sc.nextInt();
		
		int resultado= (int)(Math.random() * 100);
		
		for(i=1; i<=a; i++) {
			
		if (resultado==numero) {
		
		System.out.println("Felicidades has adivinado el número: "+resultado);
		break;
		}
		else if(i==a) {
					System.out.println("demasiados intentos has perdido");
					break;
				}
		else if(i<10) {
			int b= a-i;
			System.out.println("prueba otra vez, te quedan: "+b+" intentos");
			
			
		if(resultado<numero) { 
		System.out.println("el número es menor");
		numero= sc.nextInt();
		}

		else if(resultado>numero) {
		System.out.println("el número es mayor");
		numero= sc.nextInt();
		}
		}
		sc.close();
		}
		
	}
	}

