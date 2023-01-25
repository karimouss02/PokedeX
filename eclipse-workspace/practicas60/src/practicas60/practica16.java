package practicas60;

import java.util.Scanner;

public class practica16 {
	public static void main (String[] args ) {
		Scanner sc=new Scanner (System.in);
		
		for(int i=0; i<=100000000; i++) {
			
		System.out.println("Introduce la altura (m) numero positivo");
		
		double altura= sc.nextDouble();
		
		System.out.println("Introduce la base (m)numero positivo");
		
		double base= sc.nextDouble();
		
			
		if (altura<0) {
			
			System.out.println("esa altura no vale es negativo vuelve a introducirlo");
				altura= sc.nextDouble();
		}
		
		
		 if(base<0) {
			
			System.out.println("esa base no vale es negativo vuelve a introducirlo");
			base= sc.nextDouble();
		}
		
		if(altura>0&&base>0) {
			
		double resultado= (base*altura)/2;
		
		System.out.println("el area de tu triangulo es "+ resultado+" metros cuadrados (m^2)");
		
		break;
}
		
}
		sc.close();
	}
}
