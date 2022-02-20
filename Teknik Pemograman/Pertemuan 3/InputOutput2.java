import java.util.*;

public class InputOutput2 {
    public static void main(String args[]){
        try (Scanner inputUser = new Scanner(System.in)) {
            String[] kalimat = new String[3];
            int[] angka = new int[3];
            
            for(int i=0;i<3;i++){
                kalimat[i] = inputUser.next();
                angka[i] = inputUser.nextInt();
            }
            
            
            System.out.println("================================");
            for(int i=0;i<3;i++){
                if(angka[i]<10){
                    System.out.printf("%-16s"+"0"+"%d"+"0", kalimat[i], angka[i]);
                }
                else if(angka[i]<100){
                    System.out.printf("%-16s"+"0"+"%d", kalimat[i], angka[i]);
                }else{
                    System.out.printf("%-16s"+"%d", kalimat[i], angka[i]);
                }
                System.out.println();
            }
        }

        System.out.println("================================");
    }
}
