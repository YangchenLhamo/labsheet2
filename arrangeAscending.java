package LABS_2;
import java.util.Scanner;
public class arrangeAscending {
   public static void main(String[] args) {
       Scanner aa=new Scanner(System.in);
       System.out.println("enter the first number:");
       int a=aa.nextInt();
       System.out.println("enter the second number:");
       int b=aa.nextInt();
       System.out.println("enter the third number:");
       int c=aa.nextInt();
       aa.close();
       if(a>b){
           int temp=a;
           a=b;
           b=temp;
       }if(b>c){
           int temp=b;
           b=c;
           c=temp;
       }if(c>a){
           int temp=c;
           c=a;
           a=temp;
       }
       System.out.println("the numbers in ascending order are: "+"\n"+a+"\n"+b+"\n"+c);
   } 
}
