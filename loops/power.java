package loops;
import java.util.Scanner;
public class power{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number a");
        int a =sc.nextInt();
        System.out.println("enter number b");
        int b =sc.nextInt();
       long powers= a^b;
       System.out.println(powers);
    }
}
