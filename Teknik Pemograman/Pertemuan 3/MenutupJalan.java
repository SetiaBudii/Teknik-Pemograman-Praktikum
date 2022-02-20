/**
 *
 * @author Budi
 */
import java.util.*;

public class MenutupJalan {
    public static void main(String args[]){
        Scanner inputAngka = new Scanner(System.in);
            long[] nomorPlat = new long[4];
            
            for(int counter = 0 ; counter < 4; counter++){
                nomorPlat[counter] = inputAngka.nextLong();
            }
            
            long hasil = (Long.valueOf(String.valueOf(nomorPlat[0])+ String.valueOf(nomorPlat[1])+String.valueOf(nomorPlat[2])+String.valueOf(nomorPlat[3])));
             
            System.out.println(hasil);
            if(hasil % 5 == 0){
                System.out.println("berhenti");
            }else{
                System.out.println("jalan");    
            }
    }
}
