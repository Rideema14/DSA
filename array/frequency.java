package array;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemts in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();}
            for (int i = 0; i < arr.length; i++){
            int count = 1;
            boolean iscounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    iscounted = true;
                    break;
                }
            }
            for (int k = i + 1; k<arr.length; k++) {
                if (!iscounted) {
                    arr[i] = arr[k];
                    count++;
                }

            }
            System.out.println();        }

    }
}
