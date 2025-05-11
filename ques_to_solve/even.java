package ques_to_solve;
import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first range");
        System.out.println("from:");
        int from_1=sc.nextInt();
        System.out.println("to:");
        int to_1=sc.nextInt();
        System.out.println("enter second range");
        System.out.println("from:");
        int from_2=sc.nextInt();
        System.out.println("to:");
        int to_2=sc.nextInt();
        for(int i=from_1;i<=to_1;i++){
            if(i%2==0)
            System.out.println(i+" = even");
        }
        for(int i=from_2;i<=to_2;i++){
            if(i%2==0)
            System.out.println(i+" = even");
         }

    }
}
