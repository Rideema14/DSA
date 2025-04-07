package loops;

public class fibonacciseries {
    public static void main(String[] args) {
    
    int till=10;
    int a =1;
    int b=2;
    int sum=0;
    System.out.print(a+" "+b+" ");
    for(int i=1;i<till;i++){
        sum= a+b;
        System.out.print(sum+" ");
        a=b;b=sum;
        
    }
    }}
