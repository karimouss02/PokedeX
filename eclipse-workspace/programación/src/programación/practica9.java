package programación;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class practica9 {
	public static void main (String[] args ) {
		Scanner sc=new Scanner (System.in);
		Date año= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy" ) ;
		String Año= sdf.format(año);
		int entero = Integer.parseInt(Año);
		System.out.println("Introduce cuando naciste");
		int añoNacimiento= sc.nextInt();
		int resultado= entero-añoNacimiento;
		System.out.println("tu edad es "+ resultado);
		boolean Mayor =resultado>=18;
        System.out.println("¿Eres mayor de edad?: " + 	Mayor);
        
}
}
