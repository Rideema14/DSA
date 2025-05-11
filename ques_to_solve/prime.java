package ques_to_solve;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        // int arr[] =new int[100];
       
        for (int j = 1; j <= 100; j++) {
             boolean isPrime = true;
            for (int i = 2; i*i <= j; i++){
                if (j % i == 0) {
                    isPrime=false;}}
              if(isPrime) {
                System.out.println(j+" is prime");
            }
            // else{
            //       System.out.println(j+" not prime");
            // }
        

        
    }

}
}