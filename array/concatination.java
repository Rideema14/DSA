package array;
import java.util.Scanner;
public class concatination {
public static void main(String[] args) {
  
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the elements of array 1");
    int n=sc.nextInt();
    int[]arr=new int[n];
    for ( int i = 0; i< arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    System.out.println("enter the elements of array 2");
    int m=sc.nextInt();
    int[]arr1=new int[m];
    for ( int i= 0; i< arr1.length; i++) {
        arr1[i]=sc.nextInt();
    }
    int[]arr_sum=new int[n+m];
    for ( int i =0; i<n; i++) {
        arr_sum[i]=arr[i]; 
        }

    for (int i=0;i<m;i++) {
        arr_sum[n+i]=arr1[i];
    }    
    
    
    for(int i=0;i<arr_sum.length;i++){
    System.out.print(arr_sum[i]+" ");
}
    
}

}    
