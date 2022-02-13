import java.util.Scanner;
import java.math.BigInteger;

public class Tipedata {
    public static void main(String[] args) {
        Scanner InputAngka = new Scanner(System.in);
    
        int JumlahAngka = InputAngka.nextInt();
        double Arrayx[]= new double[JumlahAngka];

        for(int i=0; i<JumlahAngka;i++){
            long x=InputAngka.nextLong();
            Arrayx[i]=x;
        }
        System.out.println();
        for(int i=0; i<JumlahAngka;i++){
            try{
                if(Arrayx[i]>=-128 && Arrayx[i]<=128){
                    System.out.println(Arrayx[i] + " can be fitted in:");
                    System.out.println("* Byte");
                    System.out.println("* Short");
                    System.out.println("* Int");
                    System.out.println("* Long");
                }else if(Arrayx[i]>=-32768 && Arrayx[i]<=32767){
                    System.out.println(Arrayx[i] + " can be fitted in:");
                    System.out.println("* Short");
                    System.out.println("* Int");
                    System.out.println("* Long");
                }else if(Arrayx[i]>=-2147483648 && Arrayx[i]<=2147483647){
                    System.out.println(Arrayx[i] + " can be fitted in:");
                    System.out.println("* Int");
                    System.out.println("* Long");
                }else if(Arrayx[i]>=-9223372036854775808L && Arrayx[i]<=9223372036854775807L){
                    System.out.println(Arrayx[i] + " can be fitted in:");
                    System.out.println("* Long");
                }
            }catch(Exception e){	
				System.out.println(Arrayx[i] + " can't be fitted anywhere.");
			}
            System.out.println();
        }


           /* */
        }
}
