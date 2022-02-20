public class MDArrayJava
{
    public static void main(String[] args)
    {
        //One Dimensional Arrays
        int[] fisrtArray = {2, 5, 3};      
        int[] secondArray = {9, 5, 3};    
        int[] thirdArray = {2, 4, 9};    
        int[] fourthArray = {10, 11, 12};    
        int[] fifthArray = {13, 14, 15};    
        int[] sixthArray = {16, 17, 18};    
        int[] seventhArray = {19, 20, 21};    
        int[] eighthArray = {22, 23, 24};    
        int[] ninthArray = {25, 26, 27};    
 
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
thirdArray}; 
 
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
sixthArray};
 
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
ninthArray};
 
        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1,
twoDimensionalArray2, twoDimensionalArray3};
         
       /*Menggunkan metode array 2D  
        for (int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                 if(i==0 && j==0){
                     System.out.printf("{{"+twoDimensionalArray1[i][j]+" ");
                 }else if(j==0){
                     System.out.printf("{"+twoDimensionalArray1[i][j]+" ");
                 }
                 else if(j==2 && i == 2){
                     System.out.printf(twoDimensionalArray1[i][j]+ " } }");
                 }else if (j==2){
                     System.out.printf(twoDimensionalArray1[i][j]+" } ");
                 }else{
                     System.out.printf(twoDimensionalArray1[i][j]+" ");
                 }
                 
             }
         }
         System.out.println();
         
         for (int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                 if(i==0 && j==0){
                     System.out.printf("{{"+twoDimensionalArray2[i][j]+" ");
                 }else if(j==0){
                     System.out.printf("{"+twoDimensionalArray2[i][j]+" ");
                 }
                 else if(j==2 && i == 2){
                     System.out.printf(twoDimensionalArray2[i][j]+ " } }");
                 }else if (j==2){
                     System.out.printf(twoDimensionalArray2[i][j]+" } ");
                 }else{
                     System.out.printf(twoDimensionalArray2[i][j]+" ");
                 }
                 
             }
         }
         
         System.out.println();
         
         for (int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                 if(i==0 && j==0){
                     System.out.printf("{{"+twoDimensionalArray3[i][j]+" ");
                 }else if(j==0){
                     System.out.printf("{"+twoDimensionalArray3[i][j]+" ");
                 }
                 else if(j==2 && i == 2){
                     System.out.printf(twoDimensionalArray3[i][j]+ " } }");
                 }else if (j==2){
                     System.out.printf(twoDimensionalArray3[i][j]+" } ");
                 }else{
                     System.out.printf(twoDimensionalArray3[i][j]+" ");
                 }
                 
             }
         }*/
         
          System.out.println();
          for(int k=0;k<3;k++){
            for(int i=0; i<3 ;i++){
                for(int j=0; j<3 ; j++){
                   if(i==0 && j==0){
                     System.out.printf("{{"+threeDimensionalArray[k][i][j]+" ");
                   }else if(j==0){
                     System.out.printf("{"+threeDimensionalArray[k][i][j]+" ");
                   }else if(j==2 && i == 2){
                     System.out.printf(threeDimensionalArray[k][i][j]+ " } }");
                   }else if (j==2){
                     System.out.printf(threeDimensionalArray[k][i][j]+" } ");
                   }else{
                     System.out.printf(threeDimensionalArray[k][i][j]+" ");
                   } 
                }
            }
            System.out.println();
          }
    }
}
