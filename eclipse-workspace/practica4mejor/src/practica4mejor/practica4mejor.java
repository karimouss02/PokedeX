package practica4mejor;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class practica4mejor {
	public static void main (String[] args ) {
		
		Scanner sc=new Scanner (System.in);
		Date Fecha= new Date (); 
		SimpleDateFormat FormatoAnyo= new SimpleDateFormat( "yyyy" );
		String añoActual= FormatoAnyo.format(Fecha);
		int AñoEntero = Integer.parseInt(añoActual);
		
		System.out.println("Introduce cuando naciste");
		int añoNacimiento= sc.nextInt();
		int resultado= AñoEntero-añoNacimiento;
		System.out.println("tu edad es "+ resultado);
		
		

}
}