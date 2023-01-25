package programación;

import java.util.Scanner;

public class practica13 {
	public static void main (String[] args ) {
		Scanner sc=new Scanner (System.in);
	    System.out.println("cual es tu nota del primer trimestre");
	    
	    float primer= sc.nextFloat();
	    boolean MayorPrimero =primer>=5;
	    System.out.println("has aprobado?"+MayorPrimero);
	    System.out.println("cual es tu nota del segundo trimestre");
	    
	    float segundo= sc.nextFloat();
	    boolean MayorSegundo =segundo>=5;
	    System.out.println("has aprobado?"+MayorSegundo);
	    
	    System.out.println("cual es tu nota del tercero trimestre");
	    float tercero= sc.nextFloat();
	    boolean MayorTercero =tercero>=5;
	    System.out.println("has aprobado?"+MayorTercero);
	    
	    float NotaFinal=(primer+segundo+tercero)/3;
	    boolean NotaB =NotaFinal>=5;
	    System.out.println("has sacado como nota final "+NotaFinal+" por lo que has aprobado? "+NotaB);
	    sc.close();
        
}
}
