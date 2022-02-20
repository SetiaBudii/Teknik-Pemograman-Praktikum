/**
 *
 * @author Budi
 */

import java.util.*;
import java.math.BigInteger;

public class BigIntegerSoal {
    public static void main(String args[]){
        Scanner inputAngka = new Scanner(System.in);
        
        BigInteger a = inputAngka.nextBigInteger();
        BigInteger b = inputAngka.nextBigInteger();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
    }
}
