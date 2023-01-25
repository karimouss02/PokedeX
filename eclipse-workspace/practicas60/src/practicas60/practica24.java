package practicas60;

import java.util.Scanner;

public class practica24 {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	int divisor;// este será el numero que se dividirá el numero constantemente para saber si es primo o no que se ira incrementando hasta que sea= numero

	int contador;//esta variable sera que cada vez que el numero sea primo se ira sumando 1, sera la suma total de primos

	boolean primo; //para decir si es primo o no y que de funciones en base a ello

	contador=0;//se empieza con el contador a 0 

	System.out.print("Introduce un  numero: ");

	int numero =sc.nextInt();//variable que es el numero que voy a introducir para saber cuantos primos hay detras de este

	for(int i=1 ; i<=numero; i++){ //esto es para saber todos los numeros que hay entre 1 a el número

	primo=true;

	divisor=2;

	while (divisor<=i-1 && primo==true){//i en este bucle es el numero que es dividido que se comprobará si es primo o no

	if (i % divisor==0) {// si el numero i que se estará incrementando hasta llegar al numero introducido entre la variable divisor su resto sea 0, es decir no sea primo entra

	primo=false;//al no ser primo por haber entrado aqui por el anterior bucle la varable primo será false, es decir no es primo
				// por lo que en la siguiente vuelta del bucle no entrará aqui al haber dado la condicion que tiene que ser true.
	}
	divisor++;// la variable divisor se sumará para que se divida por el siguiente numero

	}
	if (primo==true){ //si es primo entra aqui, entrará todas las veces de los numeros entre 1 a el numero intodicido si cumplen el if

	contador++; // si es primo suma 1 a el contador

	System.out.println(i+(" es primo"));// escribe que es primo el numero
	}

	}
	System.out.println("Entre el numero 1 hasta el número: " + numero + " hay "+ contador + " números primos");

	sc.close();
	}
	}