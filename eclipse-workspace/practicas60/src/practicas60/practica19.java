package practicas60;

import java.util.Scanner;

public class practica19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num2 = (int)(Math.random()*(99-1+1)+1);
		
		int num1 = (int)(Math.random()*(99-1+1)+1);
		
		int operacion = (int)(Math.random()*(3-1+1)+1);
		
		if(operacion==1) {
			System.out.println("suma los siguientes numeros: "+num1+" "+num2);
			
			int resultado=sc.nextInt();
			
			if(resultado==(num1+num2)) {
				System.out.println("bien echo sabes sumar ");
			}
			else {
				System.out.println("ni sumar sabes bobisimo el resultado es: "+(num1+num2));
			}
		}
		else if(operacion==2) {
			System.out.println("resta los siguientes numeros: "+num1+" "+num2);
			
			int resultado=sc.nextInt();
			
			if(resultado==(num1-num2)) {
				System.out.println("bien echo sabes restar ");
			}
			else {
				System.out.println("ni restar sabes bobisimo el resultado es: "+(num1-num2));
			}
		}
		else if(operacion==3) {
			System.out.println("multliplica los siguientes numeros: "+num1+" "+num2);
			
			int resultado=sc.nextInt();
			
			if(resultado==(num1*num2)) {
				System.out.println("bien echo sabes multipicar ");
			}
			else {
				System.out.println("ni multipicar sabes bobisimo el resultado es: "+(num1*num2));
			}
		}
		
		sc.close();
	}
}
