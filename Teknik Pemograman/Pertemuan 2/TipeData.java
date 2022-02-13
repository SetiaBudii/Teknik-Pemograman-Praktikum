import java.util.*;
import java.math.BigInteger;

public class TipeData {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int JumlahAngka = in.nextInt();

        BigInteger[] BIGG = new BigInteger[JumlahAngka];

        for(int i=0;i<JumlahAngka;i++){
            BigInteger x = in.nextBigInteger();
            BIGG[i] = x;
        }

        System.out.println();

        for(int i=0;i<JumlahAngka;i++){
            if(BIGG[i].compareTo( BigInteger.valueOf(-129) ) == 1 && BIGG[i].compareTo( BigInteger.valueOf(128) ) == -1 ){
                System.out.println(BIGG[i] + " can be fitted in:\n*Byte\n*Short\n*Int\n*Long" );
            }else if(BIGG[i].compareTo( BigInteger.valueOf(-32769) ) == 1 && BIGG[i].compareTo( BigInteger.valueOf(32768) ) == -1 ){
                System.out.println(BIGG[i] + " can be fitted in:\n*Short\n*Int\n*Long" );
            }else if(BIGG[i].compareTo( BigInteger.valueOf(-2147483649L) ) == 1 && BIGG[i].compareTo( BigInteger.valueOf(2147483648L) ) == -1 ){
                System.out.println(BIGG[i] + " can be fitted in:\n*Int\n*Long" );
            }else if(BIGG[i].compareTo( BigInteger.valueOf(-9223372036854775808L) ) == 1 && BIGG[i].compareTo( BigInteger.valueOf(9223372036854775807L) ) == -1 ){
                System.out.println(BIGG[i] + " can be fitted in:\n*Long" );
            }else{
                System.out.println(BIGG[i] + " can't be fitted anywhere.");
            }
           System.out.println(); 
        }
        
    }
}