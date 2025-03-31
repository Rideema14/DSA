import java.util.Scanner;
public class library1{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
  System.out.println("enter number of days overdue:");
	double days=sc.nextInt();
    System.out.println("enter type of book(1=regular,2=fictional,3=reference):");
    int type =sc.nextInt();
  switch(type){
    case 1:System.out.println("late fees is:"+days*0.50) ;break;
    case 2:System.out.println("late fees is:"+ days*0.75);break;
    case 3:System.out.println("late fees is:"+ days*0.0);break;
  
  }
}
}