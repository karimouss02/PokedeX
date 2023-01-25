package practicas60;

import java.util.Scanner;

public class practica13 {
	
	public static void main(String[]args) {
		
String [] letra =new String[23];

Scanner sc = new Scanner(System.in);

System.out.println("dame el numero DNI");

int DNI=sc.nextInt();

letra[0]="T";
letra[1]="R";
letra[2]="W";
letra[3]="A";
letra[4]="G";
letra[5]="M";
letra[6]="Y";
letra[7]="F";
letra[8]="P";
letra[9]="D";
letra[10]="X";
letra[11]="B";
letra[12]="M";
letra[13]="J";
letra[14]="Z";
letra[15]="S";
letra[16]="Q";
letra[17]="V";
letra[18]="H";
letra[19]="L";
letra[20]="C";
letra[21]="K";
letra[22]="E";

int valor=DNI % 23;

System.out.println(letra[valor]);

sc.close();

	}
}
