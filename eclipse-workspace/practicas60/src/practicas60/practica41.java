package practicas60;

import java.util.Arrays;
import java.util.Scanner;

public class practica41 {
	public static void main (String []args)  {
		int t [] = {1,2,3,4,5,6,7,8,9};
		shuffle(t);
	}
	public static void shuffle(int t[])  {
		Scanner sc =new Scanner(System.in);
			 for(int j=0;j< (t.length) ;j++) {
				 int random= (int) (Math.random()*(t.length));
				 int random2= (int) (Math.random()*(t.length));
				 int a = t[random] ;
				 t[random]=t[random2];
				 t[random2]=a;
		 }
System.out.println(Arrays.toString(t));
	}
	}
	
	
	

