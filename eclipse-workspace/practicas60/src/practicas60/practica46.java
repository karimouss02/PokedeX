package practicas60;
import java.util.Arrays;
import java.util.Scanner;
public class practica46 {
	public static void main (String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("largo ");
		int largo =sc.nextInt();
		int polola=0;
		int dato[]= new int[largo];
		int array[]=new int[largo];
		int i=0;
		for(int a=0; a<largo; a++) {
			System.out.println("introduce un dato a rellenar  ");
			int datos= sc.nextInt();
			if(datos>0) 
			dato[a]=datos;
			polola= ((dato[i])+(dato[(i+1)])+(dato[(i+2)]));
			for(;i<4; i++) {
				array[a]=((dato[i])+(dato[(i+1)])+(dato[(i+2)]));
			}
			i++;
			
		}
		System.out.println(Arrays.toString(dato));
		System.out.println(polola);
		
	}
	
}
