package LABS_2.Ternary;
import java.util.Scanner;
public class largest {
   public static void main (String[] args){
       Scanner ll=new Scanner (System.in);
       System.out.println("Enter the first number:");
       int a=ll.nextInt();
       System.out.println("Enter the second number:");
       int b=ll.nextInt();
       ll.close();
       String result=a>b? a+" is larger than "+b: b+" is greater than "+a;
       System.out.println(result);
   } 
}
