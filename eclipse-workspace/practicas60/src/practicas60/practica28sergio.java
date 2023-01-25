package practicas60;

import java.util.Scanner;

public class practica28sergio {
	public static void main(String[] args) {
	       
	int num;
    int i = 1;
    int aux = 0;
    boolean x = false;

    System.out.println("N");
    
    Scanner entrada = new Scanner(System.in);
    
    num = entrada.nextInt();
    
    System.out.println("N");
    
    int num2;
    
    num2 = entrada.nextInt();
    
    while (x == false) { // siempre que el boolean x sea false entrará aqui, no va a cambiar a true excepto q ya saque el resultado dentro del bucle
    	
        aux = num * i;//con esto sacamos la tabla de multlipicar del primer numero, es decir como i esta constantemente en aumento 
        			  //y se esta multlipicando a el numero introducido 1 en la primera vuelta es 1 en la segunda 2 asi hasta toda la tabla de el numero introducido
        
        if ((aux % num2) == 0) {// la variable aux cogera cada vez que el bucle se repita el valor de la tabla de multlipicar de el numero introducido x1 x2 x3 x4... estos valores
        						// se irán dividiendo a el segundo numero introducido intentando buscar el resto 0, si el resto es 0 ese es el minimo comun multiplo
        	
            x = true;// al ya haber cumplido la función el valor de x valdrá true por lo que en la siguiente vuelta como no es false y solo entra cua ndo es false no volverá a entrar
            
        } else {//si el numero i que esta en aumento su resto entre la division de el primer numero no es 0 no es mcm entonces entra aqui y aumenta i para que la siguiente vuelta coga otra división
            i++;
        }

    }
    System.out.println(aux);
}
}
