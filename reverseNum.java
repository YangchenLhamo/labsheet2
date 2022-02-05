package LABS_2;
import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        Scanner rr=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=rr.nextInt();
        rr.close();
        int rev=0, rem;
        while (num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("the reverse of "+ num+" is "+rev);
    }
}
