package array;
import java.util.Scanner;
public class sec_largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemts in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];}
              System.out.println(max);}
        int  max1=0;
         
        for (int i = 0; i< arr.length; i++) {
          max=Integer.MIN_VALUE;
          if( max1>max){
          max1=arr[i];
          }
        }
        System.out.println(max1);
        // for (int k= 0; k<arr.length; k++) {
    
        
  
          // }
      }
        }
    
    

