package practicas60;

import java.util.Scanner;

public class practica17 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero para sacar su valor absoluto");

		int numero=sc.nextInt();
		
		int numeroP=numero*-1;
		
		int resultado = numero>0? numero:numeroP;
		
		System.out.println("tu numero en valor absoluto es: "+resultado);
	}
}

