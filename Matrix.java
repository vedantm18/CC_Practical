import java.util.Scanner;
public class AddMatrix{

   static void addMatrix(int arr1[][],int arr2[][]){
      int arr3[][]=new int[3][3];

     for(int i=0;i<arr1.length;i++){
       for(int j=0;j<arr1[0].length;j++){
       arr3[i][j]=arr1[i][j]+arr2[i][j];
}
  
}
 for(int i=0;i<arr3.length;i++){
   for(int j=0;i<arr3[0].length;j++){
     System.out.println(arr3[i][j]);
   }
}

    
   }
public static void main(String args[]){
 int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
 int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
  addMatrix(arr1,arr2);
}
}
