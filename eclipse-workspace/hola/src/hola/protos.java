package hola;

import java.util.Scanner;

public class protos {

	public static void main (String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("protos o euros?");
		String variable= sc.next();
		String protos= "protos";
		String euros= "euros";
		if(variable.equals(protos)) {
			System.out.println("cuantas protos van a ser?");
			int numprotos= sc.nextInt();
			System.out.println("van a ser: "+(numprotos/160)+" deseos");
		}
		if(variable.equals(euros)) {
			System.out.println("cuanto dinero va a ser?");
			int numeuros= sc.nextInt();
			if(numeuros>1&&numeuros<5) 
				System.out.println("serán: "+(numeuros*60)+" protos");
			else if(numeuros>5&&numeuros<15)
				System.out.println("serán: "+(numeuros*60)+" protos");
			else if(numeuros>15&&numeuros<30)
				System.out.println("serán: "+(numeuros*60)+" protos");
			else if(numeuros>30&&numeuros<50)
				System.out.println("serán: "+(numeuros*60)+" protos");
			else if(numeuros>50&&numeuros<100)
				System.out.println("serán: "+(numeuros*60)+" protos");
			else if(numeuros<100)
				System.out.println("serán: "+(numeuros*60)+" protos");
		}
	}
}
