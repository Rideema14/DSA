package ques_to_solve;

public class alternate_prime {
     public static void main(String[] args) {
        int arr[] =new int[100];
        int count=0;
        for (int j = 1; j <= 100; j++) {
             boolean isPrime = true;
            for (int i = 2; i*i <= j; i++){
                if (j % i == 0) {
                    isPrime=false;}}
              if(isPrime) {
             arr[count]=j;
             count++;
              // System.out.println(j+" is prime");
            }}
              for (int k =1; k<count; k++){
                if(k%2!=0){
                    System.out.println(arr[k]);
                }
              }
}
}
