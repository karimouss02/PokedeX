package practicas60;

import java.util.Arrays;
import java.util.Scanner;

public class practica42 {
	public static void main (String []args)  {
		int t [] = {1,2,3,4,5,6,7,8,9};
		int t2 [] = {1,2,3,4,5,6,7,8,9};
		shuffle(t,t2);
	}
	public static void shuffle(int t[],int t2[])  {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i< (t2.length) ;i++) {
		t2[i]=t[i];
		}
		System.out.println(Arrays.toString(t2));
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
