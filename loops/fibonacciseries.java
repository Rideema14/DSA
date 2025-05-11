package loops;
import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("number of terms");
      int n=sc.nextInt();
    int till=n;
    int a=1;
    int b=2;
    int sum=0;
    System.out.print(a+" "+b+" ");
    for(int i=1;i<till;i++){
        sum=a+b;
        System.out.print(sum+" ");
        a=b;b=sum;
        
    }
    }}
