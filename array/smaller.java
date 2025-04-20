package array;
import java.util.Scanner;
public class smaller{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elemts in array");
    int n = sc.nextInt();
    int[] num = new int[n];

    for (int i = 0; i < num.length; i++) {
        num[i] = sc.nextInt();
    }
    System.out.print("output"+"[");
    for(int i=0;i<num.length;i++){
        int  count=0;
        for(int j=0;j<num.length;j++){
        if(num[j]<num[i])count++;
        }
        // System.out.println(count+" numbers are smaller than"+num[i]);
        num[i]=count;
        System.out.print(num[i]+" ");
    }
    System.out.println("]");
  

    }}
