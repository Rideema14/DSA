package array;
import java.util.Scanner;
public class richest{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements in a array");
    int m=sc.nextInt();
    System.out.println("enter number of elements in a sub array");
    int n = sc.nextInt();
    int [][] main_array =new int[m][n];
    int[]sums=new int[m];
    for (int i = 0; i <m; i++) {
        int sum =0;
        System.out.println("enter the elements of "+(i+1));
        for ( int j= 0; j<n; j++){
        main_array[i][j] =sc.nextInt();
        sum=sum+main_array[i][j];
        }
        sums[i]=sum;
    }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(main_array[i][j] + " + ");
            }
            System.out.println(" = "+sums[i]);
        }
        int max=0;
for (int i = 0; i < main_array.length; i++) {
    if(sums[i]>max)
    max=sums[i];
}
System.out.println("richist is ="+max);
        sc.close();
}
}