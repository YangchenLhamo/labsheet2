package LABS_2;
import java.util.Scanner;
public class palindromNum {
    public static void main(String[] args) {
        Scanner pp=new Scanner (System.in);
        System.out.println("Enter a number:");
        int num=pp.nextInt();
        pp.close();
        int rem, rev=0;
        int temp=num;
        while(temp!=0){
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
        }
        if(num==rev){
            System.out.println(num +" is a palindrome number.");
        }
        else{
            System.out.println(num+" is not a plaindrome number.");
        }
    }
}
