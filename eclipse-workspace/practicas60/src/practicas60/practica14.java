package practicas60;

import java.util.Scanner;

public class practica14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("cuanta comida hay(en kg)");
		
		double comidaDaily = sc.nextDouble();
		
		System.out.println("cuantos animales hay");
		
		double numAnimales = sc.nextDouble();
		
		System.out.println("cuantos kilos de comida come por animal ");
		
		double KilosPorAnimal = sc.nextDouble();
		
		double comidaAnimal=numAnimales*KilosPorAnimal ;
		
		double comidaSobra=comidaDaily-comidaAnimal;
		
		if(comidaDaily==0) {
			System.out.println("si no hay comida para dar a los animales pa que haces nada bobo");
		}
		else if(numAnimales==0) {
			System.out.println("si no hay animales para darle comida pa que haces nada bobo");
		}
		
		else if(KilosPorAnimal==0) {
			System.out.println("si no vas a darle de comer a los animales pa que haces na bobo");
		}
		else {
		if(comidaAnimal<=comidaDaily) {
			System.out.println("todos los animales comeran ese dia y sobrará "+comidaSobra+" kilos de comida");
		}
		else {
			double comidaFalta=comidaAnimal-comidaDaily;
			System.out.println("se necesitará mas comida para alimentar los animales, se necesitan: "+comidaFalta+" kilos mas para que todos coman");
		}
		}
		
	
		sc.close();
	}
}
