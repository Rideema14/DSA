package ques_to_solve;
import java.util.Scanner;

public class DigitExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            number = -number;
        }
        if (number == 0) {
            System.out.println("Digit: 0");
        } else {
           
            String digits = "";

            while (number > 0) {
                int digit = number % 10;
                digits = digit + " "+digits ;
                number = number / 10;
            }

            System.out.println("Digits in the number: " + digits);
        }

        scanner.close();
    }
}
