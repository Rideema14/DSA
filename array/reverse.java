package array;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int n=sc.nextInt();
int [] arr = new int[n];
for(int i = 0; i< n; i++){
    arr[i]=sc.nextInt();
}
System.out.println("reverse array");
for (int i = n-1; i >=0; i--) {
    System.out.println(arr[i]);
}
}
}