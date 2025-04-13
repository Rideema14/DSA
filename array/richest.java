package array;
import java.util.Scanner;
public class richest{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements in a array");
    int m=sc.nextInt();
    System.out.println("enter number of elements in a sub array");
    int n = sc.nextInt();
    // int [][] main_array =new int[m][n];
    int[] arr1 = new int[n];
    int[] arr2= new int[n];
    int[]arr3=  new int[n];
    int sum1=0;int sum2=0;int sum3=0;
         
    System.out.println("enter the first sub array");
    for (int i = 0; i < arr1.length; i++) {
          arr1[i] =sc.nextInt();
       sum1=sum1+arr1[i];
     
    }
    System.out.println(sum1);
    System.out.println("enter the second  sub array");
    for ( int i= 0; i< arr2.length; i++) {
        arr2[i]=sc.nextInt();
        sum2=sum2+arr2[i];

    }
    System.out.println("enter the third  sub array");
    for ( int i =0; i<arr3.length; i++) {
        arr3[i]=sc.nextInt();
            sum3=sum3+arr3[i];
        }
         int[][] main_array = new int[3][n];
         main_array[0] = arr1;
         main_array[1] = arr2;
         main_array[2] = arr3;
         int[] sums={sum1,sum2,sum3};
         for (int i = 0; i < main_array.length; i++) {
            for (int j = 0; j < main_array[i].length; j++) {
                System.out.print(main_array[i][j] + " + ");
            }
            System.out.println(" = "+sums[i]); 
        }
        int max=0;
 for (int index = 0; index < main_array.length; index++) {
    if(sums[index]>max)
     max=sums[index];
 }
System.out.println("richist is ="+max);
        sc.close();
}
}