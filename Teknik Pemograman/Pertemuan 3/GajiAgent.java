/**
 *
 * @author Budi
 */
import java.util.*;

public class GajiAgent {
    public static void main(String args[]){
       Scanner inputUser = new Scanner(System.in);
       
       int itemTerjual = inputUser.nextInt();
       long pendapatanTotal;
       
       if(itemTerjual > 80){
           pendapatanTotal =((35/100)*500000)+((10/100)*(50000*itemTerjual))+500000;
           System.out.println(pendapatanTotal);
       }else if(itemTerjual > 40){
           pendapatanTotal =((25/100)*500000)+((10/100)*(50000*itemTerjual))+500000;
           System.out.println(pendapatanTotal);
       }else if(itemTerjual > 15){
           pendapatanTotal =(5000*itemTerjual)+500000;
           System.out.println(pendapatanTotal);
       }else if(itemTerjual < 15){
           pendapatanTotal = 500000 - (15-itemTerjual)*50000*15/100;
           System.out.println(pendapatanTotal);
       }
    }
}