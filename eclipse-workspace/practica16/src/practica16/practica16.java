package practica16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class practica16 {
	public static void main (String[] args) {
	
Scanner sc=new Scanner (System.in);
	
	Date año= new Date();
	
	SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy" ) ;
	
	String Año= sdf.format(año);
	
	int Añoentero = Integer.parseInt(Año);
	
	System.out.println("Introduce el año que naciste");
	
	int añoNacimiento= sc.nextInt();
	
	int resultado= Añoentero-añoNacimiento;
	
	System.out.println("Sin contar los meses tienes  "+ resultado);
	
	System.out.println("Introduce el mes que naciste");
	
	int MesNacimiento= sc.nextInt();
	
	SimpleDateFormat sdfa = new SimpleDateFormat ( "MM" ) ;
	
	Date mes= new Date();
	
	String Mes= sdfa.format(mes);
	
	int mesEntero = Integer.parseInt(Mes);
	
	int resultado2= mesEntero-MesNacimiento;
	
	if (resultado2==0) {
		
		System.out.println("introduce el dia que naciste");
		
		int DiaNaciste= sc.nextInt();
		
		SimpleDateFormat sdfam = new SimpleDateFormat ( "dd" ) ;
		
		Date dia= new Date();
		
		String Dia= sdfam.format(dia);
		
		int diaEntero = Integer.parseInt(Dia);
		
		int resultado3= diaEntero-DiaNaciste;
		
		if (resultado3==0) {
				
				System.out.println("feliz cumple");
		}
		else {
			System.out.println("hoy no es tu cumple");

		}
			
	}
	else {
		
				System.out.println("hoy no es tu cumple");
		}
	sc.close();
	}

}


