/**
 *
 * @author Budi
 */

import java.util.*;

public class InputOutput1 {
	public static void main(String args[])
	{
                Scanner inputKalimat = new Scanner(System.in);
                int jumlah = 0;
                
                String kalimat = inputKalimat.nextLine();
                String[] arrkata = kalimat.split("[, ?.@']+");
                int jumlahKata = (kalimat.split("[, ?.@']+")).length;
                
                System.out.println(jumlahKata);
		for (String a : arrkata){
			System.out.println(a);
	} 
    }

}
