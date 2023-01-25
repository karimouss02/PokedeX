package practicas60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class practica43 {
	public static void main (String[]args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<String> nombre = new ArrayList<String>();  
		ArrayList<Integer> salarios = new ArrayList<Integer>();
		boolean vueltas=true;
		while(vueltas==true){
			System.out.print("introduce la persona  ");
			String persona= sc.next();
			System.out.print("su salario  ");
			int salario= sc.nextInt();
			if(salario>0) {
			nombre.add(persona);
			salarios.add(salario);
			}
			else {
				vueltas=false;	
			}
		}
		Iterator<String> nombreIterator = nombre.iterator();
		Iterator<Integer> salariosIterator = salarios.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			int po = salariosIterator.next();
			System.out.print("\n"+"nombre: "+elemento+"\n");
			System.out.print(""+"salario: "+po+" euros"+"\n");
		}
		int b=0;
		int a= (int)(salarios.size()-1);
		Collections.sort(salarios);
		Comparator<Integer> comparador = Collections.reverseOrder();
		Collections.sort(salarios, comparador);
		System.out.print("\n"+"ordenado sería "+salarios);
		System.out.print("\n"+"el maximo es: "+salarios.get(0)+" euros "+"\n"+"el minimo es: "+salarios.get(a)+" euros ");
		for(int i=0;i<a;i++) {
			int c= salarios.get(i);
			 b=b+c;
		}
		System.out.println("\n"+"la media es: "+(b/a));
	}
}
