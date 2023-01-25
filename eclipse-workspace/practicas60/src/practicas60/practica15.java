package practicas60;

import java.util.Scanner;

public class practica15 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        String[] unidades = { "cero" , "uno" , "dos" , "tres" , "cuatro" , "cinco" , "seis" , "siete" , "ocho" , "nueve" };
        
        String[] decenas = { "","diez" , "veinte" , "treinta" , "cuarenta" , "cincuenta" , "sesenta" , "setenta" , "ochenta" , "noventa" };
        
        System.out.println("Introduce un numero del 1 al 99");
        
        int num= sc.nextInt();
        
        int dec=num/10;
        
        int uni=num%10;
        
 if(num<0) {
	 System.out.println("ese nuero no vale mierda");
 }
 else {
	 
        if(num>=11&&num<=15) {
        	switch(num) {
        	case 11: System.out.println("el numero 11 es once");break;
        	case 12: System.out.println("el numero 12 es doce");break;
        	case 13: System.out.println("el numero 13 es trece");break;
        	case 14: System.out.println("el numero 14 es catorce");break;
        	case 15: System.out.println("el numero 15 es quince");break;
        	}
        }
        else if(num>20&&num<30){
        	switch(num) {
        case 21: System.out.println("el numero 21 es veintuno");break;
    	case 22: System.out.println("el numero 22 es veintidos");break;
    	case 23: System.out.println("el numero 23 es veintitres");break;
    	case 24: System.out.println("el numero 24 es veinticuatro");break;
    	case 25: System.out.println("el numero 25 es veinticinco");break;
    	case 26: System.out.println("el numero 26 es veintiseis");break;
    	case 27: System.out.println("el numero 27 es veintisiete");break;
    	case 28: System.out.println("el numero 28 es veintiocho");break;
    	case 29: System.out.println("el numero 29 es veintinueve");break;
    	}
        }
        	else if(dec==0){
        		System.out.println("El numero " + num + " es " + unidades[ uni ]);
        	}
        	else {
        		System.out.println("El numero " + num + " es " + decenas[ dec ] + " y " + unidades[ uni ]);
        	}
	}
        }
        	
        	
	}


