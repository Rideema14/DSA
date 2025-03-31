import java.util.Scanner;
public class shopdiscount3 {
 public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of items:");
    int item=sc.nextInt();
    System.out.println("enter total price");
    float total_price=sc.nextInt();
if(total_price>100 && item>=5){
    float discount=total_price*10/100 ;
    System.out.println("discount="+discount+"$");
System.out.println(" price after discount="+(total_price-discount));}

else if(total_price<100 && total_price>=50){
 float discount=total_price*5/100 ; 
System.out.println("discount="+discount+"$");
System.out.println(" price after discount="+(total_price-discount));}

else{
    System.out.println("no discount"+" "+total_price+"$");
}

}
}
