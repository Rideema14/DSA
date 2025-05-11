package loops;
import java.util.Scanner;
public class power{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number a");
        int a =sc.nextInt();
       long powers=a;
    
        powers=powers*a;
       
       System.out.println(powers);
    }
}
