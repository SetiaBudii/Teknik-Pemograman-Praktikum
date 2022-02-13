/*Nama        :Yayang Setia Budi
  Program     :ComparedString.java
  Version     :1.0
  Last Update :12/02/2022
*/  

import java.util.*;

public class ComparedString{
     public static void main(String args[]){ 
        Scanner in = new Scanner(System.in);

        String kal1=in.nextLine(); 
        String kal2=in.nextLine();
        System.out.println(kal2.length()+kal1.length());
            if(kal1.compareTo(kal2) == 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
             }
         System.out.println( kal1.substring(0,1).toUpperCase()+kal1.substring(1) + " " +kal2.substring(0,1).toUpperCase()+kal2.substring(1)  ); 
    }
}