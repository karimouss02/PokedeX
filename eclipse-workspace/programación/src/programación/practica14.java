package programación;

import java.util.Scanner;

public class practica14 {
public static void main (String[] args) {
        
        boolean llueve, pro, marc, salir;
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Esta noche llueve?");
        
        llueve = sc.nextBoolean();
       
        System.out.println("has aprobado programación?");
        
        pro = sc.nextBoolean();
       
        System.out.println("Ehas aprobado lenguaje?");
        
        marc = sc.nextBoolean();
        
        salir=llueve&&(pro||marc);
        
        System.out.println(salir);
       
        sc.close();
       
}
}
