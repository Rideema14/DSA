package array;
import java.util.Scanner;
public class target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemts in array");
        int n =sc.nextInt();
        System.out.println("enter target");
    int  k=sc.nextInt();
int [] arr = new int[n];
for(int i = 0; i< arr.length; i++){
    arr[i]=sc.nextInt();}
int left =0;
int right=n-1;
int sum =arr[left]+arr[right];
    while( left<=right ){
        if (sum==k) {
        System.out.println(arr[left]+","+arr[right]+"="+k +"traget achived");
            left++;
            right--;}
    else if(sum>k) {
            right--;
        }
        else if(sum<k){
            left++;
        }
        else
        System.out.println("tatget not achived");

        sc.close();
    }
    

    //     if(arr[i]+arr[j]==k){
    //         System.out.println(arr[i]+","+arr[j]+"="+k +"traget achived");
    //     }
    //     else{
    //         System.out.println("target not achived");
    //    }

    
    }


}
