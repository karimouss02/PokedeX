package programación;

import java.util.Scanner;

public class practica11 {
	public static void main(String[] args) {
        float numero;
        System.out.println("Dime un numero");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextFloat();
        int redondeao = (int) Math.round(numero);    
        System.out.println("Redondeado es: " +redondeao);
        entrada.close();
}

}
