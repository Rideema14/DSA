package ques_to_solve;
import java.util.Scanner;
public class reverse_number {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

    String digits = "";

            while (number > 0) {
                int digit = number % 10;
                digits = digits +digit ;
                number = number / 10;
            }

            System.out.println(  digits);
        }

}
