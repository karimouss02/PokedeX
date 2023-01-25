package practicaSorpresa1;

import java.text.SimpleDateFormat;
import java.util.Date;
public class practicaSorpresa1 {

	public static void main (String[] args ) {
		 Date Fecha= new Date ();
		 SimpleDateFormat sdf = new SimpleDateFormat ( " EEEE  dd / MMMM / yyyy " ) ;
	      String año= sdf.format(Fecha);
	      System.out.println ( año ) ;
	    
}
}
