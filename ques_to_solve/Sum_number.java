package ques_to_solve;
import java.util.Scanner;
public class Sum_number{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

             int sum = 0;
             int count=0;
            while (number > 0) {
                int digit = number % 10;
                 sum = sum + digit;
                number = number / 10;
                count++;
            }
            System.out.println(sum);
            System.out.println(count);
           
    }
}