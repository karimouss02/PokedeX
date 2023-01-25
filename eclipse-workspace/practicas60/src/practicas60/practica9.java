package practicas60;

import java.util.Scanner;

public class practica9 {
	public static void main (String[] args ) {
		Scanner sc=new Scanner (System.in);
	System.out.println("introduce un numero mayor que 1 para hacer la raiz");
	
	int numero= sc.nextInt();
	double resultado = Math.sqrt(numero);
	System.out.println("la raiz de el numero: "+numero+" que has introducido es: "+resultado);
	sc.close();
}
}
