package array;
import java.util.Scanner;
public class palidrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemts in array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length - 1;
            if (arr[left] == arr[right]) {
                System.out.println("it is a palidrome");
            }
            else
            System.out.println("not a palidrome");

        sc.close();
    }
  
}