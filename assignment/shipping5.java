import java.util.Scanner;
public class shipping5 {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter weight of package(in pounds):");
    int weight=sc.nextInt();
    System.out.println("enter distance to be shipped(in miles)");
    float distance=sc.nextInt();
if(distance<=100 && weight<=10){
    System.out.println("cost="+5+"$");}

else if(distance>10 && distance<=500 && weight>10 && weight<20){
System.out.println("cost="+10+"$");}

else{
    System.out.println("cost="+20+"$");
}

}
}


