package array;

import java.util.Scanner;

public class current {
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemts in array");
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("enter the elements of array 2");
        int m=sc.nextInt();
        int[]index=new int[m];
        for ( int i= 0; i< index.length; i++) {
            index[i]=sc.nextInt();
        }
        int[] target = new int[n];
        boolean insert =false;
        for(int i=0;i<num.length;i++){
        if(n<m)
        target[i]=num[i];
        else if()
        target[i]=index[i];
        }
        for(int i=0;i<target.length;i++){
            System.out.print(target[i]+" ");
        }
    
    }
}