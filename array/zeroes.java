package array;

import java.util.Scanner;

public class zeroes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemts in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int nonzero=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
         if (arr[i] != 0) arr[i]=nonzero;
         
        else if(i!=nonzero)
        {arr[i]=0;
        nonzero++;}
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            
        }
    }
