package programación;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class practica16 {
public static void main (String[] args) {
		
		Scanner sc=new Scanner (System.in);
			
			Date año= new Date();
			
			int salir=0;
				
			SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy" ) ;
			
			String Año= sdf.format(año);
			
			int Añoentero = Integer.parseInt(Año);
			
			System.out.println("Introduce el año que naciste");
			
			int añoNacimiento= sc.nextInt();
			
			int resultado= Añoentero-añoNacimiento;
			
			while (resultado<1) {
				
				System.out.println("no hemos llegado a ese año tontito introduce otro valor ");
				
				añoNacimiento= sc.nextInt();
				
				 resultado= Añoentero-añoNacimiento;
			}
			
			while (resultado>1) {
			
				System.out.println("Introduce el mes que naciste");
			
				int MesNacimiento= sc.nextInt();
			
				SimpleDateFormat sdfa = new SimpleDateFormat ( "MM" ) ;
			
				Date mes= new Date();
			
				String Mes= sdfa.format(mes);
			
				int mesEntero = Integer.parseInt(Mes);
			
				int resultado2= mesEntero-MesNacimiento;
				
				resultado= -7;
			
				while(MesNacimiento>12||MesNacimiento<1) {
				
					System.out.println("ese mes no existe introduce un nuevo valor ");
					
					MesNacimiento=sc.nextInt();
					
					resultado2= mesEntero-MesNacimiento;
				}
				
				while(MesNacimiento<13&&MesNacimiento>0) {
					
					if (resultado2==0) {
						
						System.out.println("introduce el dia que naciste");
				
						int DiaNaciste= sc.nextInt();
						
						resultado2=1000000000;
						
						while (DiaNaciste<1||DiaNaciste>31) {
							
							System.out.println("ese dia no existe tontito introduce otro dia");
							
							DiaNaciste= sc.nextInt();
						}
						
						while ((DiaNaciste>1||DiaNaciste<31)&&salir!=1) {
							
							
							
							SimpleDateFormat sdfam = new SimpleDateFormat ( "dd" ) ;
							
							Date dia= new Date();
					
							String Dia= sdfam.format(dia);
					
							int diaEntero = Integer.parseInt(Dia);
					
							int resultado3= diaEntero-DiaNaciste;
							
							if (resultado3==0) {
								
								System.out.println("feliz cumple");
								salir=1;
								break;
								
							}
							else  {
								System.out.println("hoy no es tu cumple");
								 salir=1;
								break;
							}
							
							}
						}
				   else if(resultado2!=0&&resultado2!=1000000000) {
					System.out.println("hoy no es tu cumple");
					break;

				}
					}
			
				
			
				
						
					
			}
	}
}
