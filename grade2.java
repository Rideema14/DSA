import java.util.Scanner;
public class grade2{
 public static void main(String args[]) {
    System.out.println("enter your score:");
    Scanner sc=new Scanner(System.in);
    int score =sc.nextInt();
if(score<=100 || score>=90)
    System.out.println("grade A");
    

else if(score<90||score>=80 )
 System.out.println("grade B");
    

else if(score>=70||score<80)
System.out.println("grade C");
    

else if(score>=60||score<70 )
    System.out.println("grade D");
    

else if (score<60)
    System.out.println("grade F");
    
}
} 

