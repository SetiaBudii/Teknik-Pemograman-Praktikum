/**
 *
 * @author Budi
 */

import java.util.*;

public class Berhitung {
    public static void main(String args[]){
       Scanner inputUser = new Scanner(System.in);
       
       int angkaSatu = inputUser.nextInt();
       String operator = inputUser.next();
       int angkaDua = inputUser.nextInt();
       
       int hasil;
       if(null != operator)switch (operator) {
            case "+":
                hasil = angkaSatu+angkaDua;
                System.out.println(hasil);
                break;
            case "-":
                hasil = angkaSatu-angkaDua;
                System.out.println(hasil);
                break;
            case "*":
                hasil = angkaSatu*angkaDua;
                System.out.println(hasil);
                break;
            case "/":
                hasil = angkaSatu/angkaDua;
                System.out.println(hasil);
                break;
            case "%":
                hasil = angkaSatu%angkaDua;
                System.out.println(hasil);
                break;
            default:
                break;
        }
    }
}
