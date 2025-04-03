package loops;

import java.util.Scanner;

public class primechecker {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check");
        int n=sc.nextInt();
    
            boolean isPrime = true;
            for(int j=2; j*j<=n; j++){
                if(n % j == 0) {
                isPrime = false;
                }
            }
            if(isPrime) {
                System.out.println(" is Prime number"+ n);
            }
            else System.out.println("not a prime number");
          }
       }
    

