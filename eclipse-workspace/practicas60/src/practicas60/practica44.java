package practicas60;
import java.util.Scanner;
public class practica44 {
	public static void main (String[]args) {
		Scanner sc =new Scanner(System.in);
		int array[][][]= new int[6][6][6];
		for(int i=1;i<=3;i++) {
			for(int a=1;a<=5;a++) {
				System.out.println("para el trimestre: "+i+" introduce la nota del alumno: "+a);
				int nota= sc.nextInt();
				if(i==1)
					array[a][0][0]=nota;
				else if(i==2)
					array[0][a][0]=nota;
				else
					array[0][0][a]=nota;
			}
		}
		double sum1=0;double sum2=0;double sum3=0;
		for(int b=1;b<=5;b++) {
			sum1=(array[b][0][0])+sum1;
			sum2=(array[0][b][0])+sum2;
			sum3=(array[0][0][b])+sum3;
		}
		System.out.println("la media del primer trimestre es de: "+(sum1/5)+" la del segundo trimestre de: "+(sum2/5)+" y la del tercer trimestre de: "+(sum3/5));
	}
}
