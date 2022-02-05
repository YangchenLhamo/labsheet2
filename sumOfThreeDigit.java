package LABS_2;
import java.util.Scanner;
public class sumOfThreeDigit {
    public static void main(String[] args) {
        Scanner oo=new Scanner (System.in);
        System.out.println("Enter a three digit number:");
        int num=oo.nextInt();
        oo.close();
        int sum=0, rem,temp=num;
        while (temp>0){
        rem=temp%10;
        sum=sum+rem;
        temp=temp/10;
    }
        System.out.println("The sum of "+num+" is " +sum);
        
    }
}
